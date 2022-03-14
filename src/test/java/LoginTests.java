import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import cdom.Automation.LoginLogout;
import cdom.SeleniumSetup;


public class LoginTests {

    @BeforeMethod
    public void init(){

        SeleniumSetup.init();

    }

    @Test(priority = 440)
    public void VALID_CREDENTIALS_FOR_LOGIN_FORM_AS_LOOKING_FOR_TRANSPORTER() throws InterruptedException {
        LoginLogout.login("SK@brainster.com","asdqwe123");
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(), "http://18.156.17.83:9095/client/home");
    }

    @Test(priority = 450)
    public void VALID_CREDENTIALS_FOR_LOGIN_FORM_AS_TRANSPORTER() throws InterruptedException {
        LoginLogout.login("SK@brainster2.com","asdqwe123");
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(), "http://18.156.17.83:9095/provider/home");
    }

    @Test(priority = 460)
    public void INVALID_EMAIL_FOR_LOGIN_FORM() throws InterruptedException {
        LoginLogout.login("asd", "asdqwe123");
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div")).isDisplayed());
    }

    @Test(priority = 470)
    public void INVALID_PASSWORD_FOR_LOGIN_FORM() throws InterruptedException {
        LoginLogout.login("SK@brainster.com", "asd");
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div")).isDisplayed());
    }

    @Test(priority = 480)
    public void EMPTY_FIELDS_FOR_LOGIN_FORM() throws InterruptedException {
        LoginLogout.login("", "");
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div")).isDisplayed());
    }

    @Test(priority = 490)
    public void EMPTY_FIELD_FOR_EMAIL_LOGIN_FORM() throws InterruptedException {
        LoginLogout.login("", "asdqwe123");
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div")).isDisplayed());
    }

    @Test(priority = 500)
    public void EMPTY_FIELD_FOR_PASSWORD_LOGIN_FORM() throws InterruptedException {
        LoginLogout.login("SK@brainster.com", "");
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div")).isDisplayed());
    }


    @AfterMethod
    public void finish(){

        SeleniumSetup.finish();

    }

}
