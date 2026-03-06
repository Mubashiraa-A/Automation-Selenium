package org.example.ex05_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TS020_Dynamic_Table {


    @Test
    public void Dynamic_table() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        //whole body of table
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        //find total rows
        List<WebElement> row_table = table.findElements(By.tagName("tr"));
        //System.out.println(row_table.size());

        for (WebElement rows : row_table) {

            //find total column
            List<WebElement> column_table = rows.findElements(By.tagName("td"));
            //System.out.println(column_table.size());

            for (WebElement column : column_table ){
                System.out.println(column.getText());
            }

        }


       driver.quit();
    }
}
