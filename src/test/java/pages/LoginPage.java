package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//div[@class='col-9']/h1")
    public WebElement loginPageHeader;

    @FindBy(id = "Email Address")
    public WebElement emailAdressField;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
