package org.example.ex09_Input_Select_Radio_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS029_Radio_box {
    public void test_HTMLTags() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("the testing academy");

        // RADIO Box
        WebElement radiobox = driver.findElement(By.id("sex-1"));
        radiobox.click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();

    }

}
