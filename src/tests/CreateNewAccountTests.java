package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewAccountTests extends  TestBase {
    @Test
    public void createPositive () {
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Create Account')]"),45);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("mihOO7712@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Registration')]"),30);

        WebElement cancelButton = driver
                .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
        waitUntilElementIsLoaded(driver,By.xpath("//mat-icon[@mattooltip='Menu']"),20);

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Go to Event list')]"),20);
        WebElement goTo = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        Assert.assertTrue(goTo.getText().equals("Go to Event list"));
    }
    @Test
    public void createAccountAndLogIn(){
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Create Account')]"),45);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("mihpoiIIO772@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Registration')]"),30);

        WebElement cancelButton = driver
                .findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
        waitUntilElementIsLoaded(driver,By.xpath("//mat-icon[@mattooltip='Menu']"),20);

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Go to Event list')]"),20);

        //----------Login created user----------

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("mihpiIIO772@gmail.com");

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"),20);
        WebElement cancel = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        Assert.assertTrue(cancel.getText().equals("Cancel"));



    }
}
