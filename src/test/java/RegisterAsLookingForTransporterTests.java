import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cdom.Automation.RegisterAsLookingForTransporter;
import cdom.RegistrationFormVariables;
import cdom.SeleniumSetup;

public class RegisterAsLookingForTransporterTests {

    @BeforeClass
    public void init(){

        SeleniumSetup.init();

    }

    @Test(priority = 9999)
    public void VALID_INPUT_FOR_THE_FORM() throws InterruptedException {

        RegistrationFormVariables registrationFormVariables = new RegistrationFormVariables();
        String s = "";
        for (int i = 1; i <= 2 ; i++) {
            registrationFormVariables.setEmailAsLookingForTransporter(i+registrationFormVariables.getEmailAsLookingForTransporter());
            RegisterAsLookingForTransporter.registerLookingForTransporterPerson(i,registrationFormVariables);
            Thread.sleep(1000);
            s = s + SeleniumSetup.chromeDriver.getCurrentUrl() + " ";
        }
        Assert.assertEquals(s, "http://18.156.17.83:9095/account-type/register-client/client-successful-registration http://18.156.17.83:9095/account-type/register-client/client-successful-registration ");

    }

    @AfterClass
    public void finish(){

        SeleniumSetup.finish();

    }

}
