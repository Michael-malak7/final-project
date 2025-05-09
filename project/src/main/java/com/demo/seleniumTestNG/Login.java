package com.demo.seleniumTestNG;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.time.Duration;

public class Login {

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
    }

    @Test(priority = 1)
    public void HSLogin() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
    }

    @Test(priority = 2)
    public void HSLogin2(){
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("locked_out_user");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        auto.findElement(By.id("login-button")).click();
        WebDriverWait wait = new WebDriverWait(auto, Duration.ofSeconds(10));
    }
    @Test(priority = 9)
    public void NSLogin1() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("standard-user");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("secret-sauce");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
    }

    @Test(priority = 8)
    public void NSLogin3() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("@@@@");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("@@@@");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
    }
    @Test(priority = 6)
    public void NSLogin4() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("    ");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("    ");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();
    }
    @Test(priority = 7)
    public void NSLogin5() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();    }
    @Test(priority = 3)
    public void NSLogin6() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();    }
    @Test(priority = 4)
    public void NSLogin7() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();    }
    @Test(priority = 5)
    public void NSLogin8() {
        WebElement username = auto.findElement(By.id("user-name"));
        username.sendKeys("secret_sauce");

        WebElement password = auto.findElement(By.id("password"));
        password.sendKeys("standard_user");

        auto.findElement(By.id("login-button")).click();
        HandleAlertIfPresent();

    }

    @AfterMethod
    public void teardown() {
        if (auto != null) {
            auto.quit();
        }
    }
}
