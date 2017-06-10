package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {

	@Given("^I opened the URL$")
	public void i_opened_the_URL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I navigated to the URL");
	}

	@Given("^clicked on Register link$")
	public void clicked_on_Register_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Register Link Clicked");
	}

	@When("^I enter my email id$")
	public void i_enter_my_email_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Email Id Entered");
	}

	@When("^clicked on register$")
	public void clicked_on_register() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I cliked on Register");
	}

	@Then("^I should get the registration form$")
	public void i_should_get_the_registration_form() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I can see the registration form");
	}

	@When("^I enter invalid email id$")
	public void i_enter_invalid_email_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I entered Invalid email id");
	}

	@Then("^I should get error message$")
	public void i_should_get_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I get message : email already used");
	}

}
