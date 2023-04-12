package by.itacademy.valerymichailuk.buka.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AvtoDriver {
    private AvtoDriver() {
    }
    private  static WebDriver driver;
    public static WebDriver getDriver(){
if (driver==null) {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*",
            "--start-maximized=*","--disable-infobars=*");
    driver = new ChromeDriver(chromeOptions);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
return driver;
    }
    public static void closeDriver() {
        if (driver!=null) {
            driver.quit();
        }
    }
}
