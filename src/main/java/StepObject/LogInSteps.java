package StepObject;

import PageObject.LogInPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class LogInSteps extends LogInPage {
    public LogInSteps GoToLogInPage (){
        GeneralLoginButton.click();
        UserIsOnLoginPage.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public LogInSteps FillLoginEmail(String LoginEmailValue){
        LoginEmailInput.setValue(LoginEmailValue);
        return this;
    }
    public LogInSteps FillLoginPassword (String LoginPasswordValue){
        LoginPasswordInput.setValue((LoginPasswordValue));
        return this;
    }
    public LogInSteps FinishLogin (){
        LoginButton.click();
        Usersucceded.shouldBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }
    public LogInSteps FillWrongEmail (String WrongEmailValue){
        LoginEmailInput.setValue(WrongEmailValue);
        return this;
    }
    public LogInSteps FillWrongPassword (String WrongPasswordValue){
        LoginPasswordInput.setValue(WrongPasswordValue);
        return this;
    }

   public LogInSteps LoginFaled (){
        LoginButton.click();
        WrongPass.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
   }
}
