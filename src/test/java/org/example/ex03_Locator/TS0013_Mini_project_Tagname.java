package org.example.ex03_Locator;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS0013_Mini_project_Tagname {


    @Severity(SeverityLevel.BLOCKER)
    @Owner("Mubaa")// owner of Test case
    @TmsLink("")// which test case its link to
    @Description("Error meesage validate after wrong email for singup")
    @Test
    public void App_vwo_createAccount(){
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://app.vwo.com");
//        driver.manage().window().maximize();

        //locator
//        WebElement sign_in_Link_Text= driver.findElement(By.linkText("Start a free trial"));
//        sign_in_Link_Text.click();


        WebDriver driver=new ChromeDriver();
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
        // assertion
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));


        //Sign up
        WebElement email_input_box= driver.findElement(By.id("page-v1-step1-email"));
        email_input_box.sendKeys("Admin");

//        WebElement checkbox= driver.findElement(By.name("gdpr_consent_checkbox"));
//        checkbox.click();

        WebElement create_account= driver.findElement(By.tagName("button"));
        create_account.click();

        //error message
        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");






        driver.quit();


    }
}
