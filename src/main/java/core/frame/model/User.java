package core.frame.model;

/**
 * Created by Olga on 9/24/2016.
 */
public class User {
    private String id;
    private String email;
    private String password;

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }
}
