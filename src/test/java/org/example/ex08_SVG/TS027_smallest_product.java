package org.example.ex08_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TS027_smallest_product {

    @Test
    public void smallest_product() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search?q=macmini&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
        driver.manage().window().maximize();
        List<WebElement> price_list = driver.findElements(By.xpath("//div[@class='hZ3P6w']"));

        List<Integer> priceList = new ArrayList<>();

        for (WebElement price : price_list) {
            //covert string to int
            String priceText = price.getText().replace("₹", "").replace(",", "");
            priceList.add(Integer.parseInt(priceText));
        }
       // find cheap and high
        int highest = Collections.max(priceList);
        int cheapest = Collections.min(priceList);

        System.out.println("highest :"+highest+"\nChepest :"+cheapest);
    }
}
