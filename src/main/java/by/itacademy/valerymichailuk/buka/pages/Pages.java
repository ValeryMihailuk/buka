package by.itacademy.valerymichailuk.buka.pages;

import org.openqa.selenium.WebDriver;

public class Pages {
    protected WebDriver driver;
    public static final String URL = "https://www.shop.buka.ru/";

    public static final String PROFILE_INPUT = "//*[@data-variant=\"normal\"]/div/a/img";
    public static final String BUTTON_AUTHORIZATION_INPUT = "//*[@class='btn-red width-100']";
    public static final String LOGIN_INPUT = "//*[@name='login']";
    public static final String PASSWORD_INPUT = "//*[@name='pwd']";
    public static final String ERROR = "//*[@class='error-login']/ul";
    public static final String CHECK_AUTHORIZATION = "(//*[@href='/profile'])[2]";

    public static final String EXIT_PROFILE = "(//*[@href='/logout'])[1]";
    public static final String INVITATION_INPUT = "/html/body/div[2]/div/div/div/div[1]";
    public static final String SEARCH = "/html/body/div[1]/div/div[2]/form/input";
    public static final String BTN_SEARCH = "/html/body/div[1]/div/div[2]/form/button[1]";
    public static final String FOUND_GAME = "/html/body/div[3]/div[2]/div/div/div[2]/img";
    public static final String PUT_BASKET = "/html/body/div[3]/div/div/div/div[2]/div[1]/div[4]/div/a";
    public static final String SEE_BASKET = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/a/img";
    public static final String GAME_IN_BASKET = "/html/body/div[8]/div[2]/div/div[2]/p[1]/strong/a";
}
