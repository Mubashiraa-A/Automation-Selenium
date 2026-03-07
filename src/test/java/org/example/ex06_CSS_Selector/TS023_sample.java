package org.example.ex06_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS023_sample {
    @Test
    public void CSS_sample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
//
//        <div class="login-container">
//                <div class="form-group">
//                <input type="text" name="user_name_field">
//                </div>
//
//                <div class="form-group">
//                <input type="password" name="user_password_field">
//                </div>
//
//                <button class="btn btn-success login-btn">Login</button>
//        </div>

//        1 Username input using contains (*=)
//        2 Password input using starts with (^=)
//        3 Login button using two classes
//        4 Username input using parent class + element


        driver.findElement(By.cssSelector("input[name*='name']"));
        driver.findElement(By.cssSelector("input[type^='password']"));
        driver.findElement(By.cssSelector(".btn-success.login-btn"));
        driver.findElement(By.cssSelector("div>input"));












    }
}
