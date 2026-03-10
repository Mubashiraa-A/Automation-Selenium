package org.example.ex09_Input_Select_Radio_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TS028_Select {
    @Test
    public void test_select() {

        // Select BOX - HTMLs
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        //select.selectByVisibleText("Option 2");

        select.selectByIndex(1);

//        WaitHelpers.waitJVM(4000);
        driver.quit();


    }
}
