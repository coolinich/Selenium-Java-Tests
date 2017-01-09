package core.frame.applogic1;

import com.google.common.collect.Iterables;
import core.frame.applogic.NavigationHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Olga on 9/30/2016.
 */
 class NavigationHelper1 implements NavigationHelper {

    private ApplicationManager1 manager;

    public NavigationHelper1(ApplicationManager1 manager) {
        this.manager = manager;
    }

    @Override
    public void openMainPage(){
        this.manager.getDriver().get(this.manager.getBaseUrl());

    }

    @Override
    public void openCatalogPage() {
        this.manager.getDriver().get(this.manager.getBaseUrl() + "shop/mobiel/smartphones/");
    }

    @Override
    public void openHSPage(String brand) {
        this.manager.getDriver().get(this.manager.getBaseUrl() + "shop/mobiel/abonnement/apple-iphone-se-64gb/");
    }

    @Override
    public void openHSPage() {
        List<WebElement> hsList = this.manager.getDriver().findElements(By.cssSelector("#abonnementPhonesWrapper .row a:first-of-type"));
        WebElement firstHS = Iterables.getFirst(hsList, this.manager.getDriver().findElement(By.id("#product-list-item-3347 a:first-of-type")));
        String firstHSUrl = firstHS.getAttribute("href");
    }

    @Override
    public void openSOPage() {
        this.manager.getDriver().get(this.manager.getBaseUrl() + "shop/mobiel/abonnement/sim-only/");
    }


    @Override
    public void acceptCookiesPopup() {
        this.manager.getDriver().switchTo().frame("targetedPopupFrame");
        this.manager.getDriver().findElement(By.id("closePopup")).click();
        //this.manager.getDriver().defaultContent();



        /* String MainWindow = this.manager.getDriver().getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = this.manager.getDriver().getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                this.manager.getDriver().switchTo().window(ChildWindow);
                this.manager.getDriver().findElement(By.id("closePopup")).click();
                this.manager.getDriver().close();
            }
        }
        // Switching to Parent window i.e Main Window.
        this.manager.getDriver().switchTo().window(MainWindow);
*/

    }

}
