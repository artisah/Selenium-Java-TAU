package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;


public class LoginTests extends BaseTests {

    @Test
    public void checkLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        Assert.assertTrue(secureAreaPage.getSecureLoginText().contains("You logged into a secure area!"));
    }
}
