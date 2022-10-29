package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {

    @FindBy (xpath = "//div[@class='nav']//a[@class='account']")
    public WebElement accountName;

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String getAccountName() {
        return accountName.getText();
    }

}
