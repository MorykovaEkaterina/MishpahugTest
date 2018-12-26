package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventsAuthPageHelper;
import pages.EventsUnAuthPageHelper;
import pages.HomePageHelper;
import pages.LoginPageHelper;

/**
 * Created by Inka on 19-Dec-18.
 */
public class LoginPageTests extends TestBase{
    HomePageHelper homePage;
    LoginPageHelper loginPage;
    EventsAuthPageHelper eventsAuthPage;

    @BeforeMethod
    public void initPage(){
        homePage = PageFactory.initElements(driver,HomePageHelper.class);
        loginPage = PageFactory.initElements(driver,LoginPageHelper.class);
        eventsAuthPage = PageFactory.initElements(driver,EventsAuthPageHelper.class);
    }
    @Test
    public void loginPositive()  {
        homePage.waitUntilPageLoad();
        homePage.pressLoginButton();
        loginPage.waitUntilPageLode();
        loginPage.enterValueToFieldEmail("marina@123.com");
        loginPage.enterValueToFieldPassword("marina");
        loginPage.pressLogInButton();
        eventsAuthPage.waitUntilPageLoad();
       Assert.assertEquals("Menu", eventsAuthPage.getTooltipIconMenu());
       Assert.assertEquals("Find event", eventsAuthPage.getHeader());
    }

    @Test
    public void loginNegative(){
       homePage.waitUntilPageLoad();
       homePage.pressLoginButton();
       loginPage.waitUntilPageLode();
       loginPage.enterValueToFieldEmail("martina@123.com");
       loginPage.enterValueToFieldPassword("marina");
       loginPage.pressLogInButton();
       Assert.assertEquals("Wrong authorization, login or password",loginPage.getAlertText());
    }
}
