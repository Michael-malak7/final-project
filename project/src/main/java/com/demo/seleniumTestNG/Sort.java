package com.demo.seleniumTestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import java.time.Duration;
import java.util.List;
public class Sort {

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

    @Test
    public void Sort1() {
        HandleAlertIfPresent();
        WebElement sort = auto.findElement(By.className("product_sort_container"));
        Select select = new Select(sort);
        select.selectByValue("za");
        System.out.println("done");
    }

    @Test
    public void Sort2() {
        HandleAlertIfPresent();
        WebElement sort = auto.findElement(By.className("product_sort_container"));
        Select select = new Select(sort);
        select.selectByValue("hilo");
    }

    @Test
    public void Sort3() {
        HandleAlertIfPresent();
        WebElement sort = auto.findElement(By.className("product_sort_container"));
        Select select = new Select(sort);
        select.selectByValue("lohi");
    }


    @Test
    public void Sort4() {
        HandleAlertIfPresent();
        WebElement sort = auto.findElement(By.className("product_sort_container"));
        Select select = new Select(sort);
        select.selectByValue("za");
        Assert.fail("Sorting is broken! This error has been reported to Backtrace.");
    }

    @AfterMethod
    public void close() {
        if (auto != null) {
            auto.quit();
        }
    }
}






