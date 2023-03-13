package com.Luma.step_definitions;

import com.Luma.pages.CreateAccountPage;
import com.Luma.pages.HomePage;
import com.Luma.pages.UserHomePage;
import com.Luma.utilities.ConfigurationReader;
import com.Luma.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class CreatAnAccount {


    // objects from Pages package (POM design pattern)
    HomePage homePage=new HomePage();
   CreateAccountPage createAccountPage=new CreateAccountPage();

   UserHomePage userHomePage=new UserHomePage();


    @Given("user in on home page")
    public void user_in_on_home_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("user click on create an account button")
    public void user_click_on_create_an_account_button() {
        homePage.creatAnAccount.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("user enter {string} in the First Name Box")
    public void user_enter_in_the_first_name_box(String string) {
         createAccountPage.firstNameBox.sendKeys(string);
    }
    @When("user enter {string} in the Last Name Box")
    public void user_enter_in_the_last_name_box(String string) {
       createAccountPage.lastNameBox.sendKeys(string);
    }
    @When("use enter {string} in the Email Box")
    public void use_enter_in_the_email_box(String string) {
        createAccountPage.emailAddressBox.sendKeys(string);
    }
    @Then("user enter {string} in the Password box")
    public void user_enter_in_the_password_box(String string) {
        createAccountPage.passwordBox.sendKeys(string);
    }

    @Then("user enter {string} in the Password Confirmation box")
    public void user_enter_in_the_passwordConfirm_box(String string) {
        createAccountPage.confirmPasswordBox.sendKeys(string);
    }


    @Then("user click on Creat an Account Confirmation button")
    public void user_click_on_creat_an_account_button() {
        createAccountPage.createAnAccountButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Then("user be able to the message {string}")
    public void user_be_able_to_the_message(String string) {

    String Actual =userHomePage.accountWelcomeText.getAttribute("class");
    String Expected="logged-in";
       Assert.assertEquals(Expected,Actual);
       Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @Then("user click on log-out button")
    public void user_click_on_log_out_button() {
        userHomePage.userNameButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        userHomePage.signOutButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

}
