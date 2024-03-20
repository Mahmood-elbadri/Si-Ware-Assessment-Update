package com.automationexercise.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private final WebDriver driver;
    @FindBy(xpath = "//*[text()='Cart']")
    private WebElement showCart;
    @FindBy(xpath = "//button[@data-toggle='modal']")
    private WebElement placeOrderBtn;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement placeOrderName;
    @FindBy(xpath = "//input[@id='country']")
    private WebElement placeOrderCountry;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement placeOrderCity;
    @FindBy(xpath = "//input[@id='card']")
    private WebElement placeOrderCreditCard;
    @FindBy(xpath = "//input[@id='month']")
    private WebElement placeOrderMonth;
    @FindBy(xpath = "//input[@id='year']")
    private WebElement placeOrderYear;
    //onclick='purchaseOrder()'
    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    private WebElement purchaseOrderBtn;
    @FindBy(xpath = "//button[@tabindex='1']")
    private WebElement thanksBtn;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCart(){
        showCart.click();
    }

//we will get the data from the Excel file
    public void fillOrderData(String name,String country,String city, String creditCard,String orderMonth,String orderYear) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//tr[@class='success'][1]")));
        placeOrderBtn.click();
        placeOrderName.sendKeys(name);
        placeOrderCountry.sendKeys(country);
        placeOrderCity.sendKeys(city);
        placeOrderCreditCard.sendKeys(creditCard);
        placeOrderMonth.sendKeys(orderMonth);
        placeOrderYear.sendKeys(orderYear);
        purchaseOrderBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@tabindex='1']")));
        thanksBtn.click();
    }
}
