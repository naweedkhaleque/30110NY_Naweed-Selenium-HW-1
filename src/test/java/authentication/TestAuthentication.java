package authentication;

import base.AccountPage;
import base.BasePage;
import base.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test
    public void testLoginFunctionality() {
        HomePage homePage = new HomePage();
        AccountPage accountPage = homePage.clickSignInButton().loginToAccount(config.appUser, config.appPassword);
        String expectedAccountName = "First Last";
        Assert.assertEquals(accountPage.getAccountName(), expectedAccountName);
    }
}
