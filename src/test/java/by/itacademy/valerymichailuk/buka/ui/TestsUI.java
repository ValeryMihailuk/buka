package by.itacademy.valerymichailuk.buka.ui;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import by.itacademy.valerymichailuk.buka.steps.Steps;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestsUI {
    Steps steps;

    @BeforeTest
    public void warmUp() {
        steps = new Steps();
        steps.openPage();
    }

    @Test
    public void testAuthorization() {
steps.userAccountLogin().
        userLoginInput(User.USER_NAME).
        userPasswordInput(User.USER_PASSWORD).
        buttonUserAccountLogin();
        Assert.assertEquals(User.USER_NAME,steps.checkUserAccount());


    }

    @Test
    public void testExitAuthorization() {
    }

    @Test
    public void testSearch() {
    }


    @AfterTest
    public void closeTestBuka() {
        AvtoDriver.closeDriver();
    }
}