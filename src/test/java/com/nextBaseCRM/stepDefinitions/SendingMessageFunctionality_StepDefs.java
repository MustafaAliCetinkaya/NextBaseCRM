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

public class SendingMessageFunctionality_StepDefs {
    LoginPage pageObject = new LoginPage();
    String messageText="";

    @Given("User already logged into the system with valid  {string} and {string}")
    public void user_already_logged_into_the_system_with_valid_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        pageObject.usernameBox.clear();
        pageObject.usernameBox.sendKeys(username);
        pageObject.passwordBox.sendKeys(password);
        pageObject.loginButton.click();
    }
    @When("User clicks on the message button on the Active Stream Page")
    public void user_clicks_on_the_message_button_on_the_active_stream_page() {
        BrowserUtils.clickWithJS(pageObject.messageButton);
    }
    @When("User writes any message into the writing panel on the message window")
    public void user_writes_any_message_into_the_writing_panel_on_the_message_window() {
        Driver.getDriver().switchTo().frame(pageObject.iframe);
        pageObject.writingPanel.click();

        messageText="When a bug sees Chuck Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.";
        pageObject.writingPanel.sendKeys(messageText);

    }
    @When("User clicks the send button in the message window")
    public void user_clicks_the_send_button_in_the_message_window() {
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.clickWithJS(pageObject.sendButton);
    }
    @Then("Check whether the written texts are displayed on the Active Stream Page correctly")
    public void check_whether_the_written_texts_are_displayed_on_the_active_stream_page_correctly() {
        BrowserUtils.waitForPageToLoad(5);
        System.out.println("Expected: "+messageText);
        System.out.println("Actual: "+pageObject.insertedText.getText());
        Assert.assertEquals(messageText,pageObject.insertedText.getText());
    }

}
