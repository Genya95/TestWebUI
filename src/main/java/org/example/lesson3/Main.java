package org.example.lesson3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.List;
import java.util.concurrent.TimeUnit;


public class Main {
    private static WebDriver driver;
    private static final String CRM_URL = "https://crm.geekbrains.space";

    public static void main(String[] args) throws InterruptedException {
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

    public static void login() {
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
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

