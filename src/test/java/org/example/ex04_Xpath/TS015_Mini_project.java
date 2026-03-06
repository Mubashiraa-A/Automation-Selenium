package org.example.ex04_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS015_Mini_project {
    @Test
    public void Orange_Hrm() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(3000);
        WebElement email_input_box= driver.findElement(By.xpath("//input[@name='username']"));
        email_input_box.sendKeys("admin");
        Thread.sleep(500);

        WebElement password_input_box= driver.findElement(By.xpath("//input[@name='password']"));
        password_input_box.sendKeys("Hacker@4321");
        Thread.sleep(500);

        WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
        login_btn.click();

        Thread.sleep(4000);
        WebElement main_text = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]"));
        System.out.println("text :"+main_text.getText());
        Assert.assertEquals(main_text.getText(),"PIM");

        Thread.sleep(3000);

        driver.quit();



    }
}
