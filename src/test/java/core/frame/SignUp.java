package core.frame;

import core.frame.pages.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SignUp extends TestBase {
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    //@Test
    public void testSignUpHu2() throws Exception {    app.getDriver().findElement(By.id("email")).clear();
        app.getDriver().findElement(By.id("email")).sendKeys("kristenreed1908@gmail.com");
        app.getDriver().findElement(By.id("password1")).clear();
        app.getDriver().findElement(By.id("password1")).sendKeys("Qwerty12");
        app.getDriver().findElement(By.id("password2")).clear();
        app.getDriver().findElement(By.id("password2")).sendKeys("Qwerty12");
        app.getDriver().findElement(By.name("dispatch[profiles.update]")).click();
        app.getDriver().get("http://google.com" + "/");
        app.getDriver().findElement(By.linkText("Sign up")).click();
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