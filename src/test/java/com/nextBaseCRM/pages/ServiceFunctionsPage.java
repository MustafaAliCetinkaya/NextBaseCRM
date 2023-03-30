package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceFunctionsPage {

    public ServiceFunctionsPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputUsername;

    @FindBy (xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@title='Services']")
    public WebElement servicesButton;

    @FindBy (xpath = "(//a[@href='/services/learning/']) [2]")
    public WebElement trainingButton;

    @FindBy (xpath = "//a[@href='/services/learning/mycourses.php']")
    public WebElement myCoursesButton;

    @FindBy (xpath = "//span[@id='pagetitle']")
    public WebElement coursePageTitle;

    @FindBy (xpath = "//a[@href='/services/learning/gradebook.php']")
    public WebElement gradeBookButton;

    @FindBy (xpath = "//span[@id='pagetitle']")
    public WebElement testResultPageTitle;

    @FindBy (xpath = "//a[@href='/services/learning/profile.php']")
    public WebElement profileButton;

    @FindBy (xpath = "//input[@name='NAME']")
    public WebElement inputFirstName;

    @FindBy (xpath = "//input[@name='LAST_NAME']")
    public WebElement inputLastName;

    @FindBy (xpath = "//input[@name='EMAIL']")
    public WebElement inputEMail;

    @FindBy (xpath = "//input[@name='PERSONAL_WWW']")
    public WebElement inputWebSite;

    @FindBy (xpath = "//input[@name='PERSONAL_ICQ']")
    public WebElement inputIcq;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement saveButton;
}