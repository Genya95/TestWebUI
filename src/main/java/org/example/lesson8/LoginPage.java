package org.example.lesson8;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage  {
    public LoginPage() {
    }

    private SelenideElement prependedInput = $(By.id("prependedInput"));

    private SelenideElement prependedInput2 = $(By.id("prependedInput2"));

    private SelenideElement submit = $(By.id("_submit"));


    public LoginPage addLogin(String login) {
        open("https://crm.geekbrains.space/");
        prependedInput.sendKeys(login);
        return this;
    }

    public LoginPage addPass(String pass) {
        prependedInput2.sendKeys(pass);
        return this;
    }

    public LoginPage submitClick() {
        submit.click();
        return this;
    }
}

