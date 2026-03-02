package org.example.ex03_Selenium_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS012_LinkText_PartialText {

    @Test
    public void App_vwo(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

        // In Selenium if there is a(anger) tag , we can use Link text or Partial link text

        //Link full Text
        WebElement a_tag_full_LinkText = driver.findElement(By.linkText("Start a free trial"));
        a_tag_full_LinkText.click();


        //Partial Link Text

        WebElement a_tag_Partial_link_Text = driver.findElement(By.partialLinkText("trial"));
        // Start a free trial
        //Start a free
        //Start a
        //Start,
        //Start, a ,free, trail. s

        a_tag_Partial_link_Text.click();



    }
}
