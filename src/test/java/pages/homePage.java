package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends basePage {
	
	public homePage (WebDriver driver) {
		super(driver);
	}

	By loginBtn = By.className("login");
	
	public void clickLoginBtn() {
		click(loginBtn);
	}
}
