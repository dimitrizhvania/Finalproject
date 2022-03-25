package FinalProject;

import StepObject.LogInSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;

public class LogInTest extends Runner {
    @Test
    public void Login (){
        LogInSteps steps = new LogInSteps();
        steps.GoToLogInPage();
        Assert.assertTrue(steps.UserIsOnLoginPage.isDisplayed());
        steps
                .FillLoginEmail(LoginEmailValue)
                .FillLoginPassword(LoginPasswordValue);
        Assert.assertEquals(steps.LoginEmailInput.getValue(),LoginEmailValue);
        Assert.assertEquals(steps.LoginPasswordInput.getValue(),LoginPasswordValue);
        steps.FinishLogin();
        Assert.assertTrue(steps.Usersucceded.isDisplayed());


    }
    @Test
    public void LoginErrors (){
        LogInSteps steps = new LogInSteps();
        steps.GoToLogInPage();
        Assert.assertTrue(steps.UserIsOnLoginPage.isDisplayed());
        steps

                .FillWrongEmail(WrongEmailValue)
                .FillWrongPassword(WrongPasswordValue)
                .LoginFaled();

        Assert.assertTrue(steps.WrongPass.isDisplayed());

    }


}

