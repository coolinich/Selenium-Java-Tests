package core.frame.applogic1;

import core.frame.applogic.UserHelper;
import core.frame.model.User;

/**
 * Created by Olga on 9/30/2016.
 */
public class UserHelper1 implements UserHelper {
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
