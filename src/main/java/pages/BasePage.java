package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForLoadComplete(long timeToWait) {
        new WebDriverWait(driver, timeToWait).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void implicitWait(long timeToWait) {
        driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }
}
