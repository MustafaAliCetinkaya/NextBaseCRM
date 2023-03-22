package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFunctionality_StepDefinitions {

    LoginPage pageObject = new LoginPage();

    @Given("User opens the Application URL in any supported browser in order to login the system")
    public void user_opens_the_application_url_in_any_supported_browser_in_order_to_login_the_system() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("User writes the  {string} into the username box in the authorization window.")
    public void userWritesTheIntoTheUsernameBoxInTheAuthorizationWindow(String username) {
        pageObject.usernameBox.clear();
        pageObject.usernameBox.sendKeys(username);
    }

    @When("User writes the  {string} into the password box in the authorization window.")
    public void userWritesTheIntoThePasswordBoxInTheAuthorizationWindow(String password) {
        pageObject.passwordBox.sendKeys(password);
    }

    @Then("User clicks the login button in the authorization window.")
    public void userClicksTheLoginButtonInTheAuthorizationWindow() {
        pageObject.loginButton.click();
    }

    @Then("User should be able to see {string} on the dropdown which is at the right top corner of the Activity Stream page.")
    public void user_should_be_able_to_see_on_the_dropdown_which_is_at_the_right_top_corner_of_the_activity_stream_page(String expectedUsername) {
        String actualUsername = pageObject.usernameOnTheDropdown.getText().toLowerCase().replaceAll("\\s","");
        Assert.assertTrue(actualUsername.contains(expectedUsername));
    }
}
