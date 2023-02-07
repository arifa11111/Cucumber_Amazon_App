package com.StepDefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    Properties prop;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public void visitUrl(String url){
        tlDriver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    public Properties init_properties()  {
        prop = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/test/resources/data.properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }


    public void fullScreenCapture(String itemName) throws IOException {
        File src=((TakesScreenshot)tlDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("src/main/java/screenshots/"+itemName+".png"));

    }
}