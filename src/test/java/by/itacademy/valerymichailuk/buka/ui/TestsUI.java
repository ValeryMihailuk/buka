package by.itacademy.valerymichailuk.buka.ui;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import jdk.jfr.Name;
import org.openqa.selenium.WebDriver;
import by.itacademy.valerymichailuk.buka.steps.Steps;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestsUI {
    public WebDriver driver;

    @BeforeTest
    public void warmUpBuka() {
        AvtoDriver avtoDriver;
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
        AvtoDriver.closeDriver();
    }
}