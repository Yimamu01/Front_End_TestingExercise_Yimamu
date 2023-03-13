package com.Luma.pages;

import com.Luma.step_definitions.CreatAnAccount;
import com.Luma.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);

}


@FindBy(linkText = "Create an Account")
   public WebElement CreatAnAccount ;



}
