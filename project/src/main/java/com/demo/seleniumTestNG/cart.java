package com.demo.seleniumTestNG;
import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class cart {

    private void HandleAlertIfPresent() {
        try {
            Alert alert = demo.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException ignored) {
        }
    }

    WebDriver demo = new ChromeDriver();

    @BeforeMethod
    public void openbrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
        demo.navigate().to("https://www.saucedemo.com");
        WebElement username = demo.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = demo.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        demo.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        HandleAlertIfPresent();
        demo.findElement(By.className("shopping_cart_link")).click();

    }

    @Test
    public void cart() {
        HandleAlertIfPresent();
        WebElement auto = demo.findElement(By.className("inventory_item_name"));
        auto.click();
        HandleAlertIfPresent();
        demo.findElement(By.id("remove")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("add-to-cart")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("back-to-products")).click();
        HandleAlertIfPresent();
        demo.findElement(By.className("shopping_cart_link")).click();
        demo.findElement(By.id("remove-sauce-labs-bike-light")).click();
        demo.findElement(By.id("checkout")).click();
    }
}