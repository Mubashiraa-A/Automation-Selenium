package org.example.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait_helper {
     public ChromeDriver driver;

    public void OpenBrowser(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public  void inputBox(WebDriver driver,String id, String sendKey){
        WebElement email_input_box = driver.findElement(By.id(id));
        email_input_box.sendKeys(sendKey);

    }

    public static WebElement  ElementToBeClickable(WebDriver driver, int timeouts, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
        return  wait.until(ExpectedConditions.elementToBeClickable(locator));

    }
    public static  WebElement VisibilityOfElementLocated(WebDriver driver, int timeouts,By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void CLoseBrowser(WebDriver driver) {
        driver.quit();
    }


}

