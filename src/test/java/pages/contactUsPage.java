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
	By successAlert = By.xpath("alert alert-success");
	WebElement subjectHeading = driver.findElement(By.id("id_contact"));

	
	public void fillUpEmail(String email) {
		inputString(emailField,email);
		
	}
	
	public void fillUpOrderReferenceID(String orderID) {
		inputString(orderReferenceIDField,orderID);
	
	}

	public void fillUpMessageBox(String msg) {
		inputString(messageField,msg);
		
	}
	
	public void clickSendMsg() {
		click(sendButton);
		
	}
	
	public void selectSubjectHeading(String heading) {
		Select select = new Select(subjectHeading);
		select.selectByVisibleText(heading);
	}
	
	public void validateIfMsgSent() {
		waitVisibility(successAlert);
	}
}
