package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.AgileProCRMBasePage;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TCAddingAndRemovingImages {

    AgileProCRMBasePage pageObject = new AgileProCRMBasePage();

    @Given("Open the Application URL in any supported browser in order to login the system")
    public void open_the_application_url_in_any_supported_browser_in_order_to_login_the_system() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AgileProCRM"));
    }

    @When("User writes the  {string} into the username box in the authorization window.")
    public void userWritesTheIntoTheUsernameBoxInTheAuthorizationWindow(String username) {
        pageObject.usernameBox.clear();
        pageObject.usernameBox.sendKeys(username);
    }

    @When("User writes the  {string} into the password box in the authorization window.")
    public void userWritesTheIntoThePasswordBoxInTheAuthorizationWindow(String password) {
        pageObject.passwordBox.sendKeys(password);
    }

    @Then("User clicks the login button in the authorization window.")
    public void userClicksTheLoginButtonInTheAuthorizationWindow() {
        pageObject.loginButton.click();
    }

    @And("User should be able to logged into the system.")
    public void userShouldBeAbleToLoggedIntoTheSystem() {
        String expectedKeyWordInTitle = "Portal";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedKeyWordInTitle));
    }

    @And("User clicks on the Company link from the dashboard main menu on the left.")
    public void userClicksOnTheCompanyLinkFromTheDashboardMainMenuOnTheLeft() {
        pageObject.companyLink.click();
    }

    @And("User clicks on the Add News button from the company page.")
    public void userClicksOnTheAddNewsButtonFromTheCompanyPage() {
        BrowserUtils.clickWithJS(pageObject.addNewsLink);
    }

    @And("User clicks on the Details tab from the new open window which is near the preview text tab.")
    public void userClicksOnTheDetailsTabFromTheNewOpenWindowWhichIsNearThePreviewTextTab() {
        pageObject.detailsButton.click();
    }

    @And("User clicks on the upload image icon which is between dropdown menu and upload document icon, when the details tab opens.")
    public void userClicksOnTheUploadImageIconWhichIsBetweenDropdownMenuAndUploadDocumentIconWhenTheDetailsTabOpens() {
        Assert.assertTrue(pageObject.uploadImageIcon.isEnabled());
        pageObject.uploadImageIcon.click();
    }

    @And("User clicks on the dropdown menu icon which is at the top right corner of the dashed rectangular box.")
    public void userClicksOnTheDropdownMenuIconWhichIsAtTheTopRightCornerOfTheDashedRectangularBox() {
        Assert.assertTrue(pageObject.addImageDropdown.isEnabled());
        pageObject.addImageDropdown.click();
    }

    @And("User clicks on the insert file path option from the opened dropdown menu.")
    public void userClicksOnTheInsertFilePathOptionFromTheOpenedDropdownMenu() {
        pageObject.insertFilePathOption.click();
    }

    @And("User pastes pathname of the selected image into the automatically opened input box which is label as {string}.")
    public void userPastesPathnameOfTheSelectedImageIntoTheAutomaticallyOpenedInputBoxWhichIsLabelAs(String arg0) {
        String path = "/Users/mustafacetinkaya/Desktop/collections.png";
        pageObject.insertFilePathBox.sendKeys(path);
    }

    @And("User clicks on the add button.")
    public void userClicksOnTheAddButton() {
        pageObject.addButton.click();
    }

    @Then("User should be able to see the loading bar after the add button is clicked.")
    public void userShouldBeAbleToSeeTheLoadingBarAfterTheAddButtonIsClicked() {
        pageObject.loadingBar.isDisplayed();
    }

    @Then("User should be able to see the uploaded image in the rectangular box.")
    public void userShouldBeAbleToSeeTheUploadedImageInTheRectangularBox() {
        try {
            pageObject.saveButtonOnImageEditor.click();
            pageObject.uploadedPictureInRectangularBox.isDisplayed();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    @And("User clicks on the X icon which is located on the lower right corner of the uploaded image in order to remove the image, after image is loaded and seen in the rectangular box.")
    public void userClicksOnTheXIconWhichIsLocatedOnTheLowerRightCornerOfTheUploadedImageInOrderToRemoveTheImageAfterImageIsLoadedAndSeenInTheRectangularBox() {
    pageObject.deleteWithXButton.click();
    }

    @Then("User should be able to see Drag&Drop an image text when the image is removed from the box.")
    public void userShouldBeAbleToSeeDragDropDragAnImageTextWhenTheImageIsRemovedFromTheBox() {
    pageObject.dragDropText.isDisplayed();
    }
}
