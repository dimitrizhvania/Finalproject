package FinalProject;

import StepObject.RegistrationSteps;
import static DataObject.RegistrationData.*;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends Runner {
    @Test
    public void Registration(){
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserRegistrationPage.isDisplayed());
        steps
                .FillEmail(EmailValue)
                .FillPassword(PasswordValue)
                .FillConfirmPassword(ConfirmPasswordValue)
                .FillFirstName(FirstNameValue)
                .FillLastName(LastNameValue)
                .Checkcheckbox();
        Assert.assertEquals(steps.EmailInput.getValue(), EmailValue);
        Assert.assertEquals(steps.PasswordInput.getValue(),PasswordValue);
        Assert.assertEquals(steps.ConfirmPasswordInput.getValue(),ConfirmPasswordValue);
        Assert.assertEquals(steps.FirstNameInput.getValue(),FirstNameValue);
        Assert.assertEquals(steps.LastNameInput.getValue(),LastNameValue);
        steps.FinishRegistration();
    }
    @Test
    public void RegistrationErrors (){
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserRegistrationPage.isDisplayed());
        steps
                .FillWrongEmail(WrongEmailValue)
                .FillWrongPassword(WrongPasswordValue)
                .FillConfirmPassword(WrongConfirmPasswordValue)
                .FinishRegistration();

        Assert.assertTrue(steps.WrongEmailOutput.isDisplayed());
        Assert.assertTrue(steps.WrongPasswordOutput.isDisplayed());
        Assert.assertTrue(steps.WrongConfirmPasswordOutput.isDisplayed());
        Assert.assertTrue(steps.CheckBoxOutput.isDisplayed());








    }

}
