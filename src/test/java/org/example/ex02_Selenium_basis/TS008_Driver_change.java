package org.example.ex02_Selenium_basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TS008_Driver_change {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver= new FirefoxDriver();

        // its possible when we are using webdriver
    }
}
