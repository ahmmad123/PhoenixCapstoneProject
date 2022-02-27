package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.Utilities;

public class DesktopsStepdef extends Base{
	DesktopPageObject desktop = new DesktopPageObject();
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
	  desktop.textTestEnvoironment();
	Utilities.takeScreenShot("Homepage");
	logger.info("Home validated Success");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickonDesktops();
		logger.info("clicked on Desktop");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws IOException {
		desktop.clickonShowAllDesktops();
		Utilities.takeScreenShot("show all desktops ");
		logger.info("clicked on show all desktops");
		
	 
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws InterruptedException {
	   desktop.getListOfAllListOfItemsOnDesktop();
	   logger.info("user can see the size of items");
	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	  
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	    
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	  
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	
	}

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	   
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	   
	   
	}

	@When("User select quantity {int} here")
	public void user_select_quantity_here(Integer int1) {
	
	}

	@When("User click add to Cart buttonn")
	public void user_click_add_to_cart_buttonn() {
	
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	   
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	   
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	
	}
}
