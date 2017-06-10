package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.SignInAction;
import modules.SignoutAction;
import pageObjects.AutomationHomePage;
import pageObjects.LoginPage;



public class BasicLoginLogout {
	
	public WebDriver driver;
  //  public List<HashMap<String,String>> datamap;
    public HashMap<String,String> map;
    
    
    
	
	public BasicLoginLogout() {
		driver = Hooks.driver;
		map=Hooks.map;
     	
     	System.out.println("Map is"+map);
     	
	}

	@Given("^I open automationpractice website$")
	public void i_open_automationpractice_website() throws Throwable {
		
		System.out.println("Opening Url");
		
		driver.get("http://automationpractice.com");
	
	
	}

	@When("^I sign in$")
	public void i_sign_in() throws Throwable {
		
		
		System.out.println("Signing In");
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		SignInAction.Execute(driver,map);
	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
	    System.out.println("Sigining Out");
	    SignoutAction.Execute(driver,map);
	}

}
