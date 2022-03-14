package cdom.Automation;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cdom.SeleniumSetup;

public class SendSupportTicket {

    static WebElement CS_BUTTON, CS_QUESTION_SUBJECT_FIELD, CS_QUESTION_FIELD, CS_SUBMIT_MESSAGE;

    public static void sendSupportTicket() {

        CS_BUTTON = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[6]/a/span[2]"));
        CS_BUTTON.click();

        CS_QUESTION_SUBJECT_FIELD = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div/div[3]/div[1]/input"));
        CS_QUESTION_SUBJECT_FIELD.sendKeys(RandomStringUtils.randomAlphabetic(10));

        CS_QUESTION_FIELD = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div/div[3]/div[2]/textarea"));
        CS_QUESTION_FIELD.sendKeys(RandomStringUtils.randomAlphabetic(100));

        CS_SUBMIT_MESSAGE = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div/div[3]/button"));
        CS_SUBMIT_MESSAGE.click();



    }

}
