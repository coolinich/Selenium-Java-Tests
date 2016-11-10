package core.frame.applogic0;

import core.frame.applogic.ApplicationManager;
import core.frame.applogic.NavigationHelper;
import core.frame.applogic.ProductHelper;
import core.frame.applogic.UserHelper;
import org.openqa.selenium.WebDriver;

/**
 * Created by Olga on 9/26/2016.
 */
public class ApplicationManager0 implements ApplicationManager {
    UserHelper userHelper = new UserHelper0();
    ProductHelper productHelper = new ProductHelper0();
    NavigationHelper navigationHelper = new NavigationHelper0();
    private WebDriver driver;

    //NavigationHelper navigationHelper = new NavigationHelper0();

    @Override
    public UserHelper getUserHelper() {
        return userHelper;
    }

    @Override
    public ProductHelper getProductHelper() {
        return productHelper;
    }

    @Override
    public NavigationHelper getNavigationHelper() { return navigationHelper; }

    @Override
    public void gotoStaticUrl() {}

    @Override
    public WebDriver getDriver() { return driver; };

    //public NavigationHelper getNavigationHelper() {
    //    return navigationHelper;
    //}
}
