package com.bank.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay Vaghani
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/bank/steps",
        // these are three different reports
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        dryRun = false, // is not execute feature file -
        tags =  "@smoke"    //"@sanity"   //@Regiter or @sanity or anythg to execute
)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}
