package com.etsy;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class WebDriverSettingsEtsy {
    Random random = new Random();
    public ChromeDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);

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
