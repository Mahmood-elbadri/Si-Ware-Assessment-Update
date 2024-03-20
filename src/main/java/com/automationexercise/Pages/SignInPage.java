package com.automationexercise.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    private final WebDriver driver;
    private final By startLogInBtn = By.id("login2");
    private final By userNameTxtBox = By.id("loginusername");
    private final By passTxtBox = By.id("loginpassword");
    private final By loginBtn = By.xpath("//button[@onclick='logIn()']");
    private final By welcomeMsg = By.id ("nameofuser");
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void logInToBlaze(String username,String pass){
        driver.findElement(startLogInBtn).click();
        driver.findElement(userNameTxtBox).sendKeys(pass);
        driver.findElement(passTxtBox).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
    public boolean isLogged(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "nameofuser")));
        return (driver.findElement(welcomeMsg).isDisplayed());
    }
}
