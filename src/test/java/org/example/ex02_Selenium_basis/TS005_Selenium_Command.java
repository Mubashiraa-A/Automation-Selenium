package org.example.ex02_Selenium_basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS005_Selenium_Command {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
//         driver.getTitle();
        System.out.println("title  : "  +driver.getTitle());
        System.out.println("current URL  : "  +driver.getCurrentUrl());
        System.out.println("Source code  : "  +driver.getPageSource());

        driver.quit();
    }
}
