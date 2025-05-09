package com.demo.seleniumTestNG;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class View_Product {
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

            System.setProperty("Webdriver.Chrome.driver ", " C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
            demo.navigate().to("https://www.saucedemo.com");

        }
        @Test (priority = 1)
        public void viewproduct1(){
            WebElement username = demo.findElement(By.id("user-name"));
            username.sendKeys("standard_user");
            WebElement password = demo.findElement(By.id("password"));
            password.sendKeys("secret_sauce");
            demo.findElement(By.id("login-button")).click();
            HandleAlertIfPresent();
            demo.findElement(By.id("item_4_title_link")).click();
            HandleAlertIfPresent();
        }
    @Test (priority = 2)
    public void viewproduct2() {
        WebElement username = demo.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = demo.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        demo.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("item_0_title_link")).click();
    }
    @Test (priority = 3)
    public void viewproduct3() {
        WebElement username = demo.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = demo.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        demo.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("item_1_title_link")).click();
    }
    @Test (priority = 4)
    public void viewproduct4() {
        WebElement username = demo.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = demo.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        demo.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("item_5_title_link")).click();
    }
    @Test (priority = 5)
    public void viewproduct5() {
        WebElement username = demo.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = demo.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        demo.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
        demo.findElement(By.className("item_2_title_link")).click();
    }
    @Test (priority = 6)
    public void viewproduct6() {
        WebElement username = demo.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = demo.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        demo.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
        demo.findElement(By.id("item_3_title_link")).click();
    }


    @AfterMethod
        public void teardown(){
            if (demo !=null){
                demo.quit();
            }
        }

    }


