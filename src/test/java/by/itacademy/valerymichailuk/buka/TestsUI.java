package by.itacademy.valerymichailuk.buka;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestsUI {
    WebDriver driver;

    @BeforeEach
    public void warmUpBuka() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*","--start-maximized=*");
        chromeOptions.addArguments("--disable-infobars=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(Pages.URL);
    }

    @Test
    public void testLoginSearch() {
        WebElement btnAuthorization = driver.findElement(By.xpath(Pages.PROFILE));
        btnAuthorization.click();
        WebElement inputLogin = driver.findElement(By.xpath(Pages.LOGIN));
        inputLogin.sendKeys(User.LOGIN_TEXT);
        WebElement inputPassword = driver.findElement(By.xpath(Pages.PASSWORD));
        inputPassword.sendKeys(User.PASSWORD_TEXT);
        WebElement btnSubmit = driver.findElement(By.xpath(Pages.BTM_SUBMIT));
        WebElement inputSearch = driver.findElement(By.xpath(Pages.SEARCH));
        inputPassword.sendKeys(Search.SEARCH_TEXT);
    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}