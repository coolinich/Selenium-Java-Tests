package core.frame;

import core.frame.model.User;
import core.frame.pages.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderSimOnly1 extends TestBase {
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
        public void createSimOnly1Order() throws Exception {
            User testUser = new User();
            String result = "NF SO1 ";
            app.getUserHelper().createUserFromFile(testUser, "D:\\\\Projects\\user.txt");

            result = result.concat(testUser.getEmail());
            result = result.concat(" ");
            result = result.concat(testUser.getPhoneNumber());
            app.saveTestResult(result, "test_results.txt");

            app.getNavigationHelper().openSOPage();

            app.getDriver().findElement(By.cssSelector(".binding-label[data-binding-time='1']")).click();


            app.getDriver().findElement(By.cssSelector(".cart-button")).click();
            Assert.assertTrue(app.getProductHelper().isElementPresent(By.cssSelector(".cart div.t2title")));
            app.getDriver().findElement(By.cssSelector(".gender")).click();
            app.getDriver().findElement(By.cssSelector(".is-active>li[data-value='Female']")).click();
            app.getDriver().findElement(By.id("initials")).click();
            app.getDriver().findElement(By.id("initials")).sendKeys(testUser.getInitails());
            app.getDriver().findElement(By.id("firstname")).click();
            app.getDriver().findElement(By.id("firstname")).sendKeys(testUser.getFirstName());
            app.getDriver().findElement(By.id("lastname")).click();
            app.getDriver().findElement(By.id("lastname")).sendKeys(testUser.getSecondName());
            app.getDriver().findElement(By.cssSelector(".calendar_alt")).click();


            //app.getDriver().findElement(By.id("lastname")).sendKeys("Kulinich");



        }

}


