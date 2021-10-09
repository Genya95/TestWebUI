package org.example.lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContactsCreate extends BaseClass {

    public NewContactsCreate(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div/a[contains(text(),'Создать контактное лицо')]")
    private WebElement newContactClick;

    public NewContactsCreate contactsClick() {
        newContactClick.click();
        return this;
    }
}


