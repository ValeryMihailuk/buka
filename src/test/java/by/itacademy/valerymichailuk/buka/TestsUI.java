package by.itacademy.valerymichailuk.buka;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestsUI {
    WebDriver driver;
    Steps step;

    @BeforeEach
    public void warmUpBuka() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*",
                "--start-maximized=*","--disable-infobars=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(Pages.URL);
        step = new Steps(driver);
    }

    @Test
    @DisplayName("Authorization")
    public void testAuthorization() {
        Assertions.assertEquals(User.LOGIN_TEXT, step.authorization());
    }

    @Disabled @Test
    @DisplayName("AuthorizationExit")
    public void testExitAuthorization() {
        Assertions.assertEquals("Войти", step.exitAuthorization());
    }

    @Disabled @Test
    @DisplayName("Search")
    public void testSearch() {
        Assertions.assertEquals("Hexus (PC)", step.search());
    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}