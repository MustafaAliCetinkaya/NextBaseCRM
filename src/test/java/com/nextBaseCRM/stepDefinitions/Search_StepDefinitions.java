package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.SearchPage;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Search_StepDefinitions
{
    SearchPage searchPage = new SearchPage();

    @Given("User enters {string} and password and logins")
    public void user_enters_username_and_password_and_logins(String user) {
        Driver.getDriver().get("https://qa.agileprocrm.com/");
        searchPage.login(user, "UserUser");
    }
    @Then("user clicks Filter and search bar")
    public void user_clicks_filter_and_search_bar () {
        searchPage.filter_and_search_bar.click();
        searchPage.reset_button.click();
        searchPage.filter_and_search_bar.click();
    }
    @When("user enters {string} into Author text bar and clicks the name in the menu")
    public void user_enters_name_into_author_text_bar_and_clicks_the_name_in_the_menu (String name){
        searchPage.author_text_bar.sendKeys(name);
        BrowserUtils.sleep(5);
        searchPage.wooden_spoon_in_menu.click();
    }
    @When("user enters {string} into To text bar and clicks the name in the menu")
    public void user_enters_name_into_to_text_bar_and_clicks_the_name_in_the_menu (String name){
        searchPage.to_text_bar.sendKeys(name);
        BrowserUtils.sleep(5);
        searchPage.wooden_spoon_in_menu.click();
    }
    @When("user clicks the Search button")
    public void user_clicks_the_search_button () {
        searchPage.search_button.click();
    }
    @Then("user sees Author: {string} in Filter and search bar")
    public void user_sees_author_in_filter_and_search_bar (String name){
        Assert.assertTrue(searchPage.author_wooden_spoon.isDisplayed());
    }
    @Then("user sees To: {string} in Filter and search bar")
    public void user_sees_to_in_filter_and_search_bar (String name){
        Assert.assertTrue(searchPage.to_wooden_spoon.isDisplayed());
    }
}