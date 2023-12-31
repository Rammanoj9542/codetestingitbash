package library.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

public class AppUtils 
{
	
	public static WebDriver driver;
	//public static String url;
	
	@BeforeSuite
	public static void launchApp()
	
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get(url);
		
		
	}
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	}

}
