package org.example.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common_To_All {
     public ChromeDriver driver;

    public void OpenBrowser(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public  void inputBox(WebDriver driver,String id, String sendKey){
        WebElement email_input_box = driver.findElement(By.id(id));
        email_input_box.sendKeys(sendKey);

    }



    public void WaitForVisibility(WebDriver driver, int timeouts, String locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
    }

    public void CLoseBrowser(WebDriver driver) {
        driver.quit();
    }


}

