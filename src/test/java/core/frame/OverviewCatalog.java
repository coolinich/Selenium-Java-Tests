package core.frame;

import core.frame.pages.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OverviewCatalog extends TestBase {
        // was moved to DriverBasedHelper
        // private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();


        @BeforeMethod
        public void mayBeLogout(){
          /*  if (app.getUserHelper().isLoggedIn()){
                app.getUserHelper().logout();
            }*/
        }

        @Test
        public void overviewCatalogPage() throws Exception {
          /*  User testUser = new User();
            String result = "NF HS ";
            app.getUserHelper().createUserFromFile(testUser, "D:\\\\Projects\\user.txt");

            result = result.concat(testUser.getEmail());
            result = result.concat(" ");
            result = result.concat(testUser.getPhoneNumber());
            app.saveTestResult(result, "test_results.txt");*/

            app.getNavigationHelper().openCatalogPage();
            //assertTrue(app.getProductHelper().isFiltersAvailable());
    /*      HS order process
            app.getNavigationHelper().openHSPage("iphone");
            app.getDriver().findElement(By.cssSelector("#product_addtocart_form .button-block .btn-regular")).click();
            Assert.assertTrue(app.getProductHelper().isElementPresent(By.cssSelector(".cart div.t2title")));
            app.getDriver().findElement(By.cssSelector(".gender")).click();
            app.getDriver().findElement(By.cssSelector(".is-active>li[data-value='Female']")).click();
            app.getDriver().findElement(By.id("initials")).click();
            app.getDriver().findElement(By.id("initials")).sendKeys(testUser.getInitails());
            app.getDriver().findElement(By.id("firstname")).click();
            app.getDriver().findElement(By.id("firstname")).sendKeys(testUser.getFirstName());
            app.getDriver().findElement(By.id("lastname")).click();
            app.getDriver().findElement(By.id("lastname")).sendKeys(testUser.getSecondName());
            app.getDriver().findElement(By.cssSelector(".calendar_alt")).click();*/




        }

}


