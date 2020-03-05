package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class landingPage {
	
	WebDriver driver;
	
	public landingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="contact-link")
	public static WebElement contactUsButton;
	
	@FindBy(how=How.CLASS_NAME,using="login")
	public static WebElement signInButton;
}
