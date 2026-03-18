package org.example.ex11_Window_Tab_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TS036_Tab_Handling {
    @Test
    public void Tab_handling() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        String parentId = driver.getWindowHandle();
        System.out.println("parent "+parentId);

        WebElement sign_click_btn = driver.findElement(By.xpath("//li[@style='margin-bottom:8px;']/a"));
        sign_click_btn.click();

        Set<String> window_handles_id = driver.getWindowHandles();
        System.out.println("List "+window_handles_id);

        for (String window : window_handles_id) {
            if (!window.equals(parentId)) {
                driver.switchTo().window(window);
            }
        }

//        driver.switchTo().window(parentId);

    }
}
