package FlashMessages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationMessages
{
    public static String ConfirmViewingTimeMessages(WebDriver driver)
    {
        WebElement alert = driver.findElement(By.id(""));
        String alert_text = alert.getText();
        return alert_text;
    }
}
