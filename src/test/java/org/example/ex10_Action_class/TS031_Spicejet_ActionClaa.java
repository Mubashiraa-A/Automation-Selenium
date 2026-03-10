package org.example.ex10_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TS031_Spicejet_ActionClaa {
    @Test
    public void Spicejet_ActionClass() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.manage().window().maximize();

        WebElement fromPlacce = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));


        Actions action = new Actions(driver);
        action.moveToElement(fromPlacce).click().sendKeys("BLR")
                .sendKeys(destination, "DEL").build().perform();


    }


}
