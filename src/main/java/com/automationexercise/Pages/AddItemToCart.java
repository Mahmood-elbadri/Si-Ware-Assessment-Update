package com.automationexercise.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddItemToCart {
    private final WebDriver driver;
    private final By product = By.linkText("Nokia lumia 1520");
    private final By addProductBtn = By.xpath("//a[@onclick='addToCart(2)']");

    public AddItemToCart(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddProduct(){
        driver.findElement(product).click();
        driver.findElement(addProductBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
