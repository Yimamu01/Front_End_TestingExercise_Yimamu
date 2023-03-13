package com.Luma.step_definitions;

import com.Luma.pages.CreateAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DissimilarPasswordMessage {
  CreateAccountPage createAccountPage=new CreateAccountPage();
    @When("user enter dissimilar password in the Password Confirmation Box")
    public void user_enter_dissimilar_in_the_password_confirmation_box() {
       createAccountPage.confirmPasswordBox.sendKeys("dissimilarPassword");
    }
    @Then("user should be able to see an error message in the Password Confirmation Box {string}")
    public void user_should_be_able_to_see_an_error_message_in_the_password_confirmation_box(String string) {
        String ActualResult  =createAccountPage.dissimilarPasswordMessage.getText();
        String ExpectedResult="Please enter the same value again.";

        Assert.assertEquals(ExpectedResult,ActualResult);

    }

}
