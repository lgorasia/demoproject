package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws InterruptedException {
        new HomePage().clickOnAccept();


    }

    @Then("^I should see login Link on Homepage\\.$")
    public void iShouldSeeLoginLinkOnHomepage() {
       String actualText= new HomePage().clickOnLogin();
       String expectedText = "Log In";
       Assert.assertEquals(expectedText,actualText);
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
