package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(css = "#L2AGLb > div")
    private WebElement agreeButton;

    private By termsAndConditions = By.id("S3BnEe");

    @FindBy(id = "search")
    private WebElement searchResults;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        open("https://www.google.com/");
    }

    @Override
    public void waitForPageLoad() {
        super.waitForPageLoad();
    }

    public void acceptTermsAndConditions() {
        if (agreeButton.isDisplayed() && agreeButton.isEnabled()) {
            agreeButton.click();
        }
    }

    public void setSearch(String searchText){
        searchBox.sendKeys(searchText);
        searchBox.submit();
    }

    public boolean isTermsAndConditionsDisplayed() {
        boolean isDisplayed;
        List<WebElement> termsList = driver.findElements(termsAndConditions);
        isDisplayed = !termsList.isEmpty();
        return isDisplayed;
    }

}
