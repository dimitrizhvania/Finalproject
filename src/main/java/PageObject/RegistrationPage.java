package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

        public SelenideElement
                GeneralRegistrationButton = $(".ty-account-info__title-txt"),
                RegistrationButton = $(".ty-login-reglink__a"),
                EmailInput = $(byId("email")),
                UserRegistrationPage = $(".ty-mainbox-title"),
                FirstNameInput = $(byId("elm_6")),
                LastNameInput = $(byId("elm_7")),
                PasswordInput = $(byId("password1")),
                ConfirmPasswordInput = $(byId("password2")),
                CheckBox = $(byId("id_accept_terms_site")),
                FinishRegistrationButton = $( byName("dispatch[profiles.update]")),
                WrongPasswordOutput = $(byId("password1_error_message")),
                WrongConfirmPasswordOutput = $(byId("password2_error_message")),
                WrongEmailOutput = $(byId("email_error_message")),
                CheckBoxOutput = $(byId("id_accept_terms_site_error_message"));
    }


