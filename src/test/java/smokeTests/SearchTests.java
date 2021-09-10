package smokeTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD_IN_URL = "MacBook";
    private String SEARCH_KEYWORD_IN_PRODUCT_RESULTS = "MacBook Pro";
    private String SEARCH_QUERY = "query=MacBook";

    @Test(priority = 1)
    public void checkThatURLContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD_IN_URL);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD_IN_PRODUCT_RESULTS);
        for (WebElement element : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(element.getText().contains((SEARCH_KEYWORD_IN_PRODUCT_RESULTS)));
        }
    }
}
