package PageObjectModelForEverReal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreferredViewingTimeModel
{
    private static WebElement element = null;

    public static WebElement SelectPreferredViewingTime(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }
}
