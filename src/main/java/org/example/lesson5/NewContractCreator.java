package org.example.lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContractCreator extends BaseClass{

    public NewContractCreator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NewContractCreator newContractButtonClick(){
        newContractButton.click();
        return this;
    }

    public NewContractCreator inputContractName(String contractName){
        inputContractName.sendKeys(contractName);
        return this;
    }

    public NewContractCreator selectArrow(){
        selectArrow.click();
        return this;
    }

    public NewContractCreator chooseContractor() throws InterruptedException {
        Thread.sleep(3);
        chooseContractor.click();
        return this;
    }

    public NewContractCreator selectExpenditure(){
        selectExpenditure.click();
        return this;
    }

    public NewContractCreator expenseItemChoose(){
       expenseItemChoose.click();
        return this;
    }

    public NewContractCreator successButtonClick(){
        successButton.click();
        return this;
    }

    @FindBy(xpath = "//a[text()='Новый хозяйственный договор']")
    private WebElement newContractButton;

    @FindBy(xpath = "//input[contains(@id,'crm_domcontract_name-uid')]")
    private WebElement inputContractName;

    @FindBy(xpath = "//span[@class='select2-arrow']")
    private WebElement selectArrow;

    @FindBy(xpath = "//li[contains(@class,'select2-results-dept')]/div[contains(text(), 'ооо копыта')]")
    private WebElement chooseContractor;

    @FindBy(xpath = "//select[contains(@id,'crm_domcontract_expenditure-uid')]")
    private WebElement selectExpenditure;

    @FindBy(xpath = "//*[text()='04101 - Программное обеспечение']")
    private WebElement expenseItemChoose;

    @FindBy(xpath = "//div/button[contains(@class,'btn-success action-button')]")
    private WebElement successButton;
}
