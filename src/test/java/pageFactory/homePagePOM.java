package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testUtil.testBase;

public class homePagePOM extends testBase {
	
	
	
	//Page elements
	
	@FindBy(xpath="//input[@id='businessProfileId']")
	private WebElement BusinessProfileId; 
	
	@FindBy(xpath="//input[@id='businessProfileName']")
	private WebElement BusinessProfileName;
	
	@FindBy(xpath="//input[@id='businessProfileDesc']")
	private WebElement BusinessProfileDescription;
	
	@FindBy(xpath="//input[@id='applicationId']")
	private WebElement ApplicationID;
	
	@FindBy(xpath="//input[@id='actorId']")
	private WebElement ActorID;
	
	@FindBy(xpath="//input[@id='FASRole']")
	private WebElement FASRole;
	
	@FindBy(xpath="//div[@id='profileButtons']//input[1]")
	private WebElement addButton;
	
	@FindBy(xpath="//div[@id='profileButtons']//input[2]")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[@id='addAppActorButtons']//input[1]")
	private WebElement addApplicationsButton;
	
	@FindBy(xpath="//input[@id='appId']")
	private WebElement applicationID;
	
	@FindBy(xpath="//input[@id='applicationName']")
	private WebElement applicationName;
	
	@FindBy(xpath="//body//div[@id='margen']//div//div[@id='myDynamicTable']//input[1]")
	private WebElement addApplicationButton;
	
	@FindBy(xpath="//form[@id='applicationForm']//input[2]")
	private WebElement submitApplicationsButton;
	
	@FindBy(xpath="//div[@id='addAppActorButtons']//input[2]")
	private WebElement addActorsButton;
	
	@FindBy(xpath="//input[@id='actrId']")
	private WebElement addActorID;
	
	@FindBy(xpath="//input[@id='actorName']")
	private WebElement addActorName;
	
	@FindBy(xpath="//form[@id='actorForm']//div[@id='myDynamicTable']//input[1]")
	private WebElement addActorButton;
	
	@FindBy(xpath="//form[@id='actorForm']//input[2]")
	private WebElement submitActorsButton;

	@FindBy(xpath="//input[@id='logout']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//span[contains(text(),'Record saved sucessfully...')]")
	private WebElement successmessage;
	
	//Initialize Page Elements
	
	public homePagePOM() {
		PageFactory.initElements(driver, this);
		}
	
	//Actions
	
    public void enterProfileID() {
    	this.BusinessProfileId.sendKeys("123456");
    }
    
    public void enterProfileName() {
    	this.BusinessProfileName.sendKeys("Peter");
    }
    
    public void enterProfileDescription() {
    	this.BusinessProfileDescription.sendKeys("Meeting");
    }
    public void enterApplicationID() {
    	this.ApplicationID.sendKeys("GTP");
    }
    
    public void enterActorID() {
    	this.ActorID.sendKeys("CR");
    }
    
    public void enterFASRole() {
    	this.FASRole.sendKeys("Testing");
    }
    
    public void clickAddButton() {
    	this.addButton.click();
    }
    
    public void clickSubmitButton() {
    	this.submitButton.click();
    }
    
    public void clickAddApplicationsButton() {
    	this.addApplicationsButton.click();
    }
    
    public void enterApplicationsID() {
    	this.applicationID.click();
    }
    
    public void enterApplicationName() {
    	this.applicationName.click();
    }
    
    public void clickAddApplicationButton() {
    	this.addApplicationButton.click();
    }
    
    public void clickSubmitApplicationButton() {
    	this.submitApplicationsButton.click();
    }
    
    public void clickAddActorsButton() {
    	this.addActorsButton.click();
    }
    
    public void enterActorsID() {
    	this.addActorID.click();
    }
    
    public void enetrActorName() {
    	this.addActorName.click();
    }
    
    public void clickAddActorButton() {
    	this.addActorButton.click();
    }
    
    public void clickSubmitActorsButton() {
    	this.submitActorsButton.click();
    }
    
    public void clickLogoutButton() {
    	this.logoutButton.click();
    }
    public void getSuccessmessage() {
    	this.successmessage.getText();
    }
    
}

