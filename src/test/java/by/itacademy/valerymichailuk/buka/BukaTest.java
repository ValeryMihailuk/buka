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
        Assertions.assertEquals(logoBuka, );
            }

    @Test
    public void test1() {

    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}