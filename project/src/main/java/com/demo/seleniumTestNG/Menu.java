package com.demo.seleniumTestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebElement;
public class Menu {

    WebDriver auto;

    private void
    HandleAlertIfPresent() {
        try {
            Alert alert = auto.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException ignored) {
        }
    }
    @BeforeMethod
    public void openBrowser() {

        auto = new ChromeDriver();
        System.setProperty("website.chrome.driver", "C:\\Users\\join\\Downloads\\chromedriver-win64chromedriver.exe");
        auto.navigate().to("https://www.saucedemo.com");

        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
    }
    @Test(priority = 2)
    public void Menu1() {
        HandleAlertIfPresent();
        auto.findElement(By.id("react-burger-menu-btn")).click();
        HandleAlertIfPresent();
        auto.findElement(By.id("about_sidebar_link")).click();
    }

    @Test(priority = 1)
    public void Men2() {
        HandleAlertIfPresent();
         auto.findElement(By.id("react-burger-menu-btn")).click();
        HandleAlertIfPresent();
        auto.findElement(By.id("inventory_sidebar_link")).click();
    }
    @Test(priority = 3)
    public void Men3() {
        HandleAlertIfPresent();
         auto.findElement(By.id("react-burger-menu-btn")).click();
        HandleAlertIfPresent();
        auto.findElement(By.id("logout_sidebar_link")).click();
    }
    @Test(priority = 4)
    public void Menu4(){
        HandleAlertIfPresent();
         auto.findElement(By.id("react-burger-menu-btn")).click();
        HandleAlertIfPresent();
        auto.findElement(By.id("reset_sidebar_link")).click();
    }

    @AfterMethod
    public void teardown() {
        if (auto != null) {
            auto.quit();
        }
    }
}
