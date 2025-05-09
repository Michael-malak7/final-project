package com.demo.seleniumTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Add_Product {


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
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            HandleAlertIfPresent();

        }
        @Test
        public void addproduct() {
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
            HandleAlertIfPresent();
            driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
            HandleAlertIfPresent();


        }
        @AfterMethod
        public void teardown(){
            if (driver !=null){
                driver.quit();
            }
        }
    }


