package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.SearchValue;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConversationPage_StepDefinitions {

    LoginPage pageObject = new LoginPage();
    SearchValue searchValues = new SearchValue();

    @Given("{string} navigates website and enters valid credentials,should see homepage")
    public void navigates_website_and_enters_valid_credentials_should_see_homepage(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        pageObject.usernameBox.sendKeys(user);
        pageObject.passwordBox.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        pageObject.loginButton.click();


    }

    @When("User on the homepage should write {string}  to the search box")
    public void user_on_the_homepage_should_write_to_the_search_box(String searchValue) {
        searchValues.searchKeyword.sendKeys(searchValue);
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {

        searchValues.searchButton.click();
    }


    @And("User should see the conversations keyword")
    public void userShouldSeeTheConversationsKeyword() {
        BrowserUtils.sleep(2);
        System.out.println(searchValues.conversationsKeyword.isDisplayed());
    }

    @And("User clicks on the Conversation keyword")
    public void userClicksOnTheConversationKeyword() throws InterruptedException {
        Thread.sleep(3000);
        searchValues.conversationsKeyword.click();
    }

    @Then("User should see Conversations on the opened page")
    public void userShouldSeeConversationsOnTheOpenedPage() {
        BrowserUtils.waitForVisibility(searchValues.conversationsTitle,10);
        System.out.println(searchValues.conversationsTitle.isDisplayed());
    }
}
