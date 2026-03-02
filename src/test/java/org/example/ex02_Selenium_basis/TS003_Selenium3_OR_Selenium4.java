package org.example.ex02_Selenium_basis;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TS003_Selenium3_OR_Selenium4 {
    public static void main(String[] args) {

        // In case of selenium 3

        System.getProperty("webdriver.gecko.driver", "/path/geckdriver");
        FirefoxDriver driver= new FirefoxDriver();
        driver.get("https://google.com");
        driver.quit();


        //In case of Selenium 4 ( Not required path setting in 4, bcs Selenium manger will manage)
        FirefoxDriver driver1= new FirefoxDriver();
        driver1.get("https://app.vwo.com");
        driver1.quit();

    }
}
