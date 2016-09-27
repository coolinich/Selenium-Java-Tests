package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import tests.applogic.ApplicationManager;
import tests.applogic1.ApplicationManager0;
import tests.util.Browser;
import tests.util.PropertyLoader;

/**
 * Base class for all the TestNG-based test classes
 */
public class TestBase {
	private static final String SCREENSHOT_FOLDER = "/screenshots";
	private static final String SCREENSHOT_FORMAT = ".png";


	protected WebDriver driver;

	protected String gridHubUrl;

	protected String baseUrl;

	protected Browser browser;

	protected ApplicationManager app;

	@BeforeClass
	public void init() {
		baseUrl = PropertyLoader.loadProperty("site.url");
		gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));

		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(PropertyLoader.loadProperty("browser.name"));
		capabilities.setVersion(PropertyLoader.loadProperty("browser.version"));
		String platform = PropertyLoader.loadProperty("browser.platform");
		if (!(null == platform || "".equals(platform))) {
			capabilities.setPlatform(Platform.valueOf(PropertyLoader.loadProperty("browser.platform")));
		}

		if (!(null == gridHubUrl || "".equals(gridHubUrl))) {
			driver = WebDriverFactory.getDriver(gridHubUrl, capabilities);
		} else {
			driver = WebDriverFactory.getDriver(capabilities);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  */

		app = new ApplicationManager0();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			//WebDriverFactory.dismissDriver(driver);
			driver.quit();
		}
	}

//	@AfterMethod
//	public void setScreenshot(ITestResult result) {
//		if (!result.isSuccess()) {
//			try {
//				WebDriver returned = new Augmenter().augment(driver);
//				if (returned != null) {
//					File f = ((TakesScreenshot) returned)
//							.getScreenshotAs(OutputType.FILE);
//					try {
//						FileUtils.copyFile(f, new File(SCREENSHOT_FOLDER
//								+ result.getName() + SCREENSHOT_FORMAT));
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			} catch (ScreenshotException se) {
//				se.printStackTrace();
//			}
//		}
//	}



}
