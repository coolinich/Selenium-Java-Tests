package core.frame.pages;

import core.frame.applogic.ApplicationManager;
import core.frame.applogic1.ApplicationManager1;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

/**
 * Base class for all the TestNG-based test classes
 */
public class TestBase {
	private static final String SCREENSHOT_FOLDER = "/screenshots";
	private static final String SCREENSHOT_FORMAT = ".png";
	protected ApplicationManager app;

	@BeforeClass
	public void init() throws InterruptedException {
		app = new ApplicationManager1();
	//	app.getNavigationHelper().openMainPage();
	//	app.getNavigationHelper().acceptCookiesPopup();

	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (app.getDriver() != null) {
			//WebDriverFactory.dismissDriver(driver);
			app.getDriver().quit();
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
