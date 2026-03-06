package org.example.ex04_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS017_Mini_Project {
    @Test
    public void TTA_Bank_SignUp() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");

 //Click on Sign Up button
        WebElement click_signup_btn = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        click_signup_btn.click();

        Thread.sleep(2000);

 //Sign Up page
        WebElement full_name_input_box = driver.findElement(By.xpath("//input[contains(@type,\"text\")]"));
        full_name_input_box.sendKeys("mubashira");

        WebElement email_input_box = driver.findElement(By.xpath("//input[contains(@type,\"email\")]"));
        email_input_box.sendKeys("mubashira@gmail.com");


        WebElement password_input_box = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        password_input_box.sendKeys("1234456789");

        WebElement sign_btn = driver.findElement(By.xpath("//button[text()='Create Account']"));
        sign_btn.click();

        Thread.sleep(5000);

// click on btn
        WebElement transfer_fund_btn = driver.findElement(By.xpath("//button[text()='Transfer Funds']"));
        transfer_fund_btn.click();
        Thread.sleep(1000);


// enter amount
        WebElement amount_input_box = driver.findElement(By.xpath("//input[contains(@type,'number')]"));
        amount_input_box.sendKeys("5000");
        Thread.sleep(1000);

        WebElement continue_btn= driver.findElement(By.xpath("//button[text()='Continue']"));
        continue_btn.click();
        Thread.sleep(1000);

        WebElement continue_transfer_btn= driver.findElement(By.xpath("//button[text()='Confirm Transfer']"));
        continue_transfer_btn.click();

// back to dashboard
        Thread.sleep(1000);
        WebElement dashboard_btn = driver.findElement(By.xpath("//button[text()='Dashboard']"));
        dashboard_btn.click();
        Thread.sleep(2000);

// checking expected vs actual
        WebElement total_balance = driver.findElement(By.xpath("//h3[contains(@class,'mt-2 text-3xl font-bold')]"));
        Assert.assertEquals(total_balance.getText(),"$45,000.00");

        Thread.sleep(2000);
        driver.quit();

    }
}
