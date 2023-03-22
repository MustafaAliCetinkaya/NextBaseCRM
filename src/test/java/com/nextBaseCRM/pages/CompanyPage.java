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

public class CompanyPage {
    public CompanyPage() {
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

    @FindBy(css = "span#user-name")
    public WebElement usernameButton;

    @FindBy(css = "li#bx_left_menu_menu_about_sect a")
    public WebElement companyLink;

    @FindBy(xpath = "//span[.='Add News']")
    public WebElement addNewsLink;

    @FindBy(xpath = "//span[.='Insert file path']")
    public WebElement insertFilePathOption;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButtonOnImageEditor;

    @FindBy(xpath = "//span[.='Now loading...']")
    public WebElement loadingBar;

    @FindBy(css = "span#tab_cont_cedit2")
    public WebElement detailsButton;

    @FindBy(css = "a#bx_file_detail_pictureThumbModePreview")
    public WebElement uploadImageIcon;

    @FindBy(css = "span#bx_file_detail_picture_add")
    public WebElement addImageDropdown;

    @FindBy(css = "input#savebtn")
    public WebElement saveButtonOnAddNewsTab;

    @FindBy(css = "div.adm-fileinput-item-preview-img span span canvas")
    public WebElement uploadedPictureInRectangularBox;

    @FindBy(css = "input#bx_file_detail_picturefilePath_0_path")
    public WebElement insertFilePathBox;


    @FindBy(css = "span.adm-fileinput-item-panel-btn.adm-btn-del")
    public WebElement deleteWithXButton;


    @FindBy(css = "span#bx_file_detail_pictureNotice")
    public WebElement dragDropText;


    /*public void selectFromDropdownByIndex(int index){
        dropdown.click();
        Select select=new Select(dropdown);
        select.selectByIndex(index);
    }*/


    public void loginAndCheckAddNewsButton() {
        String password = "UserUser";
        String domainName = "@cybertekschool.com";
        List<String> email = new ArrayList<>(Arrays.asList("hr", "helpdesk", "marketing"));

        for (int i = 1; i < 5; i++) {
            usernameBox.clear();
            usernameBox.sendKeys(email.get(0) + i + domainName);
            passwordBox.sendKeys(password);

            loginButton.click();
            BrowserUtils.waitForClickablility(companyLink, 30);
            companyLink.click();
            try {
                BrowserUtils.clickWithJS(addNewsLink);
                WebElement dropdownElement = Driver.getDriver().findElement(By.xpath("(//div[@id='bx-admin-prefix'])[1]//select"));
                BrowserUtils.waitForVisibility(dropdownElement, 30);
                Select select = new Select(dropdownElement);
                if (select.getFirstSelectedOption().getText().equals("News")) {
                    System.out.println("Dropdown selection error: " + email.get(0) + i);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("User: " + email.get(0) + i + " ==> Add News button is not displayed");

            }
            Driver.getDriver().navigate().refresh();
            usernameButton.click();
            logoutButton.click();


            usernameBox.clear();
            usernameBox.sendKeys(email.get(1) + i + domainName);
            passwordBox.sendKeys(password);

            loginButton.click();
            BrowserUtils.waitForClickablility(companyLink, 20);
            companyLink.click();
            try {
                BrowserUtils.clickWithJS(addNewsLink);
                WebElement dropdownElement = Driver.getDriver().findElement(By.xpath("(//div[@id='bx-admin-prefix'])[1]//select"));
                BrowserUtils.waitForVisibility(dropdownElement, 30);
                Select select = new Select(dropdownElement);
                if (select.getFirstSelectedOption().getText().equals("News")) {
                    System.out.println("Dropdown selection error: " + email.get(1) + i);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("User: " + email.get(1) + i + " ==> Add News button is not displayed");

            }
            Driver.getDriver().navigate().refresh();
            usernameButton.click();
            logoutButton.click();


            usernameBox.clear();
            usernameBox.sendKeys(email.get(2) + i + domainName);
            passwordBox.sendKeys(password);

            loginButton.click();
            BrowserUtils.waitForClickablility(companyLink, 20);
            companyLink.click();
            try {
                BrowserUtils.clickWithJS(addNewsLink);
                WebElement dropdownElement = Driver.getDriver().findElement(By.xpath("(//div[@id='bx-admin-prefix'])[1]//select"));
                BrowserUtils.waitForVisibility(dropdownElement, 30);
                Select select = new Select(dropdownElement);
                if (select.getFirstSelectedOption().getText().equals("News")) {
                    System.out.println("Dropdown selection error: " + email.get(2) + i);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("User: " + email.get(2) + i + " ==> Add News button is not displayed");

            }
            Driver.getDriver().navigate().refresh();
            usernameButton.click();
            logoutButton.click();

        }
    }
}
