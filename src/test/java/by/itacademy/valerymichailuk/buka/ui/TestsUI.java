package by.itacademy.valerymichailuk.buka.ui;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import by.itacademy.valerymichailuk.buka.search.Search;
import by.itacademy.valerymichailuk.buka.steps.Steps;
import by.itacademy.valerymichailuk.buka.user.User;
import org.testng.Assert;
import org.testng.annotations.*;


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
                userAccountAfterLogin();
        Assert.assertEquals(User.NEW_USER_NAME,
                steps.checkUserAccount());

    }

    @Test
    public void testSearch() {
        steps.inputSearchingText().
                buttonSearch().
                selectFound().
                buttonPutInCart().
                seeProductInCart().
                putProductFromCard().
                checkProductInCard();
        Assert.assertEquals(Search.PRODUCT_IN_CARD_TEXT,
                steps.checkProductInCard());
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
    public void testEmptyPasswordAuthorization() {
        steps.userAccountLogin().
                invalidUserLogin().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_EMPTY_PASSWORD_TEXT,
                steps.checkInvalidLoginAndPasswordText());
    }

    @Test
    public void testEmptyLoginAuthorization() {
        steps.userAccountLogin().
                invalidUserPassword().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_EMPTY_LOGIN_TEXT,
                steps.checkInvalidLoginAndPasswordText());
    }

    @AfterTest
    public void closeTestBuka() {
        AvtoDriver.closeDriver();
    }
}