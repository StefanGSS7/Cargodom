package cdom.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import cdom.RegistrationFormVariables;
import cdom.SeleniumSetup;

public class RegisterAsTransporter {


    static WebElement TAX_NUMBER, COMPANY_NAME, REGISTER_BUTTON_HOMEPAGE, REGISTER_IM_LOOKING_FOR_TRANSPORTER_BUTTON, FIRST_NAME, LAST_NAME, ADDRESS, CITY, ZIP_CODE, COUNTRY, PHONE_NUMBER, EMAIL, PASSWORD, CONFIRM_PASSWORD, AGREE;


    public static void registerAsTransporter(RegistrationFormVariables registrationFormVariables) throws InterruptedException {

        REGISTER_BUTTON_HOMEPAGE = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/nav/div[3]/ul/li[3]/a/span"));
        REGISTER_BUTTON_HOMEPAGE.click();
        REGISTER_IM_LOOKING_FOR_TRANSPORTER_BUTTON = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/button"));
        REGISTER_IM_LOOKING_FOR_TRANSPORTER_BUTTON.click();

        FIRST_NAME = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[1]/div[2]/input"));
        FIRST_NAME.sendKeys(registrationFormVariables.getFirstName());

        LAST_NAME = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[3]/div[2]/input"));
        LAST_NAME.sendKeys(registrationFormVariables.getLastName());

        COMPANY_NAME = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[5]/div[2]/input"));
        COMPANY_NAME.sendKeys(registrationFormVariables.getCompanyName());

        ADDRESS = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[7]/div[2]/input"));
        ADDRESS.sendKeys(registrationFormVariables.getAddress());

        CITY = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[9]/div[2]/input"));
        CITY.sendKeys(registrationFormVariables.getCity());

        ZIP_CODE = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[11]/div[2]/input"));
        ZIP_CODE.sendKeys(registrationFormVariables.getPostalCode());

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[13]/div[2]/country-selector/div/div[1]/span")).click();
        COUNTRY = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[13]/div[2]/country-selector/div/input[1]"));
        COUNTRY.sendKeys(registrationFormVariables.getCountry());
        COUNTRY.sendKeys(Keys.ENTER);

        TAX_NUMBER = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[15]/div[2]/input"));
        TAX_NUMBER.sendKeys(registrationFormVariables.getTaxNumber());

        PHONE_NUMBER = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[16]/div[2]/input"));
        PHONE_NUMBER.sendKeys(registrationFormVariables.getPhoneNumber());

        EMAIL = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[2]/div[2]/input"));
        EMAIL.sendKeys(registrationFormVariables.getEmailAsTransporter());

        PASSWORD = SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        PASSWORD.sendKeys(registrationFormVariables.getPassword());

        CONFIRM_PASSWORD = SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"confirmPassword\"]"));
        CONFIRM_PASSWORD.sendKeys(registrationFormVariables.getPassword());

        AGREE = SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"acceptTerms\"]"));
        AGREE.click();

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[2]/form/div[10]/input")).click();

    }

}
