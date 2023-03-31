package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[type=\"text\"]")
    public WebElement usernameBox;

    @FindBy(css = "input[type=\"password\"]")
    public WebElement passwordBox;


    @FindBy(css = "input.login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutButton;

    @FindBy(css = "span.user-name")
    public WebElement usernameOnTheDropdown;


    @FindBy(css = "div.errortext")
    public WebElement warningMessage;


    @FindBy(css = "div.log-popup-header")
    public WebElement loginBoxHeader;


    @FindBy(css = "a.login-link-forgot-pass")
    public WebElement forgotPasswordLink;


    @FindBy(css = "label.login-item-checkbox-label")
    public WebElement rememberMeText;


    @FindBy(css = "input.login-btn")
    public WebElement getLoginButtonText;


    @FindBy(css = "div.log-popup-header")
    public WebElement popupHeaderText;

    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageButton;

    @FindBy(xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    public WebElement iframe;

    @FindBy(css = "button#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement insertedText;

    @FindBy(xpath = "//body")
    public WebElement writingPanel;

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activity_stream_bar;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement error_message;

    // -------------------Methods related to page------------------------------------

    public void login(String username, String password){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }

}
