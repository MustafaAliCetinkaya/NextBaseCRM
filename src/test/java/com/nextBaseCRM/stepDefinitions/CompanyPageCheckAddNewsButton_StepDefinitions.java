package com.nextBaseCRM.stepDefinitions;

import com.nextBaseCRM.pages.CompanyPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import org.junit.Test;

public class CompanyPageCheckAddNewsButton_StepDefinitions extends CompanyPage {
    @Test
    public void loginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginAndCheckAddNewsButton();
        Driver.closeDriver();
    }
}
