package PageObjectModelForEverReal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterModel
{
    private static WebElement element = null;

    public static WebElement NewUserPassword(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }

    public static WebElement NewUserRepeatPassword(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }

    public static WebElement RegisterAndSubmit(WebDriver driver)
    {
        element = driver.findElement(By.id(""));
        return element;

    }
}
