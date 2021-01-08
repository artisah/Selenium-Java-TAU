package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.cssSelector("a[href='/login']");
    private By dropDownLink = By.linkText("Dropdown");
    private By hoverLinkElement = By.cssSelector("a[href='/hovers']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropDownPage clickDropdownLink() {
        driver.findElement(dropDownLink).click();
        return new DropDownPage(driver);
    }

    public HoversPage clickHoverLink() {
        driver.findElement(hoverLinkElement).click();
        return new HoversPage(driver);

    }
}
