package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement
            SearchBarInput =  $(byXpath("//*[@id=\"quick_search\"]")),
            SearchButton = $(".ty-search-magnifier"),
            ItemNotFound = $(byText("არცეთი პროდუქტი არ მოიძებნა"));


}
