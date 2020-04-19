package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.authenticationPOM;
import pageFactory.homePagePOM;
import pageFactory.hyperLinkPOM;
import pageFactory.loginPOM;
import testUtil.testBase;

public class LoginStepDefinition extends testBase {
	
	hyperLinkPOM hyperLink;
	//=new loginPOM() ;
	loginPOM loginPage2;
	
	homePagePOM homePage;
	
	authenticationPOM Authentication;
	
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
    	//initialization("http://ljavad01.finbel.intra:7102/euMockUp/Login.action");
    	
       // Belly belly = new Belly();
        //belly.eat(cukes);
    }
    
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		
		//initialization("http://ljavad01.finbel.intra:7102/euMockUp/Login.action");
		initialization("http://ljavad01.finbel.intra:7102/uumdsweb");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	@Given("^user clicks on the hyperlink$")
	public void user_clicks_on_the_hyperlink() {
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		hyperLink =new hyperLinkPOM();
		hyperLink.clickHyperlink();
		
		
		}
	
	@Given("^user click on the Authentication$")
	public void user_click_on_the_Authentication() {
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		Authentication =new authenticationPOM();
		Authentication.clickAuthentication();
		
		}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		loginPage2=new loginPOM();
		loginPage2.enterUsername();
		loginPage2.enterPassword();
	    
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		loginPage2=new loginPOM();
		loginPage2.clickLoginButton();
	    
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title =driver.getTitle();
		   System.out.println(title);
	}

	@When("^user enters Business Profile ID$")
	public void user_enters_Business_Profile_ID() {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		homePage =new homePagePOM();
		homePage.enterProfileID();
		
	}
	@And("^user enters Business Profile Name$")
	public void user_enters_Business_Profile_Name() {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		homePage =new homePagePOM();
		homePage.enterProfileName();
	   
	}
	@And("^user enters Business Profile Description$")
	public void user_enters_Business_Profile_Description() {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		homePage =new homePagePOM();
		homePage.enterProfileDescription();
	}
	@And("^user enters Aplication ID$")
	public void user_enters_Aplication_ID() {
		homePage =new homePagePOM();
		homePage.enterApplicationID();
	}
	@And("^user enters Actor ID$")
	public void user_enters_Actor_ID() {
		homePage =new homePagePOM();
		homePage.enterActorID();
	}
	@And("^user enters FAS Role$")
	public void user_enters_FAS_Role() {
		homePage =new homePagePOM();
		homePage.enterFASRole();
	}
	@And("^clciks on Add button$")
	public void clciks_on_Add_button() {
		homePage =new homePagePOM();
		homePage.clickAddButton();
	   
	}
	@And("^clicks on submit button$")
	public void clicks_on_submit_button() {
		homePage =new homePagePOM();
		homePage.clickSubmitButton();
	   
	}
	@Then("^record is added$")
	public void record_is_added() {
	    System.out.println("Record is added");
	}
	@When("^user clicks on Add applications$")
	public void user_clicks_on_Add_applications() {
		homePage =new homePagePOM();
		homePage.clickAddApplicationsButton();
	}

	@When("^user enters Application ID$")
	public void user_enters_Application_ID() {
		homePage =new homePagePOM();
		homePage.enterApplicationID();
	}
	@When("^user enters Application name$")
	public void user_enters_Application_name() {
		homePage =new homePagePOM();
		homePage.enterApplicationName();
	}

	@When("^user clicks on add button$")
	public void user_clicks_on_add_button() {
	    homePage =new homePagePOM();
		homePage.clickAddApplicationButton();
	}

	@When("^user clicks on submit button$")
	public void user_clicks_on_submit_button() {
		homePage =new homePagePOM();
		homePage.clickSubmitApplicationButton();
	}
	@Then("application is added")
	public void application_is_added() {
		
	    System.out.println("Record is created");
	}
	@When("^user clicks on Add Actors$")
	public void user_clicks_on_Add_Actors() {
		homePage =new homePagePOM();
		homePage.clickAddActorsButton();
	    
	}

	@When("^user enters Actor name$")
	public void user_enters_Actor_name() {
		homePage =new homePagePOM();
		homePage.enetrActorName();
	   
	}
	@When("^user clicks on Add button$")
	public void user_clicks_on_Add_button() {
		homePage =new homePagePOM();
		homePage.clickAddActorButton();
	}

	@When("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() {
		homePage =new homePagePOM();
		homePage.clickSubmitActorsButton();
	}
	@Then("^actor is added$")
	public void actor_is_added() {
		 
		 homePage =new homePagePOM();
		 //System.out.print(homePage.getSuccessmessage());
		
	   System.out.println("Actor is added");	
		 }
	
	@Then("^user close the application$")
	public void user_close_the_application() {
		homePage =new homePagePOM();
		homePage.clickLogoutButton();
	    
	}

}

