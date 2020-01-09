package com.qa.Pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"inputValEnter\"]")
    public WebElement search;

    public SearchPage SearchAnyProduct(){
        search.sendKeys("Men's Shirt" , Keys.ENTER);
        return this;
    }

    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div[7]/div[4]/div[3]/div[2]/div/div[2]/input")
    public WebElement enterzipCodeForcheckavailability;

    public SearchPage EnterZipCodeForCheckProductAvailability(){
        enterzipCodeForcheckavailability.sendKeys("560064");
        return this;
    }

    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div[7]/div[4]/div[3]/div[2]/div/div[2]/button")
    public WebElement checkavailability;

    public SearchPage CheckProductAvailabilityInZipCode(){
        checkavailability.click();
        return this;
    }

    @FindBy(xpath = "/html/body/div[11]/div[7]/div[4]/div[3]/div[8]/section[1]/div[1]/div[2]/a/picture/img")
    public WebElement selectShirt;

    public SearchPage SelectShirtInSearch(){
        selectShirt.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"attribute-select-1\"]/div[2]/div/div/div[4]/div/div")
    public WebElement selectsize;

    public SearchPage SelectSizeforProduct(){
        selectsize.click();
        return this;
    }

    @FindBy(xpath = "//span[contains(text(),'add to cart')]")
    public WebElement additem;

    public SearchPage AddItemToCart(){
        additem.click();
        return this;
    }
}
