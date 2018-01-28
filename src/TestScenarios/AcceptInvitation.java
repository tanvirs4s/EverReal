package TestScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import AutomationHelper.*;
import PageObjectModelForEverReal.*;
import TestData.*;
import FlashMessages.*;

public class AcceptInvitation
{
    public WebDriver driver;

    @Test
    public void AcceptInvitationForNewUser() throws Exception
    {
        PreferredViewingTimeModel.SelectPreferredViewingTime(driver).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,400)", "");
        RegisterModel.NewUserPassword(driver).sendKeys(UserInformation.NewUserPassword());
        RegisterModel.NewUserRepeatPassword(driver).sendKeys(UserInformation.NewUserRepeatPassword());
        RegisterModel.RegisterAndSubmit(driver).click();
        String GetActualConfirmMessageForViewingTime = ConfirmationMessages.ConfirmViewingTimeMessages(driver);
        Assert.assertEquals(GetActualConfirmMessageForViewingTime,"You have selected your timeslot! See you soon");
    }

    @Test
    public void AcceptInvitationForRegisteredUser() throws Exception
    {
        PreferredViewingTimeModel.SelectPreferredViewingTime(driver).click();
        LogInModel.LoginLink(driver).click();
        LogInModel.RegisteredUserEmail(driver).sendKeys(UserInformation.RegisteredUserEmail());
        LogInModel.RegisteredUserPassword(driver).sendKeys(UserInformation.RegisteredUserPassword());
        LogInModel.LoginAndSubmit(driver).click();
        String GetActualConfirmMessageForViewingTime = ConfirmationMessages.ConfirmViewingTimeMessages(driver);
        Assert.assertEquals(GetActualConfirmMessageForViewingTime,"You have selected your timeslot! See you soon");
    }
    @BeforeMethod
    public void setUp() throws Exception
    {
        driver = new FirefoxDriver();
        String InvitationUrl = ReadInvitationURL.GetInvitationUrl();
        driver.get(InvitationUrl);
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        MyAccountPage.LogMeOut(driver).click();
        driver.quit();
    }
}
