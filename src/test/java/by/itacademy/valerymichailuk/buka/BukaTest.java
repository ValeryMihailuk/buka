package by.itacademy.valerymichailuk.buka;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BukaTest {
    WebDriver driver;

    @BeforeEach
    public void warmUpBuka() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(BukaPage.URL);
    }

    @Test
    public void test1() {
        WebElement btnLogin = driver.findElement(By.xpath(BukaPage.LOGIN_INPUT));
        btnLogin.click();
        WebElement inputLogin = driver.findElement(By.xpath(BukaPage.LOGIN));
        inputLogin.sendKeys(User.LOGIN_TEXT);
        WebElement inputPassword = driver.findElement(By.xpath(BukaPage.PASSWORD));
        inputPassword.sendKeys(User.PASSWORD_TEXT);
        WebElement btnSubmit = driver.findElement(By.xpath(BukaPage.BTM_SUBMIT));
        WebElement inputSearch = driver.findElement(By.xpath(BukaPage.SEARCH));
        inputPassword.sendKeys(User.SEARCH_TEXT);
    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}