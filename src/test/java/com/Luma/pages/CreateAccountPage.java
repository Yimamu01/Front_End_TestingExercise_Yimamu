package com.Luma.pages;

import com.Luma.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "firstname")
    public WebElement firstNameBox;

    @FindBy(id = "lastname")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@autocomplete='email']")
    public WebElement emailAddressBox;

    @FindBy(css = "input[title='Password']")
    public WebElement passwordBox;

    @FindBy(id = "password-confirmation")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createAnAccountButton;

    @FindBy(id = "email_address-error")
    public WebElement emailErrorMessage;

    @FindBy(id = "password-confirmation-error")
    public WebElement dissimilarPasswordMessage;


}
