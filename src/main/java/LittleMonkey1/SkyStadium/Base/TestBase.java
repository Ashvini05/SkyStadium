package LittleMonkey1.SkyStadium.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import LittleMonkey1.SkyStadium.utility.CaptureScreenshot;

public class TestBase {
public static WebDriver driver;
	
	@BeforeTest
	public static void testSetUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stadium-draft.littlemonkey.info/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CaptureScreenshot screenshot= new CaptureScreenshot(driver);
		screenshot.takeScreenShot("WelcomePage");
		
	}
	
	@AfterTest
	public void quitDriver()
	{
		driver.quit();
	}

}
