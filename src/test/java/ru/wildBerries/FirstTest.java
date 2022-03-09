package ru.wildBerries;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettingsWB {

    @Test
    public void openMainPage() {
        driver.manage().window().setSize(new Dimension(500, 500));
        driver.get("https://www.wildberries.ru/");
        String title = driver.getTitle();
        Assert.assertEquals("Wildberries – Интернет-магазин модной одежды и обуви", title);
    }

    @Test
    public void goToRegistrationPage() throws InterruptedException {
        //driver.manage().window().setSize(new Dimension(500, 500));
        driver.get("https://www.wildberries.ru/");

        WebElement regButton = driver.findElement(By.cssSelector("[href=\"/security/login?returnUrl=https%3A%2F%2Fwww.wildberries.ru%2F\"]"));
        regButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"c-h2-v1 login-block-title\"]")));

        //driver.findElement(By.cssSelector());

    }
}
