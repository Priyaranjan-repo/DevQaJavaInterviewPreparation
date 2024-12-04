package testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GetBrowserInfo {

    @Test
    void getBrowserDetails() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String userAgent = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent");
        System.out.println("userAgent: " + userAgent);
        driver.quit();
    }

    @Test
    void getBrowserDetails1() throws IOException {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String userAgent = (String) js.executeScript("return navigator.userAgent");
        System.out.println("userAgent: " + userAgent);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = System.currentTimeMillis() + ".png";
        FileUtils.copyFile(file, new File("src/test/resources/screenshot/" + fileName));
        driver.quit();
    }
}
