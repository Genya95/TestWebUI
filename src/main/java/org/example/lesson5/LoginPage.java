package org.example.lesson5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {


    @FindBy(id = "prependedInput")
    private WebElement prependedInput;

    @FindBy(id = "prependedInput2")
    private WebElement prependedInput2;

    @FindBy(id = "_submit")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public LoginPage addLogin(String login) {
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

