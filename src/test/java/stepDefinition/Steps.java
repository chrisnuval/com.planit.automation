package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

import helper.browserInitialize;
import pages.contactUsPage;
import pages.landingPage;

public class Steps {
	@Given("^User is in the website (.*)$")
	public void userOpensWebsite(String urlName) throws Throwable {
		browserInitialize.startBrowser("chrome",urlName);
		
	}
	
	@Given("User clicks on Contact Us button")
	public void user_clicks_on_Contact_Us_button() {
		landingPage.contactUsButton.click();
		
	}

	@When("User selects (.*) in the Subject Heading dropdown")
	public void user_selects_in_the_Subject_Heading_dropdown(String subjHeading) {
		contactUsPage.subjectHeadingSelect.selectByValue(subjHeading);
	}

	@When("User enters (.*) in the Email address field")
	public void user_enters_email_in_the_Email_address_field(String email) {
	    contactUsPage.emailField.sendKeys(email);
	    
	}

	@When("User enters (.*) in the Order reference field")
	public void user_enters_in_the_Order_reference_field(String orderNumber) {
	    contactUsPage.orderReferenceField.sendKeys(orderNumber);
	}

	@When("User adds a message in the Message field")
	public void user_adds_a_message_in_the_Message_field() {
	    contactUsPage.messageField.sendKeys("test message");
	   
	}

	@When("User clicks send button")
	public void user_clicks_send_button() {
	    contactUsPage.sendButton.click();
	   
	}

	@Then("User has successfully sent a message.")
	public void user_has_successfully_sent_a_message() {
	    boolean isSendingSucessful=contactUsPage.successAlert.isDisplayed();
	    assertTrue(isSendingSucessful);
	}

}