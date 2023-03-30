package com.nextBaseCRM.stepDefinitions;


import com.nextBaseCRM.pages.RelatedKeywordPage;
import com.nextBaseCRM.pages.SearchValue;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RelatedKeywords_StepDefinition {
    SearchValue searchValues = new SearchValue();
    RelatedKeywordPage relatedKeyword =new RelatedKeywordPage();

    @When("User on the homepage can write {string} to the search box")
    public void userOnTheHomepageCanWriteToTheSearchBox(String relatedKeyword) {
    searchValues.searchKeyword.sendKeys(relatedKeyword);
    }

    @Then("User should see the related keyword written on the search box")
    public void userShouldSeeTheRelatedKeywordWrittenOnTheSearchBox() {
        BrowserUtils.sleep(2);
        System.out.println(relatedKeyword.relatedKeyword1.isDisplayed());
        BrowserUtils.sleep(2);
        System.out.println(relatedKeyword.relatedKeyword2.isDisplayed());
        BrowserUtils.sleep(2);
        System.out.println(relatedKeyword.relatedKeyword3.isDisplayed());
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }


}
