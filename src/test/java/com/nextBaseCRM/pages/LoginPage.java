package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
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

}
