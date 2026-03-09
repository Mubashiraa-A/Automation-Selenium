package org.example.ex07_Wait;

import org.example.Utilities.Common_To_All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TS025_Explicit_Project extends Common_To_All {
    @Test
    public void App_Vwo_Explicit() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");




         //WebElement email_input_box = driver.findElement(By.id("login-username"));
        //email_input_box.sendKeys("admin@admin.com");
        //WebElement password_input_box = driver.findElement(By.id("login-password"));
        //password_input_box.sendKeys("admin");
 //
        inputBox(driver,"login-username","admin@admin.com" );
        inputBox(driver, "login-password","admin");

//wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("js-login-btn")));
        login_btn.click();

        WebElement error_notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box")));


        Assert.assertEquals(error_notification.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
    }


}
