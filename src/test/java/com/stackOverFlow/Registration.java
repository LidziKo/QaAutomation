package com.stackOverFlow;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration extends WebDriverSettings{

    @Test
    public void registrationPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://ru.stackoverflow.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Stack Overflow на русском", title);

        WebElement regButton = driver.findElement(By.cssSelector("[class=\"login-link s-btn s-btn__primary py8\"]"));
        regButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"wmx4 ta-center fs-title mx-auto mb24\"]")));

        WebElement visibleName = driver.findElement(By.id("display-name"));
        WebElement eMail = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("password"));
        //WebElement submitButton = driver.findElement(By.id("submit-button"));
        WebElement checkBoxAgree = driver.findElement(By.id("opt-in"));

        int randomNum = random.nextInt(1000) + 100;
        String testRegName = "sorryitsatest";
        String testEmailName = "itsatest";
        String testPassString = "itsatestpass";

        visibleName.sendKeys(testRegName + randomNum);
        eMail.sendKeys(testEmailName + randomNum + "mail");
        pass.sendKeys(testPassString + randomNum);
        checkBoxAgree.click();

        //Thread.sleep(10000);
        //submitButton.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"grid--cell fs-body3 mb8\"]")));

    }
}
