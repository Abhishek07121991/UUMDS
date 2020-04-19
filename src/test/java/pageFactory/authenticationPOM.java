package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtil.testBase;
public class authenticationPOM extends testBase {
	// Page Elements
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]")
	private WebElement authentication;
	
	// Initialize Page Elements
	public authenticationPOM() {
	PageFactory.initElements(driver, this);
	}
	// Actions
	
	public void clickAuthentication() {
		this.authentication.click();
	}
	
}