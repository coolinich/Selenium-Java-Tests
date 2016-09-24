package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignIn extends pages.TestBase {
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Test
        public void testUntitled() throws Exception {    driver.get(baseUrl + "/");
            driver.findElement(By.linkText("Login")).click();
            WebElement loginEmail = driver.findElement(By.id("login_main_login"));
            loginEmail.clear();
            loginEmail.sendKeys("kristenreed1908@gmail.com");
            WebElement loginPassword = driver.findElement(By.id("psw_main_login"));
            loginPassword.clear();
            loginPassword.sendKeys("Qwerty12");
            driver.findElement(By.name("dispatch[auth.login]")).click();
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
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


