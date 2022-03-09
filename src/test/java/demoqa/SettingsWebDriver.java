package demoqa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsWebDriver {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/LIDZI/Desktop/Учёба/JAVA/IDEA projects/QaAutomation/src/main/resources/drivers/chromedriver91.exe");
        driver = new ChromeDriver();
    }

    @After
    public void quit() {
        driver.quit();
    }
}
