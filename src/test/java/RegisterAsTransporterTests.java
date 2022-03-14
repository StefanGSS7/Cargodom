import org.testng.annotations.*;
import cdom.Automation.RegisterAsTransporter;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import cdom.RegistrationFormVariables;
import cdom.SeleniumSetup;

public class RegisterAsTransporterTests {



    @BeforeClass
    public void init(){

        SeleniumSetup.init();

    }

    @Test(priority = 9999)
    public void VALID_INPUT_FOR_THE_FORM() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertTrue(SeleniumSetup.chromeDriver.getCurrentUrl().equals("http://18.156.17.83:9095/account-type/register-provider/provider-successful-registration"));

    }

    @Test(priority = 10)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_3_CHARACTERS_FOR_THE_INPUT_FIELD_FIRST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setFirstName(RandomStringUtils.randomAlphabetic(2));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 20)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_25_CHARACTERS_FOR_THE_INPUT_FIELD_FIRST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setFirstName(RandomStringUtils.randomAlphabetic(26));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 30)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_FIRST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setFirstName("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 40)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_FIRST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setFirstName("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 50)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_NUMERIC_CHARACTERS_FOR_THE_INPUT_FIELD_FIRST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setFirstName(RandomStringUtils.randomNumeric(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 60)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_3_CHARACTERS_FOR_THE_INPUT_FIELD_LAST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setLastName(RandomStringUtils.randomAlphabetic(2));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 70)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_25_CHARACTERS_FOR_THE_INPUT_FIELD_LAST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setLastName(RandomStringUtils.randomAlphabetic(26));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 80)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_LAST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setLastName("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 90)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_LAST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setLastName("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 100)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_NUMERIC_CHARACTERS_FOR_THE_INPUT_FIELD_LAST_NAME() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setLastName(RandomStringUtils.randomNumeric(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }


    @Test(priority = 110)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_3_CHARACTERS_FOR_THE_INPUT_FIELD_COMPANY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCompanyName(RandomStringUtils.randomAlphabetic(2));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 120)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_25_CHARACTERS_FOR_THE_INPUT_FIELD_COMPANY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCompanyName(RandomStringUtils.randomAlphabetic(26));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 130)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_COMPANY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCompanyName("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 140)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_COMPANY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCompanyName("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 150)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_NUMERIC_CHARACTERS_FOR_THE_INPUT_FIELD_COMPANY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCompanyName(RandomStringUtils.randomNumeric(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 160)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_3_CHARACTERS_FOR_THE_INPUT_FIELD_ADDRESS() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setAddress(RandomStringUtils.randomAlphabetic(2));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 170)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_25_CHARACTERS_FOR_THE_INPUT_FIELD_ADDRESS() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setAddress(RandomStringUtils.randomAlphabetic(26));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 180)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_ADDRESS() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setAddress("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 190)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_ADDRESS() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setAddress("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 200)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_NUMERIC_CHARACTERS_FOR_THE_INPUT_FIELD_ADDRESS() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setAddress(RandomStringUtils.randomNumeric(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }


    @Test(priority = 210)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_3_CHARACTERS_FOR_THE_INPUT_FIELD_CITY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCity(RandomStringUtils.randomAlphabetic(2));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 220)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_25_CHARACTERS_FOR_THE_INPUT_FIELD_CITY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCity(RandomStringUtils.randomAlphabetic(26));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 230)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_CITY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCity("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 240)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_CITY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCity("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 250)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_NUMERIC_CHARACTERS_FOR_THE_INPUT_FIELD_CITY() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setCity(RandomStringUtils.randomNumeric(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 260)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_4_CHARACTERS_FOR_THE_INPUT_FIELD_POSTAL_CODE() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPostalCode(RandomStringUtils.randomNumeric(3));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 270)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_15_CHARACTERS_FOR_THE_INPUT_FIELD_POSTAL_CODE() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPostalCode(RandomStringUtils.randomNumeric(16));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 280)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_POSTAL_CODE() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPostalCode("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 290)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_POSTAL_CODE() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPostalCode("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 300)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_ALPHABETIC_CHARACTERS_FOR_THE_INPUT_FIELD_POSTAL_CODE() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPostalCode(RandomStringUtils.randomAlphabetic(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 310)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_4_CHARACTERS_FOR_THE_INPUT_FIELD_TAX_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setTaxNumber(RandomStringUtils.randomNumeric(3));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 320)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_13_CHARACTERS_FOR_THE_INPUT_FIELD_TAX_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setTaxNumber(RandomStringUtils.randomNumeric(14));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 330)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_TAX_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setTaxNumber("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 340)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_TAX_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setTaxNumber("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 350)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_ALPHABETIC_CHARACTERS_FOR_THE_INPUT_FIELD_TAX_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setTaxNumber(RandomStringUtils.randomAlphabetic(5));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 360)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_5_CHARACTERS_FOR_THE_INPUT_FIELD_PHONE_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPhoneNumber(RandomStringUtils.randomNumeric(4));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 370)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_25_CHARACTERS_FOR_THE_INPUT_FIELD_PHONE_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPhoneNumber(RandomStringUtils.randomNumeric(26));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 380)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_SPECIAL_CHARACTERS_FOR_THE_INPUT_FIELD_PHONE_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPhoneNumber("!@#$%^");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 390)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_PHONE_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPhoneNumber("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 400)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_ALPHABETIC_CHARACTERS_FOR_THE_INPUT_FIELD_PHONE_NUMBER() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPhoneNumber(RandomStringUtils.randomAlphabetic(14));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 410)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_LESS_THAN_4_CHARACTERS_FOR_THE_INPUT_FIELD_PASSWORD() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPassword(RandomStringUtils.randomAlphanumeric(3));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 420)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_MORE_THAN_30_CHARACTERS_FOR_THE_INPUT_FIELD_PASSWORD() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPassword(RandomStringUtils.randomAlphanumeric(31));
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }

    @Test(priority = 430)
    public void VERIFY_THAT_THE_USER_CANNOT_CREATE_AN_ACCOUNT_WITH_ONLY_SPACE_CHARACTERS_FOR_THE_INPUT_FIELD_PASSWORD() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        registrationFormVariables.setPassword("   ");
        RegisterAsTransporter.registerAsTransporter(registrationFormVariables);
        Thread.sleep(1000);
        Assert.assertEquals(SeleniumSetup.chromeDriver.getCurrentUrl(),"http://18.156.17.83:9095/account-type/register-provider");

    }


    @AfterClass
    public void finish(){

        SeleniumSetup.finish();

    }
}
