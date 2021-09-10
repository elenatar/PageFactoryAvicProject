package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductList;
    }
}
