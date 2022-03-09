package udemy;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class WebDriverSettingsUdemy {
    Random random = new Random();
    public ChromeDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, 10);

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void quit() {
        driver.quit();
    }
}
