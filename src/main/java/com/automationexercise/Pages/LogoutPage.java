package com.automationexercise.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
    private final WebDriver driver;
    //id="logout2"
    @FindBy(xpath = "//a[@id='logout2']")
    private WebElement logOutBtn;
    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //xpath = "//*[text()='Log out']"
    public void clickLogOut() throws InterruptedException {
        driver.navigate().to("https://www.demoblaze.com/");
        logOutBtn.click();
    }
}
