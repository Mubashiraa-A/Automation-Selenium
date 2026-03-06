package org.example.ex05_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TS019_Static_Table_Sample {
    @Test
    public void Sample_Table() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
//        driver.manage().window().maximize();

        //table[@id="customers"]/tbody/tr[2]/td[3]

        String first_part = "//table[@id='customers']/tbody/tr[";
        //i
        String second_Part = " ]/td[";
        //j
        String fina_part = "]";


        //find row size and column size
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
//       System.out.println("row :"+row+" clm :"+column);


        // find values in table
        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= column; j++) {

                //for creating dynamic xpath
                String dynamic_Xpath = first_part + i + second_Part + j + fina_part;

                //for getting each values
                String data = driver.findElement(By.xpath(dynamic_Xpath)).getText();
//                System.out.println(data);

                //if checking Xpath Axes
                if (data.contains("Roland Mendel")) {
                    List<String> details = new ArrayList<>();
                    String country_path = dynamic_Xpath + "/following::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();

                    String company_path = dynamic_Xpath + "/preceding-sibling::td";
                    String company_text = driver.findElement(By.xpath(company_path)).getText();

                    System.out.println("RRoland Mendel company is " + company_text + " and country is " + country_text);


                }

            }

            // driver.quit();

        }
        }
    }
