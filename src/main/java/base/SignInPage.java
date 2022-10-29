package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy (id = "email")
    public WebElement emailBox;

    @FindBy (id = "passwd")
    public WebElement passwordBox;

    @FindBy (id = "SubmitLogin")
    public WebElement signInButton;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String emailAddress) {
        sendKeysToElement(emailBox, emailAddress);
    }

    public void inputPassword(String password) {
        sendKeysToElement(passwordBox, password);
    }

    public void clickSignInButton() {
        clickOnElement(signInButton);
    }

    public AccountPage loginToAccount(String emailAddress, String password) {
        inputEmail(emailAddress);
        inputPassword(password);
        clickSignInButton();

        return new AccountPage();

    }
}
