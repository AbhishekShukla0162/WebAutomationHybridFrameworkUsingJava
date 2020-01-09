package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]")
    public WebElement gotocheckout;

    public CartPage Proceedtocheckout(){
        gotocheckout.click();
        return this;
    }
}
