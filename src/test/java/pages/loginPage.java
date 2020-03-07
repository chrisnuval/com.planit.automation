package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends basePage {
	public loginPage (WebDriver driver) {
		super(driver);
	}
	
	By createEmailField = By.id("email_create");
	By createAcctBtn = By.id("SubmitCreate");
	By createAcctError = By.id("create_account_error");
	
	public void fillUpCreateEmailField(String email) {
		inputString(createEmailField,email);
		
	}
	
	public void clickCreateAccountButton() {
		click(createAcctBtn);
	}
	
	public void errorCreatingAccountDueToDuplicate() {
		waitVisibility(createAcctError);
	}
}

