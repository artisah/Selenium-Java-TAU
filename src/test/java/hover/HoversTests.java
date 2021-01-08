package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHoverLink();
        HoversPage.FigCaption caption = hoversPage.hoverOnImage(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "caption not displayed");
        Assert.assertEquals(caption.getImageName(), "name: user1","Caption title incorrecr");
        Assert.assertEquals(caption.getLinkText(),"View profile","Caption link text incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Links incorrect");
    }
}
