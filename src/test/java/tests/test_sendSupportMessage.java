package tests;

import org.testng.annotations.Test; 	
import pages.contactUsPage;

public class test_sendSupportMessage extends test_initialize {
	
	@Test
	public void init() throws Exception{
		contactUsPage landingPage = new contactUsPage(driver);
		landingPage.selectSubjectHeading("Customer service");
		landingPage.fillUpEmail("test@test.com");
		landingPage.fillUpOrderReferenceID("1000");
		landingPage.fillUpMessageBox("Test Message");
		landingPage.clickSendMsg();
		
	}
}
