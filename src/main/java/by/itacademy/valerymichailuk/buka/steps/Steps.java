package by.itacademy.valerymichailuk.buka.steps;

import by.itacademy.valerymichailuk.buka.user.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import by.itacademy.valerymichailuk.buka.pages.Pages;
import by.itacademy.valerymichailuk.buka.search.Search;

public class Steps {
    WebDriver driver;

    Steps(WebDriver driver) {
        this.driver = driver;
    }

    public Steps inputAuthorization() {
        WebElement btnAuthorization = driver.findElement(By.xpath(Pages.PROFILE_INPUT));
        btnAuthorization.click();
        return this;
    }

    public Steps inputLogin() {
        WebElement inputLogin = driver.findElement(By.xpath(Pages.LOGIN_INPUT));
        inputLogin.sendKeys(User.LOGIN_TEXT);
        return this;
    }

    public Steps inputPassword() {
        WebElement inputPassword = driver.findElement(By.xpath(Pages.PASSWORD_INPUT));
        inputPassword.sendKeys(User.PASSWORD_TEXT);
        return this;
    }

    public Steps buttonAutorization() {
        WebElement btnAuthorization = driver.findElement(By.xpath(Pages.BTM_SUBMIT));
        btnAuthorization.click();
        return this;
    }

    public Steps checkProfile() {
        WebElement authorizationProfile = driver.findElement(By.xpath(Pages.AUTHORIZATION_PROFILE));
        authorizationProfile.getText();
        return this;
    }

    public Steps checkInvalidLogin() {
        WebElement authorizationProfile = driver.findElement(By.xpath(Pages.));
        authorizationProfile.getText();
        return this;
    }
    public Steps checkInvalidPassword() {
        WebElement authorizationProfile = driver.findElement(By.xpath(Pages.));
        authorizationProfile.getText();
        return this;
    }
    public Steps checkInvalidEmptyInput() {
        WebElement authorizationProfile = driver.findElement(By.xpath(Pages.));
        authorizationProfile.getText();
        return this;
    }

    public Steps buttonExitAuthorization() {
        WebElement btnExit = driver.findElement(By.xpath(Pages.EXIT));
        btnExit.click();
        return this;
    }

    public Steps getTextAboutExitAuthorization() {
        WebElement textInput = driver.findElement(By.xpath(Pages.INVITATION_INPUT));
        textInput.getText();
        return this;
    }

    public Steps inputSearchingText() {
        WebElement searchGame = driver.findElement(By.xpath(Pages.SEARCH));
        searchGame.sendKeys(Search.SEARCH_TEXT);
        return this;
    }

    public Steps buttonSearch() {
        WebElement btnSearch = driver.findElement(By.xpath(Pages.BTN_SEARCH));
        btnSearch.click();
        return this;
    }

    public Steps inputTheFound() {
        WebElement findGame = driver.findElement(By.xpath(Pages.FOUND_GAME));
        findGame.click();
        return this;
    }

    public Steps buttonPutInCart() {
        WebElement putBasket = driver.findElement(By.xpath(Pages.PUT_BASKET));
        putBasket.click();
        return this;
    }

    public Steps seeInCart() {
        WebElement seeBasket = driver.findElement(By.xpath(Pages.SEE_BASKET));
        seeBasket.click();
        return this;
    }

    public Steps checkAvailabilityInCart() {
        WebElement gameInBasket = driver.findElement(By.xpath(Pages.GAME_IN_BASKET));
        gameInBasket.getText();
        return this;
    }

}