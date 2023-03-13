package com.Luma.step_definitions;

import com.Luma.pages.CreateAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProperEmailFormat {

     CreateAccountPage createAccountPage=new CreateAccountPage();
    @When("user enter an invalid email format")
    public void user_enter_an_invalid_email_format() {
createAccountPage.EmailAddressBox.sendKeys("test.gmail.com");


    }
    @Then("user should be able to see an error message {string}")
    public void user_should_be_able_to_see_an_error_message(String string) {

        String actualResult=createAccountPage.emailErrorMessage.getText();
        String expectedResult="Please enter a valid email address (Ex: johndoe@domain.com).";

        Assert.assertEquals(expectedResult,actualResult);

    }

}
