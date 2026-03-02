package org.example.ex02_Selenium_basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS006_Mini_Maximize {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();


//        driver.quit();
    }
}
