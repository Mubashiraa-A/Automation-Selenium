package org.example.ex02_Selenium_basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS009_Navigation {

    @Test
    public void Navigation() {

        WebDriver driver= new ChromeDriver();

        //navigation - get()
        driver.get("https://app.vwo.com");

        // navigation - naviaget.to()

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
