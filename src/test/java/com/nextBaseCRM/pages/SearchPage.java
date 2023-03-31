package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage
{
    public SearchPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement login;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement pw;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement login_button;

    @FindBy(xpath = "//input[@placeholder='Filter and search']")
    public WebElement filter_and_search_bar;

    @FindBy(name = "CREATED_BY_ID_label")
    public WebElement author_text_bar;

    @FindBy(xpath = "//div[.='Wooden Spoon']/div")
    public WebElement wooden_spoon_in_menu;

    @FindBy(xpath = "//div[.='Author: Wooden Spoon']/div[1]")
    public WebElement author_wooden_spoon;

    @FindBy(name = "TO_label")
    public WebElement to_text_bar;

    @FindBy(xpath = "//div[.='To: Wooden Spoon']/div[1]")
    public WebElement to_wooden_spoon;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")
    public WebElement search_button;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement reset_button;


    public void login(String username, String password)
    {
        login.sendKeys(username);
        pw.sendKeys(password);
        login_button.click();
    }
}