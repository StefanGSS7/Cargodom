import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cdom.Automation.LoginLogout;
import cdom.Automation.SendSupportTicket;
import cdom.SeleniumSetup;

public class SendSupportTicketTests {

    @BeforeMethod
    public void init(){

        SeleniumSetup.init();

    }

    @Test(groups = "a")
    public void SEND_SUPPORT_TICKET_TEST() throws InterruptedException {
        LoginLogout.login("SK@brainster.com","asdqwe123");
        Thread.sleep(1000);
        SendSupportTicket.sendSupportTicket();
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div/div[1]")).isDisplayed());
    }


    @AfterMethod
    public void finish(){

        SeleniumSetup.finish();

    }

}
