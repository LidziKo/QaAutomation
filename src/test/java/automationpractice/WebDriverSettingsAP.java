package automationpractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSettingsAP {
    public ChromeDriver driver;
    public WebElement fullNameField; // обьявление поля fullName

    public void goToMainPage() {
        driver.get("https://demoqa.com/");
        String title = driver.getTitle();
        Assert.assertEquals("ToolsQA", title);
    }

    public void goToElementsPage() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
    }

    public void goToElements() {
        driver.findElement(By.cssSelector("[id=\"item-0\"]")).click();

    }

    public void enterFullName(String fullName) {
        WebElement fullNameField = driver.findElement(By.cssSelector("[id=\"userName\"]")); // инициализация
        this.fullNameField = fullNameField;
        fullNameField.sendKeys(fullName);
    }

    public void enterEmail(String email) {
        driver.findElement(By.cssSelector("[id=\"userEmail\"]")).sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress) {
        driver.findElement(By.cssSelector("[id=\"currentAddress\"]")).sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        driver.findElement(By.cssSelector("[id=\"permanentAddress\"]")).sendKeys(permanentAddress);
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/LIDZI/Desktop/Учёба/JAVA/IDEA projects/QaAutomation/src/main/resources/drivers/chromedriver91.exe");
        driver = new ChromeDriver();
    }

    /*@After
    public void quit() {
        driver.quit();
    }*/
}
