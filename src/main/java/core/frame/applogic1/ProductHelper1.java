package core.frame.applogic1;

import core.frame.applogic.ProductHelper;
import core.frame.model.Product;
import org.openqa.selenium.By;

/**
 * Created by Olga on 9/30/2016.
 */
public class ProductHelper1 extends DriverBasedHelper implements ProductHelper {
    private Product product;
    private ApplicationManager1 manager;
    //private WebDriver driver;

    /*public UserHelper1(User user) {
        this.user = user;
    }*/

    public ProductHelper1(ApplicationManager1 manager) {
        super(manager.getDriver());
        //this.driver = manager.getDriver();
        this.manager = manager;
    }

    @Override
    public boolean isFiltersAvailable() {
        return super.isElementPresent(By.cssSelector(".open-lightbox"));
    }
}
