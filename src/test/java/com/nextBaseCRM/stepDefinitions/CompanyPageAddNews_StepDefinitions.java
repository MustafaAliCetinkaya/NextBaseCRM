package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.AgileProCRMBasePage;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import org.junit.Test;

public class CompanyPageAddNews_StepDefinitions extends AgileProCRMBasePage {
    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("AgileProCRM"));
        loginAndCheckAddNewsButton();
        Driver.closeDriver();
    }
}
