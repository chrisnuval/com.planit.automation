package tests;

import org.testng.annotations.Test;

import pages.homePage;
import pages.loginPage;

public class test_createAccount extends test_initialize{
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
