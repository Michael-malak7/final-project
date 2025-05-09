package com.demo.seleniumTestNG;
import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout_information {

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
        demo.findElement(By.id("checkout")).click();
        HandleAlertIfPresent();
    }

    @Test (priority =1)
    public void CheckoutHs (){
        HandleAlertIfPresent();
        WebElement fName=demo.findElement(By.id("first-name"));
        fName.sendKeys("Michael");
        WebElement sname= demo.findElement(By.id("last-name"));
        sname.sendKeys("Malak");
        WebElement zipcode=demo.findElement(By.id("postal-code"));
        zipcode.sendKeys("12345");
        demo.findElement(By.id("continue")).click();
        HandleAlertIfPresent();
    }
    @Test(priority =2)
    public void Checkout2f(){
        HandleAlertIfPresent();
        WebElement fName=demo.findElement(By.id("first-name"));
        fName.sendKeys("Michael");
        WebElement sname= demo.findElement(By.id("last-name"));
        sname.sendKeys("Malak");
        demo.findElement(By.id("continue")).click();
        HandleAlertIfPresent();
    }
    @Test (priority =3)
    public void Checkoutspaces (){
        HandleAlertIfPresent();
        WebElement fName=demo.findElement(By.id("first-name"));
        fName.sendKeys("   ");
        WebElement sname= demo.findElement(By.id("last-name"));
        sname.sendKeys("   ");
        WebElement zipcode=demo.findElement(By.id("postal-code"));
        zipcode.sendKeys("   ");
        demo.findElement(By.id("continue")).click();
        HandleAlertIfPresent();
    }
    @Test (priority =4)
    public void checkoutNs (){
        HandleAlertIfPresent();
        demo.findElement(By.id("continue")).click();
        HandleAlertIfPresent();
    }
    @Test (priority =5)
    public void checkoutnum (){
        HandleAlertIfPresent();
        WebElement fName=demo.findElement(By.id("first-name"));
        fName.sendKeys("123");
        WebElement sname= demo.findElement(By.id("last-name"));
        sname.sendKeys("123");
        WebElement zipcode=demo.findElement(By.id("postal-code"));
        zipcode.sendKeys("12345");
        demo.findElement(By.id("continue")).click();
        HandleAlertIfPresent();
    }
    @Test (priority =6)
    public void checkoutspecialchar() {
        HandleAlertIfPresent();
        WebElement fName = demo.findElement(By.id("first-name"));
        fName.sendKeys("#");
        WebElement sname = demo.findElement(By.id("last-name"));
        sname.sendKeys("@@");
        WebElement zipcode = demo.findElement(By.id("postal-code"));
        zipcode.sendKeys("&&");
        demo.findElement(By.id("continue")).click();
        HandleAlertIfPresent();
    }
        @Test(priority = 7)
                public void cancelbutton(){
            HandleAlertIfPresent();
            demo.findElement(By.id("cancel")).click();

        }
@AfterMethod
    public void teardown(){
        if (demo !=null){
            demo.quit();
        }
}

}












