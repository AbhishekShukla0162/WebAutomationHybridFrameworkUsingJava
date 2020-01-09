package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PdpPage {

    public PdpPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"dropdown_selected_size_name\"]/span/span/span")
    public WebElement selectsize;

    public PdpPage SelectItemSize(){
        selectsize.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"native_dropdown_selected_size_name_1\"]")
    public WebElement mediumSize;

    public PdpPage SelectmediumSize(){
        mediumSize.click();
        return this;
    }

    @FindBy(xpath ="(//span[contains(@id,'submit.add-to-cart')])[1]")
    public WebElement addtocart;

    public PdpPage additemtoCart(){
        addtocart.click();
        return this;
    }

    @FindBy(xpath ="//*[@id=\"nav-cart\"]")
    public WebElement gotocart;

    public CartPage Navigatetocart(){
        gotocart.click();
        return new CartPage(driver);
    }
}
