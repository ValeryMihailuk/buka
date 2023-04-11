package by.itacademy.valerymichailuk.buka.ui;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import jdk.jfr.Name;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestsUI {
   Pages itsPage;

    @BeforeTest
    public void warmUpBuka() {
        itsPage = new Pages();
    }
    @Test
    public void testAuthorization() {
        Assertion.asserts(User.USER_NAME, step.authorization());
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