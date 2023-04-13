package by.itacademy.valerymichailuk.buka.pages;


public class Pages {
    public static final String URL = "https://www.shop.buka.ru/";
    public static final String ACCOUNT = "//*[@data-variant='normal']/div/a/img";
    public static final String ACCOUNT_AFTER_AUTHORIZATION = "//*[@src='/media/new_img/ico-user.png']";
    public static final String BUTTON_INPUT_AUTHORIZATION = "//*[@class='btn-red width-100']";
    public static final String LOGIN_INPUT = "//*[@name='login']";
    public static final String PASSWORD_INPUT = "//*[@name='pwd']";
    public static final String ERROR_LOGIN_AND_PASSWORD = "//*[@class='error-login']/ul/li[2]";
    public static final String ERROR = "//*[@class='error-login']/ul/li";
    public static final String CHECK_AUTHORIZATION = "//*[@class='h2']";
    public static final String USER_ACCOUNT_OUTPUT = "(//*[@href='/logout'])[1]";
    public static final String INPUT_SEARCHING_TEXT = "//*[@name='search']";
    public static final String BUTTON_SEARCH = "//*[@id='showSearchResults']";
    public static final String ADD_IN_CARD_FOUNDING_GAME = "//div[4]/div[@class='col-lg-12 col-md-12']";
    public static final String OPEN_FOUND_GAME = "//div[2]/img[@class=' lazyloaded']";
    public static final String SEE_PRODUCT_IN_CARD = "//*[@alt='shopping cart']";
    public static final String DELETE_PRODUCT_FROM_CARD = "//*[@class='basket-tovar-close del']";
    public static final String CHECK_EMPTY_CARD = "//div[8]/div[2][@class=\"nav-popup-body\"]";
}
