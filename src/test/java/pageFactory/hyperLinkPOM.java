package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtil.testBase;
public class hyperLinkPOM extends testBase {
	// Page Elements
	@FindBy(xpath = "//a[contains(text(),\"Authentification par nom d'utilisateur et mot de p\")]")
	private WebElement hyperlink;
	
	// Initialize Page Elements
	public hyperLinkPOM() {
	PageFactory.initElements(driver, this);
	}
	// Actions
	public void clickHyperlink() {
		this.hyperlink.click();
	}
	
}