package org.example.ex12_File_Uploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS037_File_Upload {
    @Test
    public void file_upload() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

//file upload
        WebElement uploadFileInput= driver.findElement(By.id("fileToUpload"));
        String user_dir_path= System.getProperty("user.dir");
        System.out.println(user_dir_path);
        uploadFileInput.sendKeys(user_dir_path+"/src/test/java/org/example/ex12_File_Uploading/Capture0.png");

//submit
        driver.findElement(By.name("submit")).click();
    }

}
