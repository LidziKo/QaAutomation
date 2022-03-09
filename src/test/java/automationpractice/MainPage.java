package automationpractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends WebDriverSettingsAP{
    @Test
    public void openMainPage(){
        driver.get("http://automationpractice.com//");
        String title = driver.getTitle();
        Assert.assertEquals("My Store", title);

    }

    @Test
    public void openContactUsPage(){
        driver.get("http://automationpractice.com//");
        WebElement contactUsButton = driver.findElement(By.cssSelector("[title=\"Contact Us\"]"));
        contactUsButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"page-heading bottom-indent\"]")));
    }

    @Test
    public void openSignInPage(){
        driver.get("http://automationpractice.com//");
        WebElement signInButton = driver.findElement(By.cssSelector("[class=\"login\"]"));
        signInButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"page-heading\"]")));
    }

    @Test
    public void deleteItemFromCart() throws InterruptedException {
        driver.get("http://automationpractice.com//");
        WebElement productCard = driver.findElement(By.cssSelector("[class=\"replace-2x img-responsive\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(productCard).build().perform();
        WebElement addButton = driver.findElement(By.cssSelector("[class=\"button ajax_add_to_cart_button btn btn-default\"]"));
        addButton.click();
    }

    @Test
    public void pageActions() {
        driver.navigate().to("http://automationpractice.com//");
        driver.navigate().to("https://demoqa.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

}
