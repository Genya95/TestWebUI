package org.example.lesson8;

import com.codeborne.selenide.SelenideElement;
import org.example.lesson5.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class NewContactsCreate {


    private SelenideElement newContactClick = $(By.xpath("//div/a[contains(text(),'Создать контактное лицо')]"));

    public NewContactsCreate contactsClick() {
        newContactClick.click();
        return this;
    }
}


