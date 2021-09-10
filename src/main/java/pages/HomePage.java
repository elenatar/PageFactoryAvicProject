package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement btnSearch;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement btnProductCatalog;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement btnAppleStore;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement amountOfProductsInCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        inputSearch.sendKeys(keyword);
        btnSearch.click();
    }

    public void clickProductCatalogButton() {
        btnProductCatalog.click();
    }

    public void clickAppleStoreButton() {
        btnAppleStore.click();
    }
}
