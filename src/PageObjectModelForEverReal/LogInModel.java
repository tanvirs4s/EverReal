package PageObjectModelForEverReal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInModel
{
    private static WebElement element = null;

    public static WebElement LoginLink(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }

    public static WebElement RegisteredUserEmail(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }

    public static WebElement RegisteredUserPassword(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }
    public static WebElement LoginAndSubmit(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }

}
