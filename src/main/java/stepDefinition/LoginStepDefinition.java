package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import help.HelpBrowser;
import help.Hooks;

public class LoginStepDefinition  {
	
	
	
	HelpBrowser hlp = new HelpBrowser();
	
	@Before("@Regression")
	public void tearUp() {
		hlp.launchBrowser();
	}
	
	
	
	
	@Given("^Users is already on Home page$")
	public void users_is_already_on_Home_page() throws Throwable {
	   
		hlp.maximizeBrowser();
		hlp.implicit();
	}

	@When("^title of login page is B2B$")
	public void title_of_login_page_is_B_B() {
	   hlp.setUrl();
	   hlp.getTitle();
	   hlp.clickonLogin();
	}

	@Then("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String username, String password) {
	    hlp.enterCredentials(username, password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	 
	}
	
	
	@After
	public void tearDown() {
		hlp.closeBrowser();
	}

}
