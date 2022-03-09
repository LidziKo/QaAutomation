package demoqa;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPageTests extends ElementsPage {

    @Test
    public void enterCorrectDataInTextBox() {
        goToTextBoxTab();
        enterFullName("So Hello!");
        enterEmail("sohello@test.ru");
        enterCurrentAddress("Moscow");
        enterPermanentAddress("SPb");
        clickSubmitButton();

        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"border col-md-12 col-sm-12\"]")));
    }

    @Test
    public void enterIncorrectEmailInTextBox() {
        goToTextBoxTab();
        enterFullName("So Hello!");
        enterEmail("wrongEmail");
        enterCurrentAddress("Moscow");
        enterPermanentAddress("SPb");
        clickSubmitButton();

        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"mr-sm-2 field-error form-control\"]")));
    }
}
