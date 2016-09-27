package tests.applogic1;

import tests.applogic.ApplicationManager;
import tests.applogic.ProductHelper;
import tests.applogic.UserHelper;

/**
 * Created by Olga on 9/26/2016.
 */
public class ApplicationManager0 implements ApplicationManager {
    UserHelper userHelper = new UserHelper0();
    ProductHelper productHelper = new ProductHelper0();

    @Override
    public UserHelper getUserHelper() {
        return userHelper;
    }

    @Override
    public ProductHelper getProductHelper() {
        return productHelper;
    }
}
