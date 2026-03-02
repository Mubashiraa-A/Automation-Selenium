package org.example.ex01_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium001 {
    public static void main(String[] args) {

        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://app.vwo.com");
        chromeDriver.quit();






   }
}
