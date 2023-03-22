package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.CompanyPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CompanyPageAddingAndRemovingImages_StepDefinitions {
    CompanyPage pageObject = new CompanyPage();

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
