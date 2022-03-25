package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps GoToRegistrationPage(){
        GeneralRegistrationButton.click();
        RegistrationButton.click();
        UserRegistrationPage.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    public RegistrationSteps FillEmail(String EmailValue){
        EmailInput.setValue(EmailValue);
        return this;
    }
    public RegistrationSteps FillPassword(String PasswordValue){
        PasswordInput.setValue(PasswordValue);
        return this;
    }
    public RegistrationSteps FillConfirmPassword (String ConfirmPasswordValue){
        ConfirmPasswordInput.setValue(ConfirmPasswordValue);
        return this;
    }
    public RegistrationSteps FillFirstName (String FirstNameValue){
        FirstNameInput.setValue(FirstNameValue);
        return this;

    }
    public RegistrationSteps FillLastName (String LastNameValue){
        LastNameInput.setValue(LastNameValue);
        return this;
    }
    public RegistrationSteps Checkcheckbox (){
        CheckBox.click();
        return this;

    }
     public RegistrationSteps FinishRegistration (){
        FinishRegistrationButton.click();
        return this;
     }
     public RegistrationSteps FillWrongEmail(String WrongEmailValue){
        EmailInput.setValue(WrongEmailValue);
        return this;
     }
     public RegistrationSteps FillWrongPassword (String WrongPasswordValue){
        PasswordInput.setValue(WrongPasswordValue);
        return this;
     }
    public RegistrationSteps FillWrongConfirmPassword (String WrongConfirmPasswordValue){
        ConfirmPasswordInput.setValue(WrongConfirmPasswordValue);
        return this;
    }

}

