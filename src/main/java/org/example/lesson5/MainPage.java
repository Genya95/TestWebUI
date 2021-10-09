package org.example.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BaseClass {


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage expensesButtonClick(){
        Actions actions = new Actions(driver);
        List<WebElement> navMenu = driver.findElements(By.xpath("//div[@id='main-menu']/ul/li/a"));
        WebElement navMenuElement = navMenu.stream().filter(e -> e.getText().equals("Расходы")).findFirst().get();
        actions.moveToElement(navMenuElement).perform();
        contractButton.click();
        return this;
    }

    public MainPage newContactsClick(){
        Actions actions1 = new Actions(driver);
        WebElement navMenu1 = driver.findElement(By.xpath("//a/span[text()='Контрагенты']"));
        actions1.moveToElement(navMenu1).perform();
        contacts.click();
        return this;
    }
    @FindBy(xpath = "//a/span[text()='Контактные лица']")
    private WebElement contacts;

    @FindBy(xpath = "//ul[contains(@class, 'main-menu')]/li[@class = 'dropdown']/a/span[(text()='Расходы')]")
    private WebElement expensesButton;

    @FindBy(xpath = "//a/span[text()='Хоз. договоры']")
    private WebElement contractButton;

}
