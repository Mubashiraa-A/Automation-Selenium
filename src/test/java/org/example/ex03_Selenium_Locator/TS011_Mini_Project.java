package org.example.ex03_Selenium_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS011_Mini_Project {

    @Test
    public void App_vwo() throws InterruptedException {
        // Locators - Find the Web elements
// Open the URL https://app.vwo.com/#/login
// Find the Email id** and enter the email as **admin@admin.com**
// Find the Pass inputbox** and enter passwrod as **admin**.
// Find and Click on the submit button
// Verify that the error message is shown "_**Your email, password, IP address or location did not match"**_


        //Driver manager
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();



        //Find locator
        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("admin");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        Thread.sleep(1000);

        WebElement error_message= driver.findElement(By.id("js-notification-box-msg"));
        System.out.println("error message"+error_message.getText());




        // Assertion
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");



        driver.quit();

    }
}
