package org.example.ex08_SVG;

import org.example.Utilities.Common_To_All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class TS028_India_map extends Common_To_All {
    @Test
    public void India_Map() {
        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver, "https://www.amcharts.com/svg-maps/?map=india");

        List<WebElement> states_path = driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement state : states_path) {
            System.out.println(state.getDomAttribute("aria-label"));

            if (state.getDomAttribute("aria-label").contains("Kerala")) {

                state.click();
            }

        }
    }
}
