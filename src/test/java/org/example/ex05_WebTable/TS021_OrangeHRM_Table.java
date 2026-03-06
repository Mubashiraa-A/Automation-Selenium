package org.example.ex05_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TS021_OrangeHRM_Table {
    @Test
    public void OrangeHrm_Table() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Login
        WebElement email_input_box = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        email_input_box.sendKeys("admin");

        WebElement password_input_box = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
        password_input_box.sendKeys("Hacker@4321");

        WebElement login_btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        login_btn.click();
        Thread.sleep(2000);


//        WebElement terminated_employee = driver.findElement(By.xpath("//div[text()=\"Terminated\"]"));
//        System.out.println(terminated_employee.getText());


        List<WebElement> rows= driver.findElements(By.xpath("//div[@role=\"row\"]"));

        for (WebElement row: rows){
            if (row.getText().contains("Terminated")) {

                String terminated_employee_name= row.findElement(By.xpath(".//div[@role='cell'][3]")).getText();
//                System.out.println(terminated_employee_name);
                Thread.sleep(2000);
                row.findElement(By.xpath(".//button[i[contains(@class,'trash')]]")).click();

            }
        }
















        driver.quit();


    }

}

