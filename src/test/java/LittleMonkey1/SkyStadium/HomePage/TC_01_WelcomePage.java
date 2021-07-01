package LittleMonkey1.SkyStadium.HomePage;
import java.io.IOException;
import org.testng.annotations.Test;
import LittleMonkey1.SkyStadium.Base.TestBase;
import LittleMonkey1.SkyStadium.pages.SkyStadium_TakeScreenshot;


public class TC_01_WelcomePage extends TestBase{

	@Test
	public void SkyStadium() throws IOException, InterruptedException
	{
		SkyStadium_TakeScreenshot SKTSC = new SkyStadium_TakeScreenshot(driver);
		SKTSC.getListofEle();
	}
}
