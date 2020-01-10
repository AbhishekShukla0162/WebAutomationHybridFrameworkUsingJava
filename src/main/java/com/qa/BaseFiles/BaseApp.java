package com.qa.BaseFiles;

import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;


public class BaseApp {

    public static Logger logger;

    public String BaseUrl = "https://www.snapdeal.com/";

    public WebDriver capabilities () {


        logger = Logger.getLogger("Snapdeal");
        PropertyConfigurator.configure("log4j.properties");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        WebDriver driver = new ChromeDriver();
        driver.get(BaseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}