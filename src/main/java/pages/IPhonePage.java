package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IPhonePage extends BasePage {

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'iphone')]")
    private WebElement btnIPhone;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> iPhonesList;

    public IPhonePage(WebDriver driver) {
        super(driver);
    }

    public void clickBtnIPhone() {
        btnIPhone.click();
    }

    public int getIPhonesAmount() {
        return iPhonesList.size();
    }
}
