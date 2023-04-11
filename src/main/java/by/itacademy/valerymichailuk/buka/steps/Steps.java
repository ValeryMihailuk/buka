package by.itacademy.valerymichailuk.buka.steps;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import by.itacademy.valerymichailuk.buka.user.User;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import by.itacademy.valerymichailuk.buka.search.Search;

import java.util.Random;

public class Steps {
    WebDriver driver;

    Steps(WebDriver driver) {
        this.driver = AvtoDriver.getDriver();
    }

    public Steps openBuka() {
        driver.get(Pages.URL);
        return this;
    }

    public Steps userAccountLogin() {
        WebElement buttonAccount = driver.findElement(By.xpath(Pages.ACCOUNT));
        buttonAccount.click();
        return this;

    }

    public Steps userLoginInput(String login) {
        WebElement loginInput = driver.findElement(By.xpath(Pages.LOGIN_INPUT));
        loginInput.sendKeys(User.USER_NAME);
        return this;
    }


    public Steps userPasswordInput(String password) {
        WebElement PasswordInput = driver.findElement(By.xpath(Pages.PASSWORD_INPUT));
        PasswordInput.sendKeys(User.USER_PASSWORD);
        return this;
    }

    public Steps buttonUserAccountLogin() {
        WebElement buttonAccountLogin = driver.findElement(By.xpath(Pages.BUTTON_INPUT_AUTHORIZATION));
        buttonAccountLogin.click();
        return this;
    }

    public Steps checkUserAccount() {
        WebElement checkUserAccount = driver.findElement(By.xpath(Pages.CHECK_AUTHORIZATION));
        checkUserAccount.getText();
        return this;
    }

    public Steps invalidUserLogin() {
        WebElement invalidUserLogin = driver.findElement(By.xpath(Pages.LOGIN_INPUT));
        invalidUserLogin.sendKeys(User.INVALID_USER_NAME);
        return this;
    }

    public Steps invalidUserPassword() {
        Faker fakerLogin = new Faker(new Random(24));
        WebElement invalidUserPassword = driver.findElement(By.xpath(Pages.PASSWORD_INPUT));
        invalidUserPassword.sendKeys(User.INVALID_USER_PASSWORD);
        return this;
    }

    public Steps checkInvalidText() {
        WebElement checkInvalidText = driver.findElement(By.xpath(Pages.ERROR));
        checkInvalidText.getText();
        return this;
    }

    public Steps buttonExitUserAccount() {
        WebElement buttonExitUserAccount = driver.findElement(By.xpath(Pages.USER_ACCOUNT_OUTPUT));
        buttonExitUserAccount.click();
        return this;
    }

    public Steps emptyAccountLogin() {
        WebElement emptyAccountLogin = driver.findElement(By.xpath(Pages.BUTTON_INPUT_AUTHORIZATION));
        return this;
    }

    public Steps inputSearchingText() {
        WebElement inputSearchingText = driver.findElement(By.xpath(Pages.INPUT_SEARCHING_TEXT));
        inputSearchingText.sendKeys(Search.SEARCH_TEXT);
        return this;
    }

    public Steps buttonSearch() {
        WebElement buttonSearch = driver.findElement(By.xpath(Pages.BUTTON_SEARCH));
        buttonSearch.click();
        return this;
    }

    public Steps selectFound() {
        WebElement selectFound = driver.findElement(By.xpath(Pages.ADD_IN_CARD_FOUNDING_GAME));
        selectFound.click();
        return this;
    }

    public Steps buttonPutInCart() {
        WebElement putInCard = driver.findElement(By.xpath(Pages.INPUT_CARD));
        putInCard.click();
        return this;
    }

    public Steps seeProductInCart() {
        WebElement seeProductInCard = driver.findElement(By.xpath(Pages.SEE_PRODUCT_IN_CARD));
        seeProductInCard.getText();
        return this;
    }

    public Steps deleteProductFromCard() {
        WebElement deleteProductFromCard = driver.findElement(By.xpath(Pages.DELETE_PRODUCT_FROM_CARD));
        deleteProductFromCard.click();
        return this;
    }
    public Steps checkEmptyCard() {
        WebElement checkEmptyCard = driver.findElement(By.xpath(Pages.CHECK_EMPTY_CARD));
        checkEmptyCard.click();
        return this;
}