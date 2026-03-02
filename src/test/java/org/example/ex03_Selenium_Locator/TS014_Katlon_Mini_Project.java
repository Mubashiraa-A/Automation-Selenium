package org.example.ex03_Selenium_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS014_Katlon_Mini_Project {
    @Test
    public void Katalon_Loginpage() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //Click button
        WebElement make_appointment_button = driver.findElement(By.id("btn-make-appointment"));
        make_appointment_button.click();
        Thread.sleep(500);

        //Login page
        WebElement email_input_box = driver.findElement(By.id("txt-username"));
        email_input_box.sendKeys("John Doe");
        Thread.sleep(500);

        WebElement password_input_box = driver.findElement(By.id("txt-password"));
        password_input_box.sendKeys("ThisIsNotAPassword");
        Thread.sleep(500);

        WebElement login_button = driver.findElement(By.id("btn-login"));
        login_button.click();
        Thread.sleep(2000);

        // check url and title
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Assert.assertEquals(driver.getTitle() , "CURA Healthcare Service");


        driver.quit();


    }
}
