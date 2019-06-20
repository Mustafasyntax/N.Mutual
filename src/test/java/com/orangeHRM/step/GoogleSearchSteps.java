package com.orangeHRM.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
	    System.out.println("I am on google page");
	}

	@When("I typed search item")
	public void i_typed_search_item() {
	   System.out.println("I search for items");
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    System.out.println("clicked search button");
	}

	@Then("I see search results")
	public void i_see_search_results() {
	   System.out.println("results are displayed");
	}
}
