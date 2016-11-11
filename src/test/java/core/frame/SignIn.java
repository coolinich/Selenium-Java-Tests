package core.frame;

import core.frame.model.User;
import core.frame.pages.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SignIn extends TestBase {
        // was moved to DriverBasedHelper
        // private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();


        @BeforeMethod
        public void mayBeLogout(){
            if (app.getUserHelper().isLoggedIn()){
                app.getUserHelper().logout();
            }
        }

        @Test
        public void testLoginOk() throws Exception {
            User user = new User("kristenreed1908@gmail.com", "Qwerty12");
            //User user = new User().setEmail("test").setPassword("test");
            app.getUserHelper().loginAs(user);
            assertTrue(app.getUserHelper().isLoggedIn());

        }

        /* was moved to DriverBasedHelper
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
        }*/

}


