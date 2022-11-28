package steps;

import pages.LoginPage;
import pages.ShopPage;

public class PageInitializer {

    public static ShopPage shopPage;

    public static LoginPage loginPage;


    public static void initializePageObjects() {
        shopPage = new ShopPage();
        loginPage = new LoginPage();
    }
}
