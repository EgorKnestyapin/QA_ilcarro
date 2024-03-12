package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement title;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(title);
        return this;
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(id = "1")
    WebElement letTheCarWorkLink;

    public AddCarPage clickOnLetTheCarWorkLink() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        click(letTheCarWorkLink);
        return new AddCarPage(driver);
    }

    @FindBy(className = "positive-button")
    WebElement okButton;

    public HomePage clickOnOkButton() {
        click(okButton);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        return this;
    }

    @FindBy(css = "[href='/']")
    WebElement logo;

    public HomePage clickOnLogo() {
        click(logo);
        return this;
    }
}
