package com.hooks;

import com.StepDefinitions.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class Hooks {

    Properties prop = new Base().init_properties();

    @Before
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","/home/shaiA/Desktop/selinium/chromedriver_linux64/chromedriver");
        Base base = new Base();
        base.visitUrl(prop.getProperty("url"));
        System.out.println("*****************  Application Start **********************");
    }

    @After
    public void closeTab(){
        Base.getDriver().quit();
        System.out.println("*****************  close **********************");
    }
}
