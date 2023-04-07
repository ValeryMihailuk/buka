package by.itacademy.valerymichailuk.buka.ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import by.itacademy.valerymichailuk.buka.steps.Steps;
import by.itacademy.valerymichailuk.buka.user.User;

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
        step = new steps(driver);
    }

    @Test
    @DisplayName("Authorization")
    public void testAuthorization() {
        Assertions.assertEquals(User.LOGIN_TEXT, step.authorization());
    }

    @Test
    @DisplayName("AuthorizationExit")
    public void testExitAuthorization() {
        Assertions.assertEquals("Войти", step.exitAuthorization());
    }

    @Test
    @DisplayName("Search")
    public void testSearch() {
        Assertions.assertEquals("Hexus (PC)", step.search());
    }


    @AfterEach
    public void closeTestBuka() {
        driver.quit();
    }
}