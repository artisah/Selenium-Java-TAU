package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By allImagesDetails = By.className("figure");
    private By caption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /*
    * Index stats with 1
    *
    *
     */
    public FigCaption hoverOnImage(int index) {
        WebElement userImageWithDetails = driver.findElements(allImagesDetails).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(userImageWithDetails).perform();
        FigCaption figCaption = new FigCaption(userImageWithDetails.findElement(caption));
        return figCaption;
    }



    public class FigCaption {

        private WebElement caption;
        By imageName = By.tagName("h5");
        By userProfileLink = By.tagName("a");

        public FigCaption(WebElement caption) {
            this.caption = caption;

        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getImageName() {
            return caption.findElement(imageName).getText();
        }

        public String getLink() {
            return caption.findElement(userProfileLink).getAttribute("href");
        }

        public String getLinkText() {
            return caption.findElement(userProfileLink).getText();
        }
    }

}
