package core.frame.applogic;

import org.openqa.selenium.WebDriver;

/**
 * Created by Olga on 9/24/2016.
 */
public interface ApplicationManager {
    UserHelper getUserHelper();
    ProductHelper getProductHelper();
    NavigationHelper getNavigationHelper();
    void gotoStaticUrl();
    WebDriver getDriver();
}
