package cdom.Automation;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import cdom.SeleniumSetup;

import java.util.ArrayList;
import java.util.List;

public class OffersAndRequests {

    public static List<String> offerURL = new ArrayList<String>(),expectedOffer = new ArrayList<>();
    static WebElement COUNTRY;

    public static void createATransportRequest(int dropDownCategoryValue) throws InterruptedException {

        if (!SeleniumSetup.chromeDriver.getCurrentUrl().equals("http://18.156.17.83:9095/client/home")) {
            SeleniumSetup.chromeDriver.get("http://18.156.17.83:9095/client/home");
        }

        Thread.sleep(1000);
        SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"requestDetailsBtn\"]")).click();
        SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[2]/div[2]/input")).sendKeys(RandomStringUtils.randomAlphabetic(10));

        WebElement pickUpFrom = SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[4]/div[2]/place-search-field/input"));
        pickUpFrom.sendKeys("Macedonia");
        Thread.sleep(500);
        pickUpFrom.sendKeys(Keys.ARROW_DOWN);
        pickUpFrom.sendKeys(Keys.ENTER);
        WebElement deliverTo = SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[5]/div[2]/place-search-field/input"));
        deliverTo.sendKeys("Macedonia");
        Thread.sleep(300);
        deliverTo.sendKeys(Keys.ARROW_DOWN);
        deliverTo.sendKeys(Keys.ENTER);

        if (dropDownCategoryValue == 1) {

            Select dropDownTypeOfClient = new Select(SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"field_y\"]")));
            dropDownTypeOfClient.selectByIndex(dropDownCategoryValue);
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[1]/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[2]/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[3]/div[2]/textarea")).sendKeys(RandomStringUtils.randomAlphabetic(10));

            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 2; j++) {
                    SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[4]/div/div[" + i + "]/div[" + j + "]")).click();
                }
            }

            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"hasAdrLicence\"]")).click();
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"cachePickup\"]")).click();
            SeleniumSetup.chromeDriver.findElement(By.name("files")).sendKeys("C:\\ProfileImage.jpg");
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[14]/input")).click();
            Thread.sleep(500);
        } else if (dropDownCategoryValue == 2) {


            Select dropDownTypeOfClient = new Select(SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"field_y\"]")));
            dropDownTypeOfClient.selectByIndex(dropDownCategoryValue);
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[1]/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[2]/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[3]/div[2]/textarea")).sendKeys(RandomStringUtils.randomAlphabetic(10));

            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div[4]/div/div[1]/div[1]")).click();

            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"hasAdrLicence\"]")).click();
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"cachePickup\"]")).click();
            SeleniumSetup.chromeDriver.findElement(By.name("files")).sendKeys("C:\\ProfileImage.jpg");
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[14]/input")).click();
            Thread.sleep(500);
        } else if (dropDownCategoryValue == 3) {


            Select dropDownTypeOfClient = new Select(SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"field_y\"]")));
            dropDownTypeOfClient.selectByIndex(dropDownCategoryValue);

            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div/div[1]/div[2]/textarea")).sendKeys(RandomStringUtils.randomAlphabetic(10));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div/div[3]/div[2]/div[1]/div/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div/div[3]/div[2]/div[2]/div/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div/div[3]/div[2]/div[3]/div/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[10]/div/div[3]/div[2]/div[4]/div/div[2]/input")).sendKeys(RandomStringUtils.randomNumeric(3));
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"hasAdrLicence\"]")).click();
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"cachePickup\"]")).click();
            SeleniumSetup.chromeDriver.findElement(By.name("files")).sendKeys("C:\\ProfileImage.jpg");
            SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"newRequestForm\"]/div/div[14]/input")).click();
            Thread.sleep(500);
        }
    }

    public static void findRequest(String fromCountry, String toCountry){

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/nav/div[1]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[2]/div[1]/div/div[1]/country-selector/div/div[1]/span")).click();
        COUNTRY = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[2]/div[1]/div/div[1]/country-selector/div/input[1]"));
        COUNTRY.sendKeys(fromCountry);
        COUNTRY.sendKeys(Keys.ENTER);

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[2]/div[1]/div/div[2]/country-selector/div/div[1]/span")).click();
        COUNTRY = SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[2]/div[1]/div/div[2]/country-selector/div/input[1]"));
        COUNTRY.sendKeys(toCountry);
        COUNTRY.sendKeys(Keys.ENTER);

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[3]/a")).click();


    }

    public static void sendOffer(int i) throws InterruptedException {Thread.sleep(1000);
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/request-search-list/div[2]/request-list/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a")).click();
        Thread.sleep(2000);
        offerURL.add(SeleniumSetup.chromeDriver.getCurrentUrl());
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/button")).click();

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/div/div[2]/div[2]/table/tbody/tr/td[5]/input")).clear();

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/div/div[2]/div[2]/table/tbody/tr/td[5]/input")).sendKeys("1");

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/div/div[4]/div/div[1]/div[3]/input")).clear();

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/div/div[4]/div/div[1]/div[3]/input")).sendKeys("18.03.2022 00:00");

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/form/div/div[5]/button")).click();
        Thread.sleep(1000);
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
    }

    public static String acceptOffer(int i) throws  InterruptedException{

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[4]/a/span[2]")).click();
        expectedOffer.add(SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/request-list/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]")).getText());

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/request-list/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]")).click();
        Thread.sleep(1000);
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[6]/div[2]/div/div/div[2]/div/div[8]/a")).click();
        SeleniumSetup.chromeDriver.findElement(By.xpath("//*[@id=\"offer0\"]")).click();
        Thread.sleep(1000);
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[6]/div[2]/div/div/div[2]/div/div[10]/div/div/div/div[1]/div[2]/div[6]/input")).click();

        return SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/request-list/div[2]/div[2]/table/tbody/tr[1]/td[1]")).getText();

    }

    public static void ignoreOffer(){

        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[4]/a/span[2]")).click();
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/request-list/div[2]/div[2]/table/tbody/tr[3]/td[1]")).click();
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[6]/div[2]/div/div/div[2]/div/div[8]/a")).click();
        SeleniumSetup.chromeDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[2]/button")).click();

    }

}
