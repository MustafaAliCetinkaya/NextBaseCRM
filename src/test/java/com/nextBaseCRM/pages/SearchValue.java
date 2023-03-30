package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchValue {
    public SearchValue() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id=\"search-textbox-input\"]")
    public WebElement searchKeyword;

    @FindBy(css = "span[class=\"search-title-top-delete\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='search-title-top-item-text']")
    public WebElement conversationsKeyword;
    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement conversationsTitle;


}
