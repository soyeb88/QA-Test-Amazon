package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.SignInPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps extends Base {
	SignInPage sp;
	
	@Given("^Initializ the browser with chrome$")
    public void initializ_the_browser_with_chrome() throws Throwable {
		initializeChromeBrowser();	    
		sp = PageFactory.initElements(driver, SignInPage.class);
    }

    @When("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String url) throws Throwable {
        
    		navigateToSite(url);
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
    	System.out.println("Sign In Successfully!");
    }

    @And("^Click on Sign in to navigate sigin Page$")
    public void click_on_sign_in_to_navigate_sigin_page() throws Throwable {
    	sp.getSigInPage();
    }

    @And("^User enter (.+)$")
    public void user_enter(String username) throws Throwable {
    	sp.getUserName(username);
    }
    

    @And("^click on continue button$")
    public void click_on_continue_button() throws Throwable {
    	sp.getContinue();
    }

    @And("^User ente (.+)$")
    public void user_ente(String password) throws Throwable {
    	sp.getPassword(password);
    }
    
    @And("^Click on sign in button$")
    public void click_on_sign_in_button() throws Throwable {
    	sp.getSignIn();
    }

    @And("^Close to the window$")
    public void close_to_the_window() throws Throwable {
    	closeBrowser();
    }

    
    @Then("^Show username error message$")
    public void show_username_error_message() throws Throwable {
    	sp.getUserErrMsg();
    }


    @Then("^show password page error msessage$")
    public void show_password_page_error_msessage() throws Throwable {
    	sp.getPassErrMsg();
    }
}
