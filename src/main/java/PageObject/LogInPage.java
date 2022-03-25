package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selenide.$;

public class LogInPage {
     public SelenideElement
     GeneralLoginButton =  $(".ty-account-info__title-txt"),
     LoginEmailInput = $(byXpath("//*[@id=\"login_popup342\"]")),
     LoginPasswordInput = $(byXpath("//*[@id=\"psw_popup342\"]")),
     LoginButton = $(byName("dispatch[auth.login]")),
     UserIsOnLoginPage = $(byId("ui-id-1")),
     Usersucceded = $(byText("თქვენ წარმატებით გაიარეთ ავტორიზაცია.")),
     WrongPass = $(byText("მომხმარებლის სახელი ან პაროლი არასწორია. გთხოვთ ხელახლა სცადოთ."));
}
