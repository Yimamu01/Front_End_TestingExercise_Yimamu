package com.Luma.step_definitions;

import com.Luma.pages.CreateAccountPage;
import com.Luma.pages.UserHomePage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.When;


public class CreatAnAccountWithJavaFaker {

// objects from Pages package (POM design pattern)
    CreateAccountPage createAccountPage=new CreateAccountPage();

    UserHomePage userHomePage=new UserHomePage();

    Faker fake=new Faker();


// fake datas
    String firstName=fake.name().firstName();
    String lastName=fake.name().lastName();

    String email=fake.internet().emailAddress();

    String password="Test123456";
    @When("user enter first name in the First Name Box")
    public void user_enter_first_name_in_the_first_name_box() {
        createAccountPage.firstNameBox.sendKeys(firstName);
    }
    @When("user enter last name in the Last Name Box")
    public void user_enter_last_name_in_the_last_name_box() {
        createAccountPage.lastNameBox.sendKeys(lastName);
    }
    @When("user enter email in the Email box")
    public void user_enter_email_in_the_email_box() {
        createAccountPage.emailAddressBox.sendKeys(email);

    }
    @When("user enter password in the Password Box")
    public void user_enter_password_in_the_password_box() {
        createAccountPage.passwordBox.sendKeys(password);

    }
    @When("user enter password in the Password Confirmation Box")
    public void user_enter_password_in_the_password_confirmation_box() {
       createAccountPage.confirmPasswordBox.sendKeys(password);
    }
}
