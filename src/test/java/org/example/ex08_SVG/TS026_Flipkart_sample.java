package org.example.ex08_SVG;

import org.example.Utilities.Wait_helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TS026_Flipkart_sample extends Wait_helper {

    @Test
    public void Flipkart_Search_SVG() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver, "https://www.flipkart.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement close_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.b3wTlE")));

        close_btn.click();

        WebElement search_input = driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]")));


        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }

//
//        WebElement close_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.b3wTlE")));

//        close_btn.click();
////        driver.findElement(By.cssSelector("span.b3wTlE")).click();
//        Thread.sleep(2000);
//
//        WebElement search_input = driver.findElement(By.name("q"));
//        search_input.sendKeys("macmini");
//
//
//        List<WebElement> svg_elements = driver.findElements(By.xpath("//*[local-name()='svg']"));
//        svg_elements.get(0).click();
//
//
//        WebElement close = driver.findElement(
//                By.xpath("//div[@class='css-175oi2r']//*[local-name()='svg']")
//        );
//        close.click();
//
//        List<WebElement> titles = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')or contains(@data-id,'Mp')]/div/a[2]"));
//        for (WebElement title : titles) {
//            System.out.println("3");
//            System.out.println(title.getText());
//        }

        Thread.sleep(2000);
//        driver.quit();
    }
}
