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
                userLoginInput().
                userPasswordInput().
                buttonUserAccountLogin().
                userAccounAftertLogin();
        Assert.assertEquals(User.USER_NAME,
                steps.checkUserAccount());

    }

    @Test
    public void testSearch() {
        steps.inputSearchingText().
                buttonSearch().
                selectFound().
                buttonPutInCart().
                seeProductInCart().
                deleteProductFromCard().
                checkEmptyCard();
        Assert.assertEquals(User.EMPTY_CARD_TEXT, steps.checkEmptyCard());
    }

    @Test
    public void testInvalidLoginAuthorization() {
        steps.userAccountLogin().
                invalidUserLogin().
                userPasswordInput().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_TEXT,
                steps.checkInvalidLoginText());
    }

    @Test
    public void testInvalidPasswordAuthorization() {
        steps.userAccountLogin().
                invalidUserPassword().
                userLoginInput().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_TEXT,
                steps.checkInvalidPasswordText());
    }

    @Test
    public void testEmptyLoginAndPasswordAuthorization() {
        steps.userAccountLogin().
                invalidUserLogin().
                invalidUserPassword().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_TEXT, steps.checkInvalidLoginAndPasswordText());
    }

    @AfterTest
    public void closeTestBuka() {
        AvtoDriver.closeDriver();
    }
}