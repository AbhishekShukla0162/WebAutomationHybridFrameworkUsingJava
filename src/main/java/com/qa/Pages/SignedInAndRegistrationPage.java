package com.qa.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignedInAndRegistrationPage {

    public SignedInAndRegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

//    JsonBaseFile jsonBaseFile = new JsonBaseFile();
//    JSONObject jsonObjectforLoginDetails = jsonBaseFile.LoginDetails;
//    JSONObject jsonObjectforRegistrationDetails = jsonBaseFile.RegistrationDetails;

    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
    public WebElement signbutton;

    public SignedInAndRegistrationPage ClickOnSignButton(){
        signbutton.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[1]/ul/li[1]/a")
    public WebElement accountbutton;

    public SignedInAndRegistrationPage ClickOnAccountButton(){
        accountbutton.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"sendOtpUC\"]")
    public WebElement loginwithoutpass;

    public SignedInAndRegistrationPage LoginWithoutPassword(){
        loginwithoutpass.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"userName\"]")
    public WebElement sendid;

    public SignedInAndRegistrationPage SendIDForSigned(){
        sendid.sendKeys("8565009444" , Keys.ENTER);
        //sendid.sendKeys((String) jsonObjectforLoginDetails.get("Id") , Keys.ENTER);
        return this;
    }

    @FindBy(xpath = "//*[@id=\"j_password_login_uc\"]")
    public WebElement sendPassword;

    public SignedInAndRegistrationPage SendPasswordForSigned() {
        sendPassword.sendKeys("262961347");
        // sendPassword.sendKeys((String) jsonObjectforLoginDetails.get("Password"));
        return this;
    }

    @FindBy(xpath = "//*[@id=\"submitLoginUC\"]")
    public WebElement login;

    public SignedInAndRegistrationPage LoginInTheApp(){
        login.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"userName\"]")
    public WebElement sendidforregister;

    public SignedInAndRegistrationPage SendIDRegistration(){
        sendidforregister.sendKeys("abhishektest262@gmail.com");
        // sendidforregister.sendKeys((String) jsonObjectforRegistrationDetails.get("IdForRegistration"));
        return this;
    }

    @FindBy(xpath = "//*[@id=\"checkUser\"]")
    public WebElement sendSigned;

    public SignedInAndRegistrationPage ClickOnContinueButton(){
        sendSigned.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"j_number\"]")
    public WebElement sendnumber;

    public SignedInAndRegistrationPage SendNumberForRegistration(){
        sendnumber.sendKeys("8565009444");
        //sendnumber.sendKeys((String) jsonObjectforRegistrationDetails.get("NumberForRegistration"));
        return this;
    }

    @FindBy(xpath = "//*[@id=\"j_name\"]")
    public WebElement sendname;

    public SignedInAndRegistrationPage SendNameForRegistration(){
        sendname.sendKeys("Abhishek Shukla");
        //sendname.sendKeys((String) jsonObjectforRegistrationDetails.get("NameForRegistration"));
        return this;
    }

    @FindBy(xpath = "//*[@id=\"j_dob\"]")
    public WebElement calender;

    public SignedInAndRegistrationPage ClickOnCalender(){
        calender.click();
        return this;
    }

    @FindBy(xpath = "/html/body/div[15]/div[1]/table/thead/tr[2]/th[2]")
    public WebElement calenderYear;

    public SignedInAndRegistrationPage SelectCalenderYear(){
        calenderYear.click();
        return this;
    }

    @FindBy(xpath = "/html/body/div[15]/div[2]/table/tbody/tr/td/span[2]")
    public WebElement month;

    public SignedInAndRegistrationPage SelectMonth(){
        month.click();
        return this;
    }

    @FindBy(xpath = "/html/body/div[15]/div[1]/table/tbody/tr[4]/td[7]")
    public WebElement date;

    public SignedInAndRegistrationPage SelectDate(){
        date.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"j_password\"]")
    public WebElement sendPasswordforRegister;

    public SignedInAndRegistrationPage SendPasswordForRegistration() {
        sendPasswordforRegister.sendKeys("Abhishek@123");
        //sendPasswordforRegister.sendKeys((String) jsonObjectforRegistrationDetails.get("PasswordForRegistration"));
        return this;
    }

    @FindBy(xpath = "//*[@id=\"userSignup\"]")
    public WebElement continuetoregister;

    public SignedInAndRegistrationPage ClickOnContinueButtonForRegistration(){
        continuetoregister.click();
        return this;
    }
}
