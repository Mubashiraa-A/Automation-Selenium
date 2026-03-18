package org.example.ex10_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TS032_Booking_com {
    @Test
    public void Booking_com() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/flights/index.html?aid=304142&label=gen173nr-10CAEoggI46AdIM1gEaGyIAQGYATO4ARfIAQzYAQPoAQH4AQGIAgGoAgG4Aqndwc0GwAIB0gIkZDEzODE5NTAtY2RmZS00ZDM2LWJhMGYtMjM4NmM5MzZiYmZj2AIB4AIB&sid=6e8b767b49ad48cec14800c903864c08&from=booking&");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

// //CLose modal
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Dismiss sign-in info.']"))).click();
//
//        driver.findElement(By.id("flights")).click();
        Thread.sleep(2000);

        WebElement destination = driver.findElement(By.xpath("//button[@data-ui-name=\"input_location_to_segment_0\"]"));

//        WebElement type_destination= driver.findElement(By.xpath("//div[@class='AutoComplete-module__wrapper___d3PlU']/div[2]"));
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.moveToElement(destination).sendKeys(destination, "del").keyDown(Keys.TAB).keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[.//span[normalize-space()='Explore']]"))).click();

    }
}
