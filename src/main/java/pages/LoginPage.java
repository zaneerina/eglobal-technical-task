package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "identifierId")
    private WebElement emailInputField;

    @FindBy(id = "identifierNext")
    private WebElement nextButton;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(id = "passwordNext")
    private WebElement nextButton2;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        open("https://accounts.google.com/signin");
    }

    private void enterEmail(String email) {
        emailInputField.sendKeys(email);
    }

    private void clickNextButton() {
        nextButton.click();
    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    private void clickNextButton2() {
        nextButton2.click();
    }

    public void setEmail(String email) {
        enterEmail(email);
        clickNextButton();
    }

    public void setPassword(String password) {
        enterPassword(password);
        clickNextButton2();
    }

}