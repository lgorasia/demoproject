package com.virgingames.pages;


import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.virgingames.drivermanager.ManageDriver.driver;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="onetrust-accept-btn-handler")
    WebElement acceptField;


    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    WebElement loginField;

    public String clickOnLogin() {
       return getTextFromElement(loginField);
    }

    public void clickOnAccept() {

        clickOnElement(acceptField);
    }
    public void clickOnLoginLink(){

        clickOnElement(loginField);

    }

}
