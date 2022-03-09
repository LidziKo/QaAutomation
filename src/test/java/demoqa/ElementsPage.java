package demoqa;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends SettingsWebDriver{

    void goToElementsPage() {
        driver.get("https://demoqa.com/");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        Assert.assertEquals("ToolsQA", title);
        WebElement elementsCards = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        elementsCards.click();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"wmx4 ta-center fs-title mx-auto mb24\"]")));
    }

    void goToTextBoxTab () {
        goToElementsPage();
        WebElement textBoxTab = driver.findElement(By.id("item-0"));
        textBoxTab.click();
    }

    void enterFullName(String fullName) {
        WebElement fullNameField = driver.findElement(By.id("userName"));
        fullNameField.sendKeys(fullName);
    }

    void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(email);
    }

    void enterCurrentAddress(String currentAddress) {
        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
        currentAddressField.sendKeys(currentAddress);
    }

    void enterPermanentAddress(String permanentAddress) {
        WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
        permanentAddressField.sendKeys(permanentAddress);
    }

    void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }

}
