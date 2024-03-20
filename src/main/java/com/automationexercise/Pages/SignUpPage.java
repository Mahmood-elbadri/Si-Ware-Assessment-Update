package com.automationexercise.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.automationexercise.DriverManager.DriverManager.getDriver;
import static com.automationexercise.Utilities.Utility.clicking;
import static com.automationexercise.Utilities.Utility.sendData;

public class SignUpPage {
    private final WebDriver driver;
    private final By signUpBtn = By.xpath("//a[@id='signin2']");
    private final By userNameTxtBox = By.xpath("//input[@id='sign-username']");
    private final By passTxtBox = By.xpath("//input[@id='sign-password']");
    private final By finishSignUpBtn = By.xpath("//button[@onclick='register()']");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage openSignUpPage() {
        clicking(driver, signUpBtn);
        return this;
    }
    public SignUpPage enterUserName(String username) {
        sendData(driver, userNameTxtBox, username);
        return this;
    }
    public SignUpPage enterPassword(String password) {
        sendData(driver, passTxtBox, password);
        return this;
    }
    public SignUpPage clickFinishSignUp() {
        clicking(driver, finishSignUpBtn);
        return this;
    }

}
