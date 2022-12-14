package com.sda.zdtestpol100.steps;

import com.sda.zdtestpol100.pages.HomePage;
import com.sda.zdtestpol100.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class AuthenticationStepdefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Home page is opened")
    public void homePageIsOpened() {
        homePage.openHomePage();
    }

    @When("I click Sign in link in top menu")
    public void iClickSignInLinkInTopMenu() {
        homePage.clickOnSignInLink();
    }

    @And("I fill login field {string}")
    public void iFillLoginField(String emailAddress) {
        loginPage.fillLoginEmailField(emailAddress);
    }

    @And("I fill password field {string}")
    public void iFillPasswordField(String password) {
        loginPage.fillPasswordField(password);
    }

    @And("I click Sign in button")
    public void iClickSignInButton() {
        loginPage.clickLoginButton();
    }

    @Then("I can see page for authenticated user")
    public void iCanSeePageForAuthenticatedUser() {
        System.out.println("I CAN SEE CORRECT PAGE !!!!!!");
    }

    @Then("I can see message {string}")
    public void iCanSeeMessage(String errorMessage) {
        String visibleMessage = loginPage.getLoginErrorMessage();
        String expectedMessage = errorMessage;

        assertThat("Error message is not as expected", visibleMessage.contains(expectedMessage));
    }

    @When("I add any product to my Wish list")
    public void iAddAnyProductToMyWishList() {
    }
}
