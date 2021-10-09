package org.example.lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillInNewContact extends  BaseClass {

    public FillInNewContact(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public FillInNewContact lastNamePut(String lastname){
        lastName.sendKeys(lastname);
        return this;
    }

    public FillInNewContact firstNamePut(String firstname){
        firstName.sendKeys(firstname);
        return this;
    }

    public FillInNewContact selectArrow(){
        select2Arrow.click();
        return this;
    }

    public FillInNewContact putOrganization(){
        putOrganization.click();
        return this;
    }

    public FillInNewContact jobTitleFill(String  job){
        jobTitle.sendKeys(job);
        return this;
    }

    public FillInNewContact saveButtonClick(){
        button.click();
        return this;
    }

    @FindBy(xpath = "//div/input[contains(@id,'crm_contact_lastName-uid')]")
    private WebElement lastName;

    @FindBy(xpath = "//div/input[contains(@id,'crm_contact_firstName-uid')]")
    private WebElement firstName;

    @FindBy(xpath = "//span[@class='select2-arrow']")
    private WebElement select2Arrow;

    @FindBy(xpath = "//li/div[text()='123test']")
    private WebElement putOrganization;

    @FindBy(xpath = "//div/input[contains(@id,'crm_contact_jobTitle-uid')]")
    private WebElement jobTitle;

    @FindBy(xpath = "//button[contains(.,'Сохранить и закрыть')]")
    private WebElement button;
}

