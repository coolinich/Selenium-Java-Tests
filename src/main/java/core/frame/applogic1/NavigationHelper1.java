package core.frame.applogic1;

import core.frame.applogic.NavigationHelper;

/**
 * Created by Olga on 9/30/2016.
 */
public class NavigationHelper1 implements NavigationHelper {

    private ApplicationManager1 manager;

    public NavigationHelper1(ApplicationManager1 manager) {
        this.manager = manager;
    }

    @Override
    public void openMainPage(){ this.manager.getDriver().get(this.manager.getBaseUrl()); }
}
