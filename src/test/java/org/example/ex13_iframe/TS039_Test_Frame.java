package org.example.ex13_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS039_Test_Frame  {
    @Test
    public void test_frame(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        driver.switchTo().frame("result");
        driver.findElement(By.id("username")).sendKeys("Pramod");


        driver.switchTo().defaultContent();





    }
}


