package com.automationexercise.tests.Tests;

import com.automationexercise.Pages.SignUpPage;
import com.automationexercise.Utilities.Utility;
import com.automationexercise.Utilities.WaitsUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.automationexercise.DriverManager.DriverFactory.createInstance;
import static com.automationexercise.DriverManager.DriverManager.getDriver;
import static com.automationexercise.DriverManager.DriverManager.quit;
import static com.automationexercise.Utilities.DataUtils.getJsonData;
import static com.automationexercise.Utilities.Utility.openWebsite;

public class SignUpInTest{
    String name,pass;

    @Test
    public void signUp() throws InterruptedException {
        name = getJsonData("data", "name");
        pass = getJsonData("data", "pass");
        new SignUpPage(getDriver())
                .openSignUpPage()
                .enterUserName(name)
                .enterPassword(pass)
                .clickFinishSignUp();
        Thread.sleep(2000);
        WaitsUtils.generalWait(getDriver(), 10);
        Utility.acceptAlert();
        Thread.sleep(2000);
    }
    @BeforeTest
    public void setUp() {
        createInstance("chrome");
        openWebsite("https://www.demoblaze.com/");
    }
    @AfterTest
    public void tearDown() {quit();}

}
