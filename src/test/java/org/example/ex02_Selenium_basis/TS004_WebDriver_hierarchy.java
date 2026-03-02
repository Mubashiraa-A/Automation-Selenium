package org.example.ex02_Selenium_basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TS004_WebDriver_hierarchy {
    public static void main(String[] args) {

        //SearchCOntext(2 elements) //WebDriver(10) //RemoteWebDriver(15)
        //ChromiumDriver(25), EdgeDriver(45)

        //SearchContext - Interface- GGF
        //WebDriver -Interface-  GF
        //RemoteWebDriver - class- Father
        //ChromeDriver, FirefoxDriver,safariDriver

        // SearchContext driver= new SearchContext() - Not possible
        // WebDriver driver= new WebDriver()   - Not possible
       // RemoteWebDriver driver =new RemoteWebDriver(); -Not possible

       // WebDriver driver= new ChromeDriver(); - possible
        // RemoteWebDriver driver = new ChromeDriver(); - Possible
        //ChromeDriver driver= new ChromeDriver() - possible

       // Scenarios -1 - want to run chrome the edge not possible bcz ChromeDriver
        // ChromeDriver driver= new ChromeDriver();
        // driver= FirefoxDriver();

        // Scenarios -2 - we can change chrome then edge using WebDriver
        WebDriver driver= new ChromeDriver();
        driver= new FirefoxDriver();

        //Scenarios -3 - want to run multi browser, AWS machine
        //RemoteWebDriver - Grid




    }
}
