import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import cdom.Automation.*;
import cdom.RegistrationFormVariables;
import cdom.SeleniumSetup;

import java.util.ArrayList;
import java.util.List;


public class KeyFlowTest {

    RegistrationFormVariables registrationFormVariables;

    @BeforeClass
    public void init(){

        SeleniumSetup.init();
        registrationFormVariables = new RegistrationFormVariables();
    }

    @Test(priority = 610)
    public void REGISTER_AS_LOOKING_FOR_TRANSPORTER() throws InterruptedException {

            RegisterAsLookingForTransporter.registerLookingForTransporterPerson(1,registrationFormVariables);
            Thread.sleep(1000);

        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-client/client-successful-registration");

    }

    @Test(priority = 620)
    public void LOGIN_AS_LOOKING_FOR_TRANSPORTER() throws InterruptedException {
        LoginLogout.login(registrationFormVariables.getEmailAsLookingForTransporter(),registrationFormVariables.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(), "http://18.156.17.83:9095/client/home");
    }

    @Test(priority = 630)
    public void SEND_SUPPORT_TICKET() throws InterruptedException {
        SendSupportTicket.sendSupportTicket();
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div/div[1]")).isDisplayed());
    }

    @Test(priority = 640)
    public void CREATE_A_TRANSPORT_REQUEST() throws InterruptedException {
        String s = "";
        for (int i = 1; i <= 3; i++) {
            Thread.sleep(500);
            OffersAndRequests.createATransportRequest(i);
            s = s + SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/jhi-alert/div/div/div/div/pre")).isDisplayed() + " ";
        }
        Assert.assertEquals(s, "true true true ");

    }

    @Test(priority = 650)
    public void LOGOUT_AS_LOOKING_FOR_TRANSPORTER() throws InterruptedException {

       LoginLogout.logout();
       Thread.sleep(1000);
       Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/");

    }

    @Test(priority = 660)
    public void REGISTER_AS_TRANSPORTER() throws InterruptedException {

        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.getCurrentUrl().equals("http://18.156.17.83:9095/account-type/register-provider/provider-successful-registration"));

    }

    @Test(priority = 670)
    public void LOGIN_AS_TRANSPORTER() throws InterruptedException {
        LoginLogout.login(registrationFormVariables.getEmailAsTransporter(),registrationFormVariables.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(), "http://18.156.17.83:9095/provider/home");
    }

    @Test(priority = 675)
    public void FIND_REQUEST() throws InterruptedException {
        OffersAndRequests.findRequest(registrationFormVariables.getCountry(), registrationFormVariables.getCountry());
        Thread.sleep(1000);
        String s = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[2]/request-list/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span[1]/span[3]")).getText();
        s = s + SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[2]/request-list/div[2]/div[2]/table/tbody/tr[1]/td[3]/div/span[1]/span[3]")).getText();
        Assert.assertEquals(s, "MKMK");

    }

    @Test(priority = 680)
    public void SEND_OFFER() throws InterruptedException {
        RegistrationFormVariables rfm = new RegistrationFormVariables();

        List<String> actualUrlList = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            OffersAndRequests.findRequest(rfm.getCountry(),rfm.getCountry());
            Thread.sleep(1000);
            OffersAndRequests.sendOffer(i);
            actualUrlList.add(SeleniumSetup.chromeDriver.getCurrentUrl());
        }

        Thread.sleep(1000);
        Assert.assertEquals(actualUrlList, OffersAndRequests.offerURL);

    }

    @Test(priority = 690)
    public void LOGOUT_AS_TRANSPORTER() throws InterruptedException {
        LoginLogout.logout();
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/");

    }

    @Test(priority = 700)
    public void LOGIN_AS_LOOKING_FOR_TRANSPORTER_A_SECOND_TIME() throws InterruptedException {
        LoginLogout.login(registrationFormVariables.getEmailAsLookingForTransporter(),registrationFormVariables.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(), "http://18.156.17.83:9095/client/home");
    }

    @Test(priority = 710)
    public void ACCEPT_TWO_OFFERS() throws InterruptedException {

        RegistrationFormVariables rfm = new RegistrationFormVariables();

        List<String> actualUrlList = new ArrayList<>();

        LoginLogout.login(rfm.getCreatedAsLookingForTransporterEmail(), rfm.getAsTransporterAsUserpassword());
        for (int i = 1; i <= 2; i++) {
            Thread.sleep(1000);
            OffersAndRequests.acceptOffer(i);
            actualUrlList.add(SeleniumSetup.chromeDriver.getCurrentUrl());
        }
        Assert.assertEquals(actualUrlList, OffersAndRequests.expectedOffer);

    }

    @Test(priority = 715)
    public void DENY_ONE_OFFER() throws InterruptedException {

        OffersAndRequests.ignoreOffer();
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"");

    }


    @AfterClass
    public void finish(){

        SeleniumSetup.finish();

    }

}
