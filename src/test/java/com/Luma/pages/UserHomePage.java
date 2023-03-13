package com.Luma.pages;

import com.Luma.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage extends BasePage {


    @FindBy(xpath = "//span[@class='logged-in']")
    public WebElement accountWelcomeText;

    @FindBy(xpath = "//button[@data-action='customer-menu-toggle']")
    public WebElement userNameButton;


    @FindBy(xpath = "//li[@class='authorization-link']")
    public WebElement signOutButton;
}
