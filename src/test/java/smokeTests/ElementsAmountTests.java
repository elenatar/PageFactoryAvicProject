package smokeTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ElementsAmountTests extends BaseTest {

    @Test(priority = 1)
    public void checkElementsAmountOnAppleStorePage() {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().implicitWait(30);
        assertEquals(getAppleStorePage().getAppleStoreCategoriesAmount(), 10);
    }

    @Test(priority = 2)
    public void checkElementsAmountOnIPhone12Page() {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getIphonePage().clickBtnIPhone();
        getIphonePage().waitForLoadComplete(30);
        assertEquals(getIphonePage().getIPhonesAmount(), 12);
    }
}
