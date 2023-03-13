package com.Luma.pages;

import com.Luma.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "firstname")
    public WebElement FirstNameBox;

    @FindBy(id = "lastname")
    public WebElement LastNameBox;

    @FindBy(xpath = "//input[@autocomplete='email']")
    public WebElement EmailAddressBox;

    @FindBy(css = "input[title='Password']")
    public WebElement PasswordBox;

    @FindBy(id = "password-confirmation")
    public WebElement ConfirmPasswordBox;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement CreateAnAccountButton;

    @FindBy(id = "email_address-error")
    public WebElement emailErrorMessage;

    @FindBy(id = "password-confirmation-error")
    public WebElement DissimilarPasswordMessage;


}
