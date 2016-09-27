package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SignUp extends TestBase {
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    //@Test
    public void testSignUpHu2() throws Exception {    driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("kristenreed1908@gmail.com");
        driver.findElement(By.id("password1")).clear();
        driver.findElement(By.id("password1")).sendKeys("Qwerty12");
        driver.findElement(By.id("password2")).clear();
        driver.findElement(By.id("password2")).sendKeys("Qwerty12");
        driver.findElement(By.name("dispatch[profiles.update]")).click();
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Sign up")).click();
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