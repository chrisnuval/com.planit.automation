package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class contactUsPage extends basePage{
	
	public contactUsPage (WebDriver driver) {
        super(driver);
    }
	
	By contactUs = By.id("contact-link");
	By emailField = By.id("email");
	By orderReferenceIDField = By.id("id_order");
	By messageField = By.id("message");
	By sendButton = By.id("submitMessage");
	//By subjectHeading = By.id("id_contact");
	WebElement subjectHeading = driver.findElement(By.id("id_contact"));

	
	public contactUsPage clickContactUsButton() {
		click(contactUs);
		return this;
	}
	public contactUsPage fillUpEmail(String email) {
		inputString(emailField,email);
		return this;
	}
	
	public contactUsPage fillUpOrderReferenceID(String orderID) {
		inputString(orderReferenceIDField,orderID);
		return this;
	}

	public contactUsPage fillUpMessageBox(String msg) {
		inputString(messageField,msg);
		return this;
	}
	
	public contactUsPage clickSendMsg() {
		click(sendButton);
		return this;
	}
	
	public contactUsPage selectSubjectHeading(String heading) {
		Select select = new Select(subjectHeading);
		select.selectByValue(heading);
		return this;
	}
}
