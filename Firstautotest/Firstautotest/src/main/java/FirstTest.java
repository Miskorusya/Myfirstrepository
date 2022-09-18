import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    String POP_MOB_URL = "https://next.privat24.ua/mobile";

    @Test
    void pop_mob() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage(). timeouts(). implicitlyWait(3, TimeUnit.SECONDS);

    By mob_number = By.xpath("//input[@data-qa-node='phone-number']");
    By amount = By.xpath("//input[@data-qa-node='amount']");
    By cardnumber = By.xpath("//input[@data-qa-node='numberdebitSource']");
    By card_expire = By.xpath("//input[@data-qa-node='expiredebitSource']");
    By card_cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    By submit_button = By.xpath("//button[@data-qa-node='submit']");
    By cardowner_name = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    By cardowner_lastname = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    By terms_and_conditions = By.xpath("//a[@href='https://privatbank.ua/terms']");
    By basket = By.xpath("//div[@class='sc-chPdSV fAeUNs']");
    By details = By.xpath("//div[@class='sc-chPdSV jAFnfe']");



    driver.get(POP_MOB_URL);
    driver.findElement(mob_number).sendKeys("669076547");
    driver.findElement(amount).sendKeys("\b\b\b");
    driver.findElement(amount).sendKeys("25");
    driver.findElement(cardnumber).sendKeys("4552331448138217");
    driver.findElement(card_expire).sendKeys("0524");
    driver.findElement(card_cvv).sendKeys("528");
    driver.findElement(terms_and_conditions).click();
    driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
    Assertions.assertEquals("https://privatbank.ua/terms", driver.getCurrentUrl());

    driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
    driver.findElement(cardowner_name).sendKeys("Penis");
    driver.findElement(cardowner_lastname).sendKeys("Dushilin");
    driver.findElement(submit_button).click();
    Assertions.assertEquals("Кошик", driver.findElement(basket).getText());
    Assertions.assertEquals("Поповнення телефону. На номер +380669076547", driver.findElement(details).getText());




















    }
}
















