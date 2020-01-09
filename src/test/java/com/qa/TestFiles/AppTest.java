package com.qa.TestFiles;

import com.qa.BaseFiles.BaseApp;
import com.qa.Pages.SearchPage;
import com.qa.Pages.SignedInAndRegistrationPage;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Profile;
import org.testng.annotations.Test;

public class AppTest extends BaseApp {

    public WebDriver driver = capabilities();

    @Test
    @Profile("With Guest user Search an item and Add it to Cart and Handle Two Windows Technique")
    public void TestOne() throws InterruptedException {

        String parentWindowHandle = driver.getWindowHandle();
        driver.get(BaseUrl);
        SearchPage searchPage = new SearchPage(driver);
        searchPage.SearchAnyProduct()
                .EnterZipCodeForCheckProductAvailability()
                .CheckProductAvailabilityInZipCode();
        Thread.sleep(5000);
        searchPage.SelectShirtInSearch();
        Thread.sleep(5000);
        driver.close();

        for (String childTab : driver.getWindowHandles()) {
            driver.switchTo().window(childTab);
        }

        Thread.sleep(5000);
        searchPage.AddItemToCart();
        Thread.sleep(2000);
    }

    @Test
    @Profile("Login on App")
    public void TestTwo() throws InterruptedException {
        driver.get(BaseUrl);

        SignedInAndRegistrationPage signedInAndRegistrationPage = new SignedInAndRegistrationPage(driver);
        signedInAndRegistrationPage.ClickOnSignButton()
                .ClickOnAccountButton()
                .SendIDForSigned()
                .SendPasswordForSigned()
                .LoginInTheApp();
        Thread.sleep(2000);
        driver.get(BaseUrl);
        Thread.sleep(2000);

    }

    @Test
    @Profile("Simple registration in App")
    public void TestThree() throws InterruptedException {
        driver.get(BaseUrl);

        SignedInAndRegistrationPage signedInAndRegistrationPage = new SignedInAndRegistrationPage(driver);
        signedInAndRegistrationPage.ClickOnSignButton()
                .ClickOnAccountButton()
                .SendIDRegistration()
                .ClickOnContinueButton()
                .SendNumberForRegistration()
                .SendNameForRegistration()
                .ClickOnCalender()
                .SelectCalenderYear()
                .SelectMonth()
                .SendPasswordForRegistration()
                .ClickOnContinueButtonForRegistration();
        Thread.sleep(2000);
          driver.get(BaseUrl);
          Thread.sleep(2000);
    }

    @Test
    @Profile("Login on App and add Logger Message")
    public void TestFour() throws InterruptedException {
        driver.get(BaseUrl);
        logger.info("Base URL is Open");
        SignedInAndRegistrationPage signedInAndRegistrationPage = new SignedInAndRegistrationPage(driver);
        signedInAndRegistrationPage.ClickOnSignButton();
        logger.info("Clicked on Signed Button");
        signedInAndRegistrationPage.ClickOnAccountButton();
        logger.info("Clicked on Account Button");
        signedInAndRegistrationPage.SendIDForSigned();
        logger.info("Send ID of SignIn in Account");
        signedInAndRegistrationPage.SendPasswordForSigned();
        logger.info("Send Password of SignIn in Account");
        signedInAndRegistrationPage .LoginInTheApp();
        logger.info("Successfully Login into the Snapdeal App");
        Thread.sleep(2000);
        driver.get(BaseUrl);
        Thread.sleep(2000);
    }

    @Test
    @Profile("A failed Test Case for Seeing Proper Report")
    public void TestFive() throws InterruptedException {
        driver.get(BaseUrl);

        SignedInAndRegistrationPage signedInAndRegistrationPage = new SignedInAndRegistrationPage(driver);
        signedInAndRegistrationPage.ClickOnSignButton()
                .ClickOnAccountButton()
                .SendPasswordForSigned()
                .LoginInTheApp();
        Thread.sleep(2000);
        driver.get(BaseUrl);
        Thread.sleep(2000);

    }
}