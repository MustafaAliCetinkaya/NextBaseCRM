package com.nextBaseCRM.runners;


import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/nextBaseCRM/stepDefinitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {

}