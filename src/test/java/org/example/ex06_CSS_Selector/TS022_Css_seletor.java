package org.example.ex06_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS022_Css_seletor {
    @Test
    public void Css_selector() {
//            <div class="login-form">
//                <input type="text" name="email">
//                <input type="password" name="password">
//                <button class="btn submit-btn">Submit</button>
//            </div>
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[type='text']"));
        driver.findElement(By.cssSelector("input[type='password']"));
        driver.findElement(By.cssSelector(".btn.submit-btn")).click();


//        <div class="register-form">
//                <input type="text" id="firstname">
//                <input type="text" id="lastname">
//                <input type="email" name="user_email">
//                <button class="btn register-btn">Register</button>
//          </div>


        driver.findElement(By.cssSelector("#'firstname']"));
        driver.findElement(By.cssSelector("#'lastname']"));
        driver.findElement(By.cssSelector("input[type='email']"));
        driver.findElement(By.cssSelector("button.btn.register-btn"));


//        <div class="profile-form">
//                <input type="text" id="user_name">
//                <input type="password" id="user_password">
//                <input type="email" name="user_email_address">
//                <button class="btn btn-primary save-btn">Save</button>
//      </div>


        driver.findElement(By.cssSelector("#user_name"));
        driver.findElement(By.cssSelector("#user_password"));
        driver.findElement(By.cssSelector("input[type='email']"));
        driver.findElement(By.cssSelector("button[class^='btn']"));


    }

}
