package org.example.lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewContactSteps {
    @Given("^I am authorized$")
    public void IAmAuthorized(){
        new LoginPage()
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();

    }
    @Given("^I am at new contact page$")
    public void IAmAtNewContactPage(){
        new MainPage()
                .newContactsClick();
        new NewContactsCreate()
                .contactsClick();

    }
    @When("^I fill first name$")
    public void IFillFirstName(){
        new FillInNewContact().firstNamePut("Naruto");

    }
    @And("^I fill last name$")
    public void IFillLastName(){
        new FillInNewContact().lastNamePut("Uzumaki");

    }
    @And("^I select arrow$")
    public void ISelectArrow(){
        new FillInNewContact().selectArrow();

    }
    @And("^I put organisation$")
    public void IPutOrganisation(){
        new FillInNewContact().putOrganization();

    }
    @And("^I fill job title$")
    public void IFillJobTitle(){
        new FillInNewContact().jobTitleFill("Tester");

    }
    @And("^I click save button$")
    public void IClickSaveButton(){
        new FillInNewContact().saveButtonClick();

    }
    @Then("^I can see success message$")
    public void ICanSeeSuccessMessage(){
        new FillInNewContact().createContactSuccessMessage.shouldBe(Condition.visible);


    }


}
