package org.example.lesson8;

import com.codeborne.selenide.SelenideElement;
import org.example.lesson5.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class FillInNewContact extends BaseClass {

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

    private SelenideElement lastName = $(By.xpath("//div/input[contains(@id,'crm_contact_lastName-uid')]"));

    private SelenideElement firstName = $(By.xpath("//div/input[contains(@id,'crm_contact_firstName-uid')]"));

    private SelenideElement select2Arrow = $(By.xpath("//span[@class='select2-arrow']"));

    private SelenideElement putOrganization = $(By.xpath("//li/div[text()='123test']"));

    private SelenideElement jobTitle = $(By.xpath("//div/input[contains(@id,'crm_contact_jobTitle-uid')]"));

    private SelenideElement button = $(By.xpath("//button[contains(.,'Сохранить и закрыть')]"));

    public SelenideElement createContactSuccessMessage = $(By.xpath("//div[text() = 'Контактное лицо сохранено']"));
}

