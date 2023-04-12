package by.itacademy.valerymichailuk.buka.ui;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import by.itacademy.valerymichailuk.buka.steps.Steps;
import by.itacademy.valerymichailuk.buka.user.User;
import org.openqa.selenium.By;
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
        Assert.assertEquals(User.USER_NAME, steps.checkUserAccount());

    }

    @Test
    public void testExitAuthorization() {
        steps.userAccountLogin().
                userLoginInput().
                userPasswordInput().
                buttonUserAccountLogin().
                buttonExitUserAccount();
        Assert.assertEquals(By.xpath(Pages.BUTTON_INPUT_AUTHORIZATION), steps.emptyAccountLogin());

    }

    @Test
    public void testSearch() {
        steps.userAccountLogin().
                userPasswordInput().
                userLoginInput().
                buttonUserAccountLogin().
                inputSearchingText().
                buttonSearch().
                selectFound().
                buttonPutInCart().
                seeProductInCart().
                deleteProductFromCard().
                checkEmptyCard();
        Assert.assertEquals(Pages.CHECK_EMPTY_CARD, steps.checkEmptyCard());
    }

    @Test
    public void testInvalidLoginAuthorization() {
        steps.userAccountLogin().
                invalidUserLogin().
                userPasswordInput().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_LOGIN_TEXT, steps.checkInvalidLoginText());
    }

    @Test
    public void testInvalidPasswordAuthorization() {
        steps.userAccountLogin().
                invalidUserPassword().
                userLoginInput().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_PASSWORD_TEXT, steps.checkInvalidPasswordText());
    }

    @Test
    public void testInvalidLoginAndPasswordAuthorization() {
        steps.userAccountLogin().
                invalidUserLogin().
                invalidUserPassword().
                buttonUserAccountLogin();
        Assert.assertEquals(User.ERROR_PASSWORD_TEXT, steps.checkInvalidLoginAndPasswordText());
    }

    @AfterTest
    public void closeTestBuka() {
        AvtoDriver.closeDriver();
    }
}