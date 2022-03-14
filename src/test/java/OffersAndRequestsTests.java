import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cdom.Automation.OffersAndRequests;
import cdom.Automation.LoginLogout;
import cdom.RegistrationFormVariables;
import cdom.SeleniumSetup;

import java.util.ArrayList;
import java.util.List;

public class OffersAndRequestsTests {

    @BeforeMethod
    public void init(){

        SeleniumSetup.init();

    }

    @Test(groups = "a")
    public void CREATE_A_TRANSPORT_REQUEST_TEST() throws InterruptedException {

        RegistrationFormVariables rfm = new RegistrationFormVariables();

        LoginLogout.login(rfm.getCreatedAsLookingForTransporterEmail(), rfm.getAsTransporterAsUserpassword());
        String s = "";
        for (int i = 1; i <= 3; i++) {
            Thread.sleep(500);
            OffersAndRequests.createATransportRequest(i);
            s = s + SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/jhi-alert/div/div/div/div/pre")).isDisplayed() + " ";
        }
        Assert.assertEquals(s, "true true true ");

    }

    @Test
    public void FIND_REQUEST_BY_COUNTRY() throws InterruptedException {

        RegistrationFormVariables rfm = new RegistrationFormVariables();

        LoginLogout.login(rfm.getCreatedAsTransporterEmail(), rfm.getAsTransporterAsUserpassword());
        Thread.sleep(1000);
        OffersAndRequests.findRequest(rfm.getCountry(), rfm.getCountry());
        Thread.sleep(1000);
        String s = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[2]/request-list/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/span[1]/span[3]")).getText();
        s = s + SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[2]/request-list/div[2]/div[2]/table/tbody/tr[1]/td[3]/div/span[1]/span[3]")).getText();

        Assert.assertEquals(s, "MKMK");
    }

    @Test
    public void SEND_OFFER() throws InterruptedException {

        RegistrationFormVariables rfm = new RegistrationFormVariables();

        List<String> actualUrlList = new ArrayList<>();

        LoginLogout.login(rfm.getCreatedAsTransporterEmail(), rfm.getAsTransporterAsUserpassword());
        Thread.sleep(1000);


        for (int i = 1; i <= 2; i++) {
            OffersAndRequests.findRequest(rfm.getCountry(),rfm.getCountry());
            Thread.sleep(1000);
            OffersAndRequests.sendOffer(i);
            actualUrlList.add(SeleniumSetup.chromeDriver.getCurrentUrl());
        }

        Thread.sleep(1000);
        Assert.assertEquals(actualUrlList, OffersAndRequests.offerURL);
    }
    @Test
    public void ACCEPT_OFFER_TEST()throws InterruptedException{

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

    @AfterMethod
    public void finish(){

        SeleniumSetup.finish();

    }

}
