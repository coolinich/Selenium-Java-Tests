package tests.applogic1;

import tests.applogic.UserHelper;
import tests.model.User;

/**
 * Created by Olga on 9/26/2016.
 */
public class UserHelper0 implements UserHelper {

    private User user;

    @Override
    public void loginAs(User user) {
        this.user = user;
    }

    @Override
    public void logout() {
        this.user = null;
    }

    @Override
    public boolean isLoggedIn() {
        return user != null;
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
