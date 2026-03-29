package org.example.ex13_iframe;

import org.example.Utilities.Wait_helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS040_Test_Frame2 {


    @Test
    public void test_frame() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        Iframe_Utility frameUtils = new Iframe_Utility(driver);

        frameUtils.switchToFrame("result");
        driver.findElement(By.id("username")).sendKeys("Pramod");
        frameUtils.switchToDefault();


    }
}
