package org.example.ex09_Input_Select_Radio_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS027_Alert_Box {
    @Test
    public void Alert_box() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement js_alert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        WebElement js_confirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement js_prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        Thread.sleep(2000);

//        js_alert.click();
//        js_confirm.click();
        js_prompt.click();

        Thread.sleep(2000);


        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        alert.accept();
        alert.sendKeys("mubaaa");
        Thread.sleep(2000);
        alert.accept();


//        driver.quit();


    }

}
