package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BusinessAgreementCreationTests extends BaseClassTest {

    @DisplayName("Вход на сайт crm.geekbrains")
    @Test
    public void LoginTest() {
        driver.get(CRM_URL);
        LoginPage page = new LoginPage(driver)
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();
        WebElement plusButton = driver.findElement(By.xpath("//a[contains(@class, 'dashboard-widgets')]/i[@class = 'icon-plus']"));
        Assertions.assertTrue(plusButton.isDisplayed());
        driver.quit();
    }

    @DisplayName("Переход на страницу создания нового договора")
    @Test
    public void CreateNewContractTest() throws InterruptedException {
        driver.get(CRM_URL);
        LoginPage page = new LoginPage(driver)
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();
        MainPage mainPage = new MainPage(driver)
                .expensesButtonClick();
        Thread.sleep(3);
        driver.quit();
    }

    @DisplayName("Создание нового договора")
    @Test
    public void FillInNewContractTest() throws InterruptedException {
        driver.get(CRM_URL);
        LoginPage page = new LoginPage(driver)
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();
        MainPage mainPage = new MainPage(driver)
                .expensesButtonClick();
        NewContractCreator newContractCreator = new NewContractCreator(driver)
                .newContractButtonClick()
                .inputContractName("Договор_850")
                .selectArrow()
                .chooseContractor()
                .selectExpenditure()
                .expenseItemChoose()
                .successButtonClick();
        WebElement element = driver.findElement(By.xpath("//div[text() = 'Договор сохранен']"));
        Assertions.assertTrue(element.isEnabled());
        Thread.sleep(3);
        driver.quit();
    }

    @Test
    public void CreateNewContactTest() throws InterruptedException {
        driver.get(CRM_URL);

        LoginPage page = new LoginPage(driver)
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();
        MainPage mainPage = new MainPage(driver)
                .newContactsClick();

        Thread.sleep(3);
        driver.quit();
    }

    @DisplayName("Переход на страницу создания нового контактного лица")
    @Test
    public void NewContactPageTest() throws InterruptedException {
        driver.get(CRM_URL);
        LoginPage page = new LoginPage(driver)
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();
        MainPage mainPage = new MainPage(driver)
                .newContactsClick();
        Thread.sleep(10);
        driver.quit();
    }

    @DisplayName("Создание нового контактного лица")
    @Test
    public void FillInNewContactTest() throws InterruptedException {
        driver.get(CRM_URL);
        LoginPage page = new LoginPage(driver)
                .addLogin("Applanatest1")
                .addPass("Student2020!")
                .submitClick();
        Thread.sleep(3);
        MainPage mainPage = new MainPage(driver)
                .newContactsClick();
        NewContactsCreate newContactsCreate = new NewContactsCreate(driver)
                .contactsClick();
        Thread.sleep(3);
        FillInNewContact newContact = new FillInNewContact(driver)
                .firstNamePut("Uzu_")
                .lastNamePut("Maki_")
                .selectArrow()
                .putOrganization()
                .jobTitleFill("Тестировщик_")
                .saveButtonClick();
        Thread.sleep(3);
        WebElement element1 = driver.findElement(By.xpath("//div[text() = 'Контактное лицо сохранено']"));
        Assertions.assertTrue(element1.isEnabled());
        driver.quit();
    }
}






