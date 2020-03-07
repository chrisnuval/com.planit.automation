package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class test_initialize {
	
	public static WebDriver driver = null;
		
	@BeforeSuite
	public void initialize() throws IOException{
		String PAGE_URL="http://automationpractice.com/index.php?controller=contact";
		System.setProperty("webdriver.chrome.driver","/Users/cnuval/Selenium/drivers/chromedriver");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(PAGE_URL);
		
	}
	
	@AfterSuite
	//Test cleanup
	public void TeardownTest()
    {
		test_initialize.driver.quit();
    }
	


}
