package automationpractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaElements extends WebDriverSettingsAP {

    @Test
    public void testTextBox() {
        goToElements();
        enterFullName("Lidzi");
        enterEmail("sohello@test.com");
        enterCurrentAddress("blabla");
        enterPermanentAddress("blablabla");

    }

}
