package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class ShopPage extends CommonMethods {

    @FindBy(xpath = "//h1[text() = 'Shop']")
    public WebElement shopPageHeader;

    @FindBy(linkText = "Login")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public List<WebElement> viewItemList;

    @FindBy(xpath = "//div[@class='d-flex align-items-center justify-content-center hover-overlay']")
    public List<WebElement> shopItemList;


    public ShopPage() {
        PageFactory.initElements(driver, this);
    }
}
