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
        WebElement logoBuka = driver.findElement(By.xpath(BukaPage.LOGO_BUKA));
            }

    @Test
    public void test1() {
        String inputLogin = driver.findElement(By.xpath(TerrapizzaPage.MARGARITA_IN_CARD)).getText();
        Assertions.assertEquals("Пицца Маргарита Классическая 32 см", cardWithMargarita);
    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}