package core.frame.applogic1;

import core.frame.applogic.UserHelper;
import core.frame.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Olga on 9/30/2016.
 */
public class UserHelper1 extends DriverBasedHelper implements UserHelper {
    private User user;
    private ApplicationManager1 manager;
    //private WebDriver driver;

    /*public UserHelper1(User user) {
        this.user = user;
    }*/

    public UserHelper1(ApplicationManager1 manager) {
        super(manager.getDriver());
        //this.driver = manager.getDriver();
        this.manager = manager;
    }

    @Override
    public void loginAs(User user) {
        driver.findElement(By.linkText("Login")).click();
        WebElement loginEmail = driver.findElement(By.id("login_main_login"));
        loginEmail.clear();
        loginEmail.sendKeys(user.getEmail());
        WebElement loginPassword = driver.findElement(By.id("psw_main_login"));
        loginPassword.clear();
        loginPassword.sendKeys(user.getPassword());
        driver.findElement(By.name("dispatch[auth.login]")).click();
    }

    @Override
    public void logout() {
        this.user = null;
    }

    @Override
    public boolean isLoggedIn() {
        return super.isElementPresent(By.linkText("Logout"));
    }

    @Override
    public boolean isLoggedInAs(User user) {

        return isLoggedIn() && this.user.getEmail().equals(user.getEmail());
    }

    @Override
    public boolean isNotLoggedIn() {
        return (user == null);
    }


    }
