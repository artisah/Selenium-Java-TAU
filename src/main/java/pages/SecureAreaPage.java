package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By SecureLoginSuccessText = By.cssSelector("#flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSecureLoginText() {
        return driver.findElement(SecureLoginSuccessText).getText();

    }


}
