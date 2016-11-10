package core.frame;

import core.frame.model.User;
import core.frame.pages.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SignIn extends TestBase {
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @BeforeMethod
        public void mayBeLogout(){
            if (app.getUserHelper().isLoggedIn()){
                app.getUserHelper().logout();
            }
        }

        @Test
        public void testLoginOk() throws Exception {
           // driver.get(baseUrl + "/");
           // app.gotoStaticUrl();
            User user = new User().setEmail("kristenreed1908@gmail.com").setPassword("Qwerty12");
            app.getUserHelper().loginAs(user);
            assertTrue(app.getUserHelper().isLoggedInAs(user));

/*
            driver.findElement(By.linkText("Login")).click();
            WebElement loginEmail = driver.findElement(By.id("login_main_login"));
            loginEmail.clear();
            loginEmail.sendKeys("kristenreed1908@gmail.com");
            WebElement loginPassword = driver.findElement(By.id("psw_main_login"));
            loginPassword.clear();
            loginPassword.sendKeys("Qwerty12");
            driver.findElement(By.name("dispatch[auth.login]")).click();
*/
        }

        private boolean isElementPresent(By by) {
            try {
                app.getDriver().findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = app.getDriver().switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
}


