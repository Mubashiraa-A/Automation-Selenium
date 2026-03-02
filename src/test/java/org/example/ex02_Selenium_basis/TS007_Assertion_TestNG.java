package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import static org.assertj.core.api.Assertions.*;

public class TS007_Assertion_TestNG {
    // no need Main method.


    @Test
    public void TestNG_Selenium(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");

        //TestNG
        // Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(),"Login - VWO");


        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotEmpty().isNotBlank().isNotNull();

        driver.quit();

    }

}
