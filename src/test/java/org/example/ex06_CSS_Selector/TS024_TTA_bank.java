package org.example.ex06_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS024_TTA_bank {

    @Test
    public void TTA_Bank() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");


        WebElement sign_btn_click = driver.findElement(By.cssSelector("button.font-medium"));
        sign_btn_click.click();

        Thread.sleep(2000);

        WebElement user_name = driver.findElement(By.cssSelector("input[type='text']"));
        user_name.sendKeys("John Doe");

        WebElement email_input_box = driver.findElement(By.cssSelector("input[type='email']"));
        email_input_box.sendKeys("mubashira@gmail.com");

        WebElement password_input_box = driver.findElement(By.cssSelector("input[type='password']"));
        password_input_box.sendKeys("12345678");


        WebElement sign_btn = driver.findElement(By.cssSelector("button[type='submit']"));
        sign_btn.click();
        Thread.sleep(2000);


        WebElement transfer_btn = driver.findElement(By.cssSelector("nav.space-y-1.px-3 button:nth-child(2)"));
        transfer_btn.click();


        WebElement amount_box = driver.findElement(By.cssSelector("input[type='number']"));
        amount_box.sendKeys("2000");
//        Thread.sleep(2000);
         WebElement continue_btn = driver.findElement(By.cssSelector("div.space-y-6 button:nth-child(6)"));
        continue_btn.click();
        Thread.sleep(2000);
//        WebElement confirm_btn = driver.findElement(By.cssSelector(""));
//        confirm_btn.click();





    }
}



