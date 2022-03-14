package cdom.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cdom.SeleniumSetup;

public class LoginLogout {

    static WebElement LOGIN_BUTTON_HOMEPAGE, USERNAME, PASSWORD, LOGIN_BUTTON_FORM;

    public static void login(String email, String password){
        LOGIN_BUTTON_HOMEPAGE = SeleniumSetup.chromeDriver.findElement(By.id("login"));
        LOGIN_BUTTON_HOMEPAGE.click();

        USERNAME = SeleniumSetup.chromeDriver.findElement(By.id("username"));
        USERNAME.sendKeys(email);

        PASSWORD = SeleniumSetup.chromeDriver.findElement(By.id("password"));
        PASSWORD.sendKeys(password);

        LOGIN_BUTTON_FORM = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button"));
        LOGIN_BUTTON_FORM.click();
    }

    public static void logout(){

        SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();

    }

}
