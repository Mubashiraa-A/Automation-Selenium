package org.example.ex02_Selenium_basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS010_Close_VS_Quite {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(2000);

 // ----- close all the tab- w
        driver.quit();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://app.vwo.com");
        Thread.sleep(2000);

// ----- close will close the current tab. not the whole session
        driver1.close();

    }
}
