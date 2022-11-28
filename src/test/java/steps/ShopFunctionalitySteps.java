package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;

import java.util.List;

public class ShopFunctionalitySteps extends CommonMethods {

    @Then("user verifies that shop page header is {string}")
    public void user_verifies_that_shop_page_header_is(String header) {
        getWait().until(ExpectedConditions.visibilityOf(shopPage.shopPageHeader));
        Assert.assertEquals(header, shopPage.shopPageHeader.getText());
    }

    @Then("user click on login button of shop page")
    public void user_click_on_login_button_of_shop_page() {
        click(shopPage.loginButton);
    }

    @Then("user verifies that login page header is {string}")
    public void user_verifies_that_login_page_header_is(String header) {

        waitForClickability(loginPage.emailAdressField);
        Assert.assertEquals(header, loginPage.loginPageHeader.getText());
    }

    @Then("user moves pointer to items one by one and verify that view button is visible")
    public void user_moves_pointer_to_items_one_by_one_and_verify_that_view_button_is_visible() {
        List<WebElement> itemList = shopPage.shopItemList;
        List<WebElement> viewButtonList = shopPage.viewItemList;
        for (int i = 0; i < itemList.size(); i++) {
            getAction().moveToElement(itemList.get(i)).perform();
            getWait().until(ExpectedConditions.visibilityOf(viewButtonList.get(i)));
            Assert.assertTrue(viewButtonList.get(i).isDisplayed());
        }
    }
}
