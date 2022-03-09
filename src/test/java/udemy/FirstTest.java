package udemy;

import com.etsy.WebDriverSettingsEtsy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends WebDriverSettingsUdemy {
    @Test
    public void Tests() {
        driver.get("https://www.google.ru/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Hello world!");
        searchBox.submit(); // подтверждение запроса, аналог Enter
    }
}
