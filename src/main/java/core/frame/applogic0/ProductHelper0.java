package core.frame.applogic0;

import core.frame.applogic.ProductHelper;
import org.openqa.selenium.By;

/**
 * Created by Olga on 9/26/2016.
 */
public class ProductHelper0 implements ProductHelper {
    @Override
    public boolean isFiltersAvailable() {
        return false;
    }

    @Override
    public boolean isElementPresent(By by) {
        return false;
    }
}
