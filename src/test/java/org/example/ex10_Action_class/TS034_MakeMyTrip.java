package org.example.ex10_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TS034_MakeMyTrip {
    @Test
    public void Makemytrip_Action() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://makemytrip.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-cy='closeModal']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='minimize']"))).click();

        WebElement background_mode = driver.findElement(By.tagName("body"));
        background_mode.click();

        Thread.sleep(2000);
// From city
        WebElement fromCity = driver.findElement(By.id("fromCity"));
        fromCity.click();

        Actions action = new Actions(driver);
        action.moveToElement(fromCity).keyDown(Keys.SHIFT).sendKeys("ixc").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(1000);

        List<WebElement> from_places_list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for (WebElement place : from_places_list) {
            try {
                if (place.getText().contains("IXC")) {
                    place.click();
                    System.out.println("IXC --------" + place.getText());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        Thread.sleep(2000);

//To city
        WebElement toCity = driver.findElement(By.id("toCity"));
        toCity.click();
        action.moveToElement(toCity).keyDown(Keys.SHIFT).sendKeys("cok").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(1000);

        List<WebElement> to_places_list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for (WebElement place : to_places_list) {
            try {
                if (place.getText().contains("COK")) {
                    place.click();
                    System.out.println("COC --------" + place.getText());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

//        Thread.sleep(13000);
//        driver.quit();
    }
}
