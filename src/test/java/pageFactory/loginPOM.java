package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtil.testBase;
public class loginPOM extends testBase {
	// Page Elements
	
	@FindBy(xpath = "//input[@id='IDToken1']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='IDToken2']")
	private WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
	private WebElement loginButton;
	// Initialize Page Elements
	public loginPOM() {
	PageFactory.initElements(driver, this);
	}
	// Actions
	
	public void enterUsername() {
		this.username.sendKeys("testuser.eori01");
	}
	public void enterPassword() {
		this.password.sendKeys("eori2014test");
	}
	public void clickLoginButton() {
		this.loginButton.click();
	}
}