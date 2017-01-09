package core.frame.applogic1;

import core.frame.applogic.ApplicationManager;
import core.frame.applogic.NavigationHelper;
import core.frame.applogic.ProductHelper;
import core.frame.applogic.UserHelper;
import core.frame.util.Browser;
import core.frame.util.PropertyLoader;
import core.frame.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import java.io.*;

import java.util.concurrent.TimeUnit;


/**
 * Created by Olga on 9/30/2016.
 */
public class ApplicationManager1 implements ApplicationManager {

    private String baseUrl;
    private WebDriver driver;
    private UserHelper userHelper;
    private ProductHelper productHelper;
    private NavigationHelper navHelper;

    public ApplicationManager1() throws InterruptedException {
        baseUrl = PropertyLoader.loadProperty("site.url");
        String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

        Browser browser = new Browser();
        browser.setName(PropertyLoader.loadProperty("browser.name"));
        browser.setVersion(PropertyLoader.loadProperty("browser.version"));
        browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));
        String username = PropertyLoader.loadProperty("user.name");
        String password = PropertyLoader.loadProperty("user.password");
        driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.get(baseUrl + "/");

        userHelper = new UserHelper1(this);
        productHelper = new ProductHelper1(this);
        navHelper = new NavigationHelper1(this);

        driver.manage().window().maximize();
        getNavigationHelper().openMainPage();
  //      driver.manage().wait(1000);
        getNavigationHelper().acceptCookiesPopup();
    }

    @Override
    public UserHelper getUserHelper() {
        return userHelper;
    }

    @Override
    public ProductHelper getProductHelper() {
        return productHelper;
    }

    @Override
    public NavigationHelper getNavigationHelper() { return  navHelper; }

    @Override
    public void gotoStaticUrl() { driver.get(baseUrl + "/");}

    @Override
    public WebDriver getDriver() { return driver; }

    public String getBaseUrl() { return baseUrl; }

    public void saveTestResult(String result, String resfile)
    {
        try {
            File f1 = new File(resfile);
            if(!f1.exists()) {
                f1.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.newLine();
            bw.write(result);
            bw.newLine();
            bw.close();
           // System.out.println("Done");
            } catch(IOException e){
            e.printStackTrace();
        }

    }

}
