package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


@FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(name = "login_submit")
    WebElement loginButtonField;
//
//    @FindBy(id = "username")
//    WebElement errorTextField;

    @FindBy(xpath ="//body/div[4]/div[1]/div[2]/div[1]/iframe[1]")
    WebElement iframe;


    public void clickOnUserName(){

    }
    





