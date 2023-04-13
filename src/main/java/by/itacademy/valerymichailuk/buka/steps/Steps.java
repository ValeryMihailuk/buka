package by.itacademy.valerymichailuk.buka.steps;

import by.itacademy.valerymichailuk.buka.driver.AvtoDriver;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import by.itacademy.valerymichailuk.buka.user.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import by.itacademy.valerymichailuk.buka.search.Search;


public class Steps {
    protected WebDriver driver;

    public Steps() {
        this.driver = AvtoDriver.getDriver();
    }

    public Steps openPage() {
        driver.get(Pages.URL);
        return this;
    }

    public Steps userAccountLogin() {
        WebElement buttonAccount = driver.findElement(By.xpath(Pages.ACCOUNT));
        buttonAccount.click();
        return this;

    }

    public Steps userLoginInput() {
        WebElement loginInput = driver.findElement(By.xpath(Pages.LOGIN_INPUT));
        loginInput.sendKeys(User.USER_NAME);
        return this;
    }


    public Steps userPasswordInput() {
        WebElement PasswordInput = driver.findElement(By.xpath(Pages.PASSWORD_INPUT));
        PasswordInput.sendKeys(User.USER_PASSWORD);
        return this;
    }

    public Steps buttonUserAccountLogin() {
        WebElement buttonAccountLogin = driver.findElement(By.xpath(Pages.BUTTON_INPUT_AUTHORIZATION));
        buttonAccountLogin.click();
        return this;
    }

    public Steps userAccounAftertLogin() {
        WebElement buttonAccount = driver.findElement(By.xpath(Pages.ACCOUNT_AFTER_AUTHORIZATION));
        buttonAccount.click();
        return this;
    }

    public String checkUserAccount() {
        WebElement checkUserAccount = driver.findElement(By.xpath(Pages.CHECK_AUTHORIZATION));
        return checkUserAccount.getText();
    }

    public Steps invalidUserLogin() {
        WebElement invalidUserLogin = driver.findElement(By.xpath(Pages.LOGIN_INPUT));
        invalidUserLogin.sendKeys(User.INVALID_USER_NAME);
        return this;
    }

    public Steps invalidUserPassword() {
        WebElement invalidUserPassword = driver.findElement(By.xpath(Pages.PASSWORD_INPUT));
        invalidUserPassword.sendKeys(User.INVALID_USER_PASSWORD);
        return this;
    }

    public String checkInvalidLoginText() {
        WebElement checkInvalidLoginText = driver.findElement(By.xpath(Pages.ERROR));
        return checkInvalidLoginText.getText();
    }

    public String checkInvalidPasswordText() {
        WebElement checkInvalidPasswordText = driver.findElement(By.xpath(Pages.ERROR));
        return checkInvalidPasswordText.getText();
    }

    public String checkInvalidLoginAndPasswordText() {
        WebElement checkInvalidLoginAndPasswordText = driver.findElement(By.xpath(Pages.ERROR_LOGIN_AND_PASSWORD));
        return checkInvalidLoginAndPasswordText.getText();
    }


    public Steps emptyUserPassword() {
        WebElement emptyUserPassword = driver.findElement(By.xpath(Pages.PASSWORD_INPUT));
        emptyUserPassword.sendKeys(User.EMPTY_USER_PASSWORD);
        return this;
    }
    public Steps emptyUserLogin() {
        WebElement emptyUserLogin = driver.findElement(By.xpath(Pages.LOGIN_INPUT));
        emptyUserLogin.sendKeys(User.EMPTY_USER_NAME);
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
        WebElement selectFound = driver.findElement(By.xpath(Pages.OPEN_FOUND_GAME));
        selectFound.click();
        return this;
    }

    public Steps buttonPutInCart() {
        WebElement putInCard = driver.findElement(By.xpath(Pages.ADD_IN_CARD_FOUNDING_GAME));
        putInCard.click();
        return this;
    }

    public Steps seeProductInCart() {
        WebElement seeProductInCard = driver.findElement(By.xpath(Pages.SEE_PRODUCT_IN_CARD));
        seeProductInCard.click();
        return this;
    }

    public Steps deleteProductFromCard() {
        WebElement deleteProductFromCard = driver.findElement(By.xpath(Pages.DELETE_PRODUCT_FROM_CARD));
        deleteProductFromCard.click();
        return this;
    }

    public String checkEmptyCard() {
        WebElement checkEmptyCard = driver.findElement(By.xpath(Pages.CHECK_EMPTY_CARD));
        return checkEmptyCard.getText();
    }
}