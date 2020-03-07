package tests;

import org.testng.annotations.Test; 	
import pages.contactUsPage;
import pages.homePage; 
import pages.loginPage;
public class test_planit extends test_initialize {
	
	@Test
	public void sendContactUsMessage() throws Exception{
		contactUsPage contactUsPage = new contactUsPage(driver);
		
		contactUsPage.fillUpEmail("test@test.com");
		contactUsPage.fillUpOrderReferenceID("1000");
		contactUsPage.fillUpMessageBox("Test Message");
		contactUsPage.selectSubjectHeading("Customer service");
		contactUsPage.clickSendMsg();
		contactUsPage.validateIfMsgSent();
		 
	}
	
	@Test
	public void createAccount() throws Exception {
		homePage homePage = new homePage(driver);
		homePage.clickLoginBtn();
		
		loginPage loginPage = new loginPage(driver);
		loginPage.fillUpCreateEmailField("test@test.com");
		loginPage.clickCreateAccountButton();
		loginPage.errorCreatingAccountDueToDuplicate();
	}
	
	
}
