package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import com.nextBaseCRM.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

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
        String actualUsername = pageObject.usernameOnTheDropdown.getText().toLowerCase().replaceAll("\\s", "");
        Assert.assertTrue(actualUsername.contains(expectedUsername));
    }

    //Invalid data results
    @Then("User should not be able to log in and a warning message should be displayed on the top left corner of the login box.")
    public void user_should_not_be_able_to_log_in_and_a_warning_message_should_be_displayed_on_the_top_left_corner_of_the_login_box() {
        BrowserUtils.waitForPageToLoad(3);
        String expectedPageTitle = "Authorization";
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        Assert.assertTrue(pageObject.warningMessage.isDisplayed());
    }

    //5 tries with invalid credentials
    @When("User tries to login with invalid credentials")
    public void user_tries_to_login_with_invalid_credentials() {
        for (int i = 0; i < 20; i++) {
            pageObject.usernameBox.clear();
            pageObject.usernameBox.sendKeys(ReusableMethods.getFaker().internet().emailAddress());
            pageObject.passwordBox.sendKeys(ReusableMethods.getFaker().internet().password());
            pageObject.loginButton.click();
        }
    }

    @Then("User should not be able to log in and  an error message saying {string} should be displayed.")
    public void user_should_not_be_able_to_log_in_and_an_error_message_saying_should_be_displayed(String expectedErrorMessage) {
        BrowserUtils.waitForPageToLoad(3);
        String expectedPageTitle = "Authorization";
        String actualPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

        String actualErrorMessage = pageObject.warningMessage.getText();

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("Check whether the page title is written correctly")
    public void check_whether_the_page_title_is_written_correctly() {
        String expectedPageTitle = "Authorization";
        String actualPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @Then("Check whether the login box header is written correctly")
    public void check_whether_the_login_box_header_is_written_correctly() {
        String expectedBoxHeader = "Authorization";
        String actualBoxHeader = pageObject.loginBoxHeader.getText();
        Assert.assertEquals(expectedBoxHeader, actualBoxHeader);
    }

    @Then("Check whether the remember me text is written correctly")
    public void check_whether_the_remember_me_text_is_written_correctly() {
        String expectedRememberText = "Remember me on this computer";
        String actualRememberText = pageObject.rememberMeText.getText();
        Assert.assertEquals(expectedRememberText, actualRememberText);
    }

    @Then("Check whether the {string} text is written correctly")
    public void check_whether_the_text_is_written_correctly(String string) {
        try {
            String expectedForgotPasswordText = "FORGOT YOUR PASSWORD?";
            String actualForgotPasswordText = pageObject.forgotPasswordLink.getText();
            Assert.assertEquals(expectedForgotPasswordText, actualForgotPasswordText);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Then("Check if the link which is label as forgot password link is working properly")
    public void check_if_the_link_which_is_label_as_forgot_password_link_is_working_properly() {
        pageObject.forgotPasswordLink.click();
        String expectedPopupHeaderText = "Get Password";
        String actualPopupHeaderText = pageObject.popupHeaderText.getText();
        Assert.assertEquals(expectedPopupHeaderText, actualPopupHeaderText);
        Driver.getDriver().navigate().back();
    }

    @Then("Check whether the text on the login button is written correctly")
    public void check_whether_the_text_on_the_login_button_is_written_correctly() {
        String expectedLoginButtonText = "Log In";
        String actualLoginButtonText = pageObject.getLoginButtonText.getAttribute("value");
        Assert.assertEquals(expectedLoginButtonText, actualLoginButtonText);
    }
    @Then("Check whether the placeholder texts in the password and username boxes are written correctly")
    public void check_whether_the_placeholder_texts_in_the_password_and_username_boxes_are_written_correctly() {
        String expectedUsernameBoxText = "Username or Email Address";
        String expectedPasswordBoxText = "Password";

        String actualUsernameBoxText = pageObject.usernameBox.getAttribute("placeholder");
        String actualPasswordBoxText = pageObject.passwordBox.getAttribute("placeholder");

        Assert.assertEquals(expectedPasswordBoxText, actualPasswordBoxText);
        Assert.assertEquals(expectedUsernameBoxText, actualUsernameBoxText);
    }

}
