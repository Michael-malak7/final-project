package com.demo.seleniumTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Finish {

        private void HandleAlertIfPresent() {
            try {
                Alert alert = driver.switchTo().alert();
                alert.accept();
            } catch (NoAlertPresentException ignored) {
            }
        }

        WebDriver driver = new ChromeDriver();
        @BeforeMethod
        public void openbrowser() {
            System.setProperty("Webdriver.Chrome.driver ", " C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver.navigate().to("https://www.saucedemo.com");
        }
        @Test
        public void finishprocess(){
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            HandleAlertIfPresent();
            driver.findElement(By.className("shopping_cart_link")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("checkout")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("first-name")).sendKeys("John");
            driver.findElement(By.id("last-name")).sendKeys("Doe");
            driver.findElement(By.id("postal-code")).sendKeys("12345");
            HandleAlertIfPresent();
            driver.findElement(By.id("continue")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("finish")).click();
            driver.findElement(By.id("back-to-products")).click();
        }
    @AfterMethod
    public void teardown(){
        if (driver !=null){
            driver.quit();
        }
    }
    }








