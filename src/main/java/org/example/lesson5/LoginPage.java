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

    /*public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(CRM_URL);


        login();
        businessAgreementCreation();
        Thread.sleep(3000);
        createContact();
        driver.quit();

    }

    public static void businessAgreementCreation() throws InterruptedException {
        Actions actions = new Actions(driver);
        List<WebElement> navMenu = driver.findElements(By.xpath("//div[@id='main-menu']/ul/li/a"));
        WebElement navMenuElement = navMenu.stream().filter(e -> e.getText().equals("Расходы")).findFirst().get();
        actions.moveToElement(navMenuElement).perform();
        driver.findElement(By.xpath("//a/span[text()='Хоз. договоры']")).click();
        driver.findElement(By.xpath("//a[text()='Новый хозяйственный договор']")).click();
        driver.findElement(By.xpath("//input[contains(@id,'crm_domcontract_name-uid')]")).sendKeys("Договор_Юдина_1");
        driver.findElement(By.xpath("//span[@class='select2-arrow']")).click();
        driver.findElement(By.xpath("//li/div[(text()='ИП Чебурашка Иван Иванович')]")).click();
        driver.findElement(By.xpath("//select[contains(@id,'crm_domcontract_expenditure-uid')]")).click();
        driver.findElement(By.xpath("//*[text()='04101 - Программное обеспечение']")).click();
        driver.findElement(By.xpath("//div/button[contains(@class,'btn-success action-button')]")).click();
        Thread.sleep(6000);
    }
    public static void createContact() throws InterruptedException {
        Actions actions1 = new Actions(driver);
        WebElement navMenu1 = driver.findElement(By.xpath("//a/span[text()='Контрагенты']"));
        actions1.moveToElement(navMenu1).perform();
        driver.findElement(By.xpath("//a/span[text()='Контактные лица']")).click();
        driver.findElement(By.xpath("//div/a[contains(.,'Создать контактное лицо')]")).click();
        driver.findElement(By.xpath("//div/input[contains(@id,'crm_contact_lastName-uid')]")).sendKeys("Uzu");
        driver.findElement(By.xpath("//div/input[contains(@id,'crm_contact_firstName-uid')]")).sendKeys("Maki");
        driver.findElement(By.xpath("//span[@class='select2-arrow']")).click();
        driver.findElement(By.xpath("//li/div[text()='123test']")).click();
        driver.findElement(By.xpath("//div/input[contains(@id,'crm_contact_jobTitle-uid')]")).sendKeys("Тестер");
        driver.findElement(By.xpath("//button[contains(.,'Сохранить и закрыть')]")).click();
        Thread.sleep(4000);

    }
}

*/