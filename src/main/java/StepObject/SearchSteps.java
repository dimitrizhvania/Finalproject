package StepObject;

import PageObject.SearchPage;

public class SearchSteps extends SearchPage {
    public SearchPage  FillSearch (String SearchInput){
        SearchBarInput.setValue(SearchInput);
        return this;
    }
    public SearchPage SwitchToSearch(){
        SearchButton.click();
        return this;

    }
    public SearchPage WrongSearch(String SearchIncorrect){
        SearchBarInput.setValue(SearchIncorrect);
        return this;
    }
}
