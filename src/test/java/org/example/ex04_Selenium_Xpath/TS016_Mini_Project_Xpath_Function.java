package org.example.ex04_Selenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS016_Mini_Project_Xpath_Function {

    @Test
    public void Ketalon_Cura() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(1000);

        WebElement appointment_btn = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        appointment_btn.click();
        Thread.sleep(1000);


        WebElement email_input_box = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        email_input_box.sendKeys("John Doe");

       WebElement password_input_box = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
       password_input_box.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.xpath("//button[text()='Login']"));
        login_btn.click();
        Thread.sleep(1000);

        driver.quit();



    }
}
