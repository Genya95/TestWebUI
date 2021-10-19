package org.example.lesson8;

import com.codeborne.selenide.SelenideElement;
import org.example.lesson5.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private List<SelenideElement> navMenu = $$(By.xpath("//div[@id='main-menu']/ul/li/a"));
    private SelenideElement navMenu1 = $(By.xpath("//a/span[text()='Контрагенты']"));


    public MainPage expensesButtonClick(){
        navMenu.stream().filter(e -> e.getText().equals("Расходы")).findFirst().get().hover();
        return this;
    }

    public MainPage newContactsClick(){
        navMenu1.hover();
        contacts.click();
        return this;
    }

    private SelenideElement contacts = $(By.xpath("//a/span[text()='Контактные лица']"));

    private SelenideElement expensesButton = $(By.xpath("//ul[contains(@class, 'main-menu')]/li[@class = 'dropdown']/a/span[(text()='Расходы')]"));

    private SelenideElement contractButton = $(By.xpath("//a/span[text()='Хоз. договоры']"));

}
