package com.stackOverFlow;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class WebDriverSettings {
    Random random = new Random();
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/LIDZI/Desktop/Учёба/JAVA/IDEA projects/QaAutomation/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.close();
    }
}
