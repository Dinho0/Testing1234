package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Steps{
    @Given("I'm on the home page")
    public void i_m_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        launchBrowser();

    }

    @When("I input username and password")
    public void i_input_username_and_password() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I should be successfully logged in")
    public void i_should_be_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I search for the product")
    public void i_search_for_the_product() {
        // Write code here that turns the phrase above into concrete actions
        searchProduct();
    }

    @Then("I add item to cart")
    public void i_add_item_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        addItem();
    }

    @Given("I've added item to the cart")
    public void i_ve_added_item_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I remove item from cart")
    public void i_remove_item_from_cart() {
        // Write code here that turns the phrase above into concrete actions
    }
}
