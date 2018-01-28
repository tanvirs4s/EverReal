package PageObjectModelForEverReal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage
{
    private static WebElement element = null;

    public static WebElement LogMeOut(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }
}
