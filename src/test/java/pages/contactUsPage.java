package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class contactUsPage {

	WebDriver driver;
	
	public contactUsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="id_contact")
	public static WebElement subjectHeading;
	public static Select subjectHeadingSelect = new Select(subjectHeading);
	
	@FindBy(id="email")
	public static WebElement emailField;
	
	@FindBy(id="id_order")
	public static WebElement orderReferenceField;
	
	@FindBy(id="message")
	public static WebElement messageField;
	
	@FindBy(id="submitMessage")
	public static WebElement sendButton;
	
	@FindBy(how=How.CLASS_NAME,using="alert alert-success")
	public static WebElement successAlert;
}
