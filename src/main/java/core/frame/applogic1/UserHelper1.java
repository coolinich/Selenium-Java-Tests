package core.frame.applogic1;

import core.frame.applogic.UserHelper;
import core.frame.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.*;
import java.util.*;

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
    public User createUserFromFile(User newUser, String fileName)
    {
        try {
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String firstname;
            String initials;
            String secondname;
            String birthdate;
            String postcode;
            String housenumber;
            String identitynumber;
            String ibannumber;


            if ((strLine = br.readLine()) != null)
            {
                //firstname = strLine;
                //System.out.println("firstname is " + firstname);
                newUser.setFirstName(strLine);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setInitails(strLine);
                //System.out.println("initials is " + initials);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setSecondName(strLine);
               // System.out.println("secondname is " + secondname);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setBirthDate(strLine);
                //System.out.println("birthdate is " + birthdate);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setPostCode(strLine);
                //System.out.println("postcode is " + postcode);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setHomeNumber(strLine);
                //System.out.println("housenumber is " + housenumber);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setIdNumber(strLine);
                //System.out.println("identitynumber is " + identitynumber);
            } else {System.out.println("Error in file");}

            if ((strLine = br.readLine()) != null)
            {
                newUser.setIBANNumber(strLine);
               // System.out.println("ibannumber is " + ibannumber);
            } else {System.out.println("Error in file");}
//Close the input stream
            br.close();
        }catch(IOException e) {
            System.out.print("Exception");
        }
//random email and phone
        newUser.setEmail(randEmail());
        newUser.setPhoneNumber(randPhone());


    return newUser;
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

    public static String randEmail()
    {
        int[] a = new int[6];
        Random rand = new Random();
        String s = "";

        for (int i=0; i<6; i++)
        {
            a[i] = rand.nextInt(10);
            s = s.concat(Integer.toString(a[i]));
        }

        s = s.concat("@test.com");

        return s;
    }

    public static String randPhone()
    {
        String s = "08";
        int[] a = new int[8];
        Random rand = new Random();

        for (int i=0; i<8; i++)
        {
            a[i] = rand.nextInt(10);
            s = s.concat(Integer.toString(a[i]));
        }

        return s;
    }




}
