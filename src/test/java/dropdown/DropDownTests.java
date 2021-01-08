package dropdown;

import base.BaseTests;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropDownTests extends BaseTests {

    @Test
    public void clickDropDownAndSelectOption() {
        String option = "Option 1";
        DropDownPage dropDownPage = homePage.clickDropdownLink();
        dropDownPage.selectFromDropDown(option);
        List<String> AllSelectedOptions = dropDownPage.getAllSelectedOptions();

        Assert.assertEquals(AllSelectedOptions.size(),1);
        Assert.assertTrue(AllSelectedOptions.contains(option));
    }


}
