package org.example.ex10_Action_class;

import org.example.Utilities.Wait_helper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TS035_App_Vwo extends Wait_helper {
    @Test
    public void AppVwo() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(50));

        //  Window handling
        String parent_id = driver.getWindowHandle();
        Thread.sleep(1000);
        WebElement sign_click_btn = driver.findElement(By.xpath("//li[@style='margin-bottom:8px;']/a"));
        actions.moveToElement(sign_click_btn).click().perform();

        Set<String> All_window = driver.getWindowHandles();
        for (String window : All_window)
            if (!window.equals(parent_id)) {
                driver.switchTo().window(window);


// error message validation
                WebElement business_email_box = Wait_helper.VisibilityOfElementLocated(driver, 0, By.xpath("//input[@data-qa='page-su-step1-v1-email']"));
                business_email_box.sendKeys("apple@gmail.com");

                WebElement error_message = driver.findElement(By.className("invalid-reason"));
                Thread.sleep(1000);

                Assert.assertEquals(error_message.getText(), "gmail.com doesn't look like a business domain. Please use your business email.");
                business_email_box.clear();
                Thread.sleep(1000);


// create trail account
                business_email_box.sendKeys("sqq77@iinboxes.com");

                WebElement check_box = driver.findElement(By.cssSelector("input[data-qa='page-free-trial-step1-gdpr-consent-checkbox']"));
                actions.moveToElement(check_box).click().perform();
                Thread.sleep(700);

                WebElement trail_Account = Wait_helper.VisibilityOfElementLocated(driver, 1, By.cssSelector("button[data-qa='page-su-submit']"));
                actions.moveToElement(trail_Account).click().perform();


//create account
                WebElement first_name_box = Wait_helper.VisibilityOfElementLocated(driver, 3, By.cssSelector("input[data-qa='page-su-v1-fname']"));
                first_name_box.sendKeys("grape");

                WebElement last_name_box = driver.findElement(By.name("last_name"));
                last_name_box.sendKeys("guava");

                WebElement phone_number_box = driver.findElement(By.id("page-v1-pnumber"));
                phone_number_box.sendKeys("345678921");

                WebElement create_account = driver.findElement(By.xpath("//button[text()='Create Account']"));
                actions.moveToElement(create_account).click().perform();


//skip and continue
                WebElement skip_continue_btn = Wait_helper.VisibilityOfElementLocated(driver, 35, By.cssSelector("button[data-step='free-trial-thankyou']"));
                actions.moveToElement(skip_continue_btn).click().perform();

//save button
                WebElement save_btn = Wait_helper.VisibilityOfElementLocated(driver, 40, By.xpath("//button[@data-qa='boxasuraza']"));
                actions.moveToElement(save_btn).click().perform();

                Wait_helper.ElementToBeClickable(driver, 30,
                        By.xpath("//button[@data-qa='cunoxonoxe']"));
                List<WebElement> btn_list =
                        driver.findElements(By.xpath("//button[@data-qa='cunoxonoxe']"));
                actions.moveToElement(btn_list.get(1)).click().perform();

//add domain
                WebElement add_domain_btn = Wait_helper.VisibilityOfElementLocated(driver, 28, By.xpath("//button[normalize-space()='Add domain']"));
                actions.moveToElement(add_domain_btn).click().perform();


                WebElement copy_btn = Wait_helper.VisibilityOfElementLocated(driver, 30, By.cssSelector("button[data-qa='xugejexijo']"));
//                 actions.moveToElement(copy_btn).keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).click().perform();

                String expected_text = copy_btn.getAttribute("textContent"); // gives the full text

                driver.switchTo().newWindow(WindowType.TAB); // switching to another window dynamically
                driver.get("https://www.google.com");
                WebElement dest = driver.findElement(By.xpath("//*[@name = 'q']"));
                dest.click();

                //Now pasting
                actions.keyDown(Keys.CONTROL)
                        .sendKeys("v")
                        .keyUp(Keys.CONTROL)
                        .build()
                        .perform();

                String paste_text = dest.getAttribute("value");

                if(paste_text.contains("visualwebsiteoptimizer")) {
                    System.out.println("Test exe successfully");
                } else {
                    System.out.println("Failed to copy");
                }
                System.out.println("copy Text:" + copy_btn.getText());

//              Assert.assertEquals(copy_btn.getText(),"" );
              driver.quit();
            }

    }
}
