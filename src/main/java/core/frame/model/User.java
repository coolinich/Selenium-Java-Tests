package core.frame.model;

/**
 * Created by Olga on 9/24/2016.
 */
public class User {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String initails;
    private String secondName;
    private String birthDate;
    private String idNumber;
    private String IBANNumber;
    private String postCode;
    private String homeNumber;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setInitails(String initails) {
        this.initails = initails;
    }

    public String getInitails() {
        return initails;
    }




    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public String getIBANNumber() {
        return IBANNumber;
    }

    public void setIBANNumber(String IBANNumber) {
        this.IBANNumber = IBANNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    public User() {
    }





    //public User(){}

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
