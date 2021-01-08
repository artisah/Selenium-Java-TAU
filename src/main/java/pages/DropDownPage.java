package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class DropDownPage {
    private WebDriver driver;
    private By dropDownMenu = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;

    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropDownMenu));
    }

    public void selectFromDropDown(String option) {
         findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getAllSelectedOptions() {
        List<WebElement> allSelectedOption = findDropDownElement().getAllSelectedOptions();
        return allSelectedOption.stream().map(e -> e.getText()).collect(Collectors.toList());
    }


}
