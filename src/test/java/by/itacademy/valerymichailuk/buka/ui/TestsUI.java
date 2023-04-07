package by.itacademy.valerymichailuk.buka.ui;

import jdk.jfr.Name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import by.itacademy.valerymichailuk.buka.steps.Steps;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestsUI {
    WebDriver driver;
    Steps step;

    @BeforeTest
    public void warmUpBuka() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*",
                "--start-maximized=*","--disable-infobars=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(Pages.URL);
        step = new steps(driver);
    }

    @Test
    @Name("Authorization")
    public void testAuthorization() {
        Assertion.asserts(User.LOGIN_TEXT, step.authorization());
    }

    @Test
    @Name("AuthorizationExit")
    public void testExitAuthorization() {
        Assertion.assertEquals("Войти", step.exitAuthorization());
    }

    @Test
    @Name("Search")
    public void testSearch() {
        Assertion.assertEquals("Hexus (PC)", step.search());
    }


    @AfterTest
    public void closeTestBuka() {
        driver.quit();
    }
}