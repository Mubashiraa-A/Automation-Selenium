package org.example.ex12_File_Uploading;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TS038_AppVWO_Profile_update {
    @Test
    public void Profile_Update() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Actions actions = new Actions(driver);
//login
        driver.findElement(By.cssSelector("input[id=login-username]")).sendKeys("sawaj81815@soco7.com");
        driver.findElement(By.cssSelector("input[id=login-password]")).sendKeys("Sawaj81815");
        driver.findElement(By.cssSelector("button[id='js-login-btn']")).click();

//Profile
        WebElement user_profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[aria-label='Open user menu']")));
        user_profile.click();

//view profile
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li[data-qa='btn-profile']")).click();

//file upload

        WebElement upload_Profile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='file']")));
        upload_Profile.sendKeys("C:\\Users\\pc\\Documents\\Automation\\ust.jpeg");

        WebElement upload_Btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Upload')]")));
        upload_Btn.click();

        WebElement preview = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Profile Picture Preview']")));


    }
}
