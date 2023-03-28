package by.itacademy.valerymichailuk.buka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Steps {
    WebDriver driver;

    Steps(WebDriver driver) {
        this.driver = driver;
    }

    public String authorization() {
        WebElement btnAuthorization = driver.findElement(By.xpath(Pages.PROFILE));
        btnAuthorization.click();
        WebElement inputLogin = driver.findElement(By.xpath(Pages.LOGIN));
        inputLogin.sendKeys(User.LOGIN_TEXT);
        WebElement inputPassword = driver.findElement(By.xpath(Pages.PASSWORD));
        inputPassword.sendKeys(User.PASSWORD_TEXT);
        WebElement btnAuthorizationInput = driver.findElement(By.xpath(Pages.BTM_SUBMIT));
        btnAuthorizationInput.click();
        WebElement authorizationProfile = driver.findElement(By.xpath(Pages.AUTHORIZATION_PROFILE));
        return authorizationProfile.getText();
    }

    public String exitauthorization() {
        WebElement btnAuthorization = driver.findElement(By.xpath(Pages.PROFILE));
        btnAuthorization.click();
        WebElement inputLogin = driver.findElement(By.xpath(Pages.LOGIN));
        inputLogin.sendKeys(User.LOGIN_TEXT);
        WebElement inputPassword = driver.findElement(By.xpath(Pages.PASSWORD));
        inputPassword.sendKeys(User.PASSWORD_TEXT);
        WebElement btnAuthorizationInput = driver.findElement(By.xpath(Pages.BTM_SUBMIT));
        btnAuthorizationInput.click();
        WebElement btnExit = driver.findElement(By.xpath(Pages.EXIT));
        btnExit.click();
        WebElement textInput = driver.findElement(By.xpath(Pages.INVITATION_INPUT));
        return textInput.getText();
    }

    public String search() {
        WebElement searchGame = driver.findElement(By.xpath(Pages.SEARCH));
        searchGame.sendKeys(Search.SEARCH_TEXT);
        WebElement btnSearch = driver.findElement(By.xpath(Pages.BTN_SEARCH));
        btnSearch.click();
        WebElement findGame = driver.findElement(By.xpath(Pages.FOUND_GAME));
        findGame.click();
        WebElement putBasket = driver.findElement(By.xpath(Pages.PUT_BASKET));
        putBasket.click();
        WebElement seeBasket = driver.findElement(By.xpath(Pages.SEE_BASKET));
        seeBasket.click();
        WebElement gameInBasket = driver.findElement(By.xpath(Pages.GAME_IN_BASKET));
        return gameInBasket.getText();
    }
}