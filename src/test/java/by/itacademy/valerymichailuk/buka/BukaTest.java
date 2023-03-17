package by.itacademy.valerymichailuk.buka;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BukaTest {
    WebDriver driver;

    @BeforeEach
    public void openBuka() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BukaPage.URL);

    @Test
    public void test1() {
        WebElement inputLogin = driver.findElement(By.xpath(BukaPage.LOGIN_INPUT));
        inputLogin.click();
            WebElement inputLoginError = driver.findElement(By.xpath(BukaPage.LOGIN_INPUT));
            inputLogin.click();
        String inputError = driver.findElement(By.xpath()).getText();
        Assertions.assertEquals("Не введен пароль", cardWithMargarita);
    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}