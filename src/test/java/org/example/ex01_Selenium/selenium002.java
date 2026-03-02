package org.example.ex01_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium002 {
    public static void main(String[] args) {

        FirefoxDriver driver= new FirefoxDriver(); // make a new fresh firefox copy
        driver.get("https://app.vwo.com"); // Api call through W3C protocol
        driver.quit(); // last shut down
    }
}
