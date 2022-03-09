package com.etsy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration extends WebDriverSettingsEtsy {

    @Test
    public void registrationPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.etsy.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Etsy — магазин подарков ручной работы, винтажных и уникальных вещей для всех", title);

        WebElement comeInButton = driver.findElement(By.cssSelector("[class=\"wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin\"]"));
        comeInButton.click();

        Thread.sleep(5000);

        WebElement registrationButton = driver.findElement(By.cssSelector("[class=\"wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register\"]"));
        registrationButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"wt-text-body-01 wt-pt-xs-1 wt-line-height-tight \"]")));

        WebElement emailField = driver.findElement(By.id("join_neu_email_field"));
        WebElement nameField = driver.findElement(By.id("join_neu_first_name_field"));
        WebElement passField = driver.findElement(By.id("join_neu_password_field"));
        WebElement registerButton = driver.findElement(By.cssSelector("[class=\"wt-btn wt-btn--primary wt-width-full\"]"));

        int randomInt = random.nextInt(1000) + 100;

        emailField.sendKeys("thisistest" + randomInt + "@mail.ru");
        nameField.sendKeys("thisismytestnames");
        passField.sendKeys("qsedrf" + randomInt);

        Thread.sleep(10000);
        registerButton.click();

        Thread.sleep(10000);    


    }
}
