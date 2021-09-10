package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppleStorePage extends BasePage {

    @FindBy(xpath = "//div[@class='brand-box__title']")
    private List<WebElement> appleStoreCategoryList;

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getAppleStoreCategoriesList() {
        return appleStoreCategoryList;
    }

    public int getAppleStoreCategoriesAmount() {
        return getAppleStoreCategoriesList().size();
    }
}
