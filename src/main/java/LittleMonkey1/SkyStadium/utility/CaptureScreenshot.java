package LittleMonkey1.SkyStadium.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CaptureScreenshot {
	private WebDriver driver;
	File destFile = null;
	public static Calendar calendar;
	public static SimpleDateFormat formater;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH");
    LocalDateTime now = LocalDateTime.now();
	public void takeScreenShot(String fileName) throws IOException
	{
		destFile = new File(System.getProperty("user.dir") + "\\screenshots\\"+ dtf.format(now) + "\\" +fileName + ".png");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File img = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, destFile);
	}
	
	public CaptureScreenshot(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);

	  }	
}