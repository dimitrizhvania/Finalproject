package FinalProject;

import StepObject.SearchSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;


import static DataObject.SearchData.*;

public class SearchTest extends Runner {
    @Test
    public void SearchTest(){
        SearchSteps  steps = new SearchSteps();
        steps.FillSearch(SearchInput);
        steps.SwitchToSearch();
    }
    @Test
    public void SearchError (){
        SearchSteps steps = new SearchSteps();
        steps.FillSearch(SearchIncorrect);
                 steps.SwitchToSearch();
        Assert.assertTrue(steps.ItemNotFound.isDisplayed());



    }

}
