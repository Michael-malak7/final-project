package com.demo.seleniumTestNG;
import  org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Continue_Shopping {

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

         @Test
         public void ContinueShopping() {
             WebElement username = demo.findElement(By.id("user-name"));
             username.sendKeys("standard_user");
             WebElement password = demo.findElement(By.id("password"));
             password.sendKeys("secret_sauce");
             demo.findElement(By.id("login-button")).click();
             HandleAlertIfPresent();
             demo.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
             HandleAlertIfPresent();
             demo.findElement(By.className("shopping_cart_link")).click();
             HandleAlertIfPresent();
             demo.findElement(By.id("continue-shopping")).click();
         }
}