package com.ilcarro.pages;

import com.ilcarro.entities.CarDetails;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddCarPage extends BasePage {
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement pickUpPlace;

    public AddCarPage enterLocation(String location) {
        type(pickUpPlace, location);
        pickUpPlace.sendKeys(Keys.ARROW_DOWN);
        pickUpPlace.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement manufacture;

    @FindBy(id = "model")
    WebElement model;

    @FindBy(id = "year")
    WebElement year;

    @FindBy(id = "fuel")
    WebElement fuel;

    @FindBy(id = "seats")
    WebElement seats;

    @FindBy(id = "class")
    WebElement carClass;

    @FindBy(id = "serialNumber")
    WebElement serialNumber;

    @FindBy(id = "price")
    WebElement price;

    public AddCarPage enterCarDetails(CarDetails carDetails) {
        type(manufacture, carDetails.getManufacture());
        type(model, carDetails.getModel());
        type(year, carDetails.getYear());
        selectFuel(carDetails.getFuel());
        type(seats, carDetails.getSeats());
        type(carClass, carDetails.getCarClass());
        type(serialNumber, carDetails.getCarRegistrationNumber());
        type(price, carDetails.getPrice());
        return this;
    }

    private void selectFuel(String fuelType) {
        Select multiFuel = new Select(fuel);
        switch (fuelType) {
            case "Diesel":
                multiFuel.selectByIndex(0);
                break;
            case "Petrol":
                multiFuel.selectByIndex(1);
                break;
            case "Hybrid":
                multiFuel.selectByIndex(2);
                break;
            case "Electric":
                multiFuel.selectByIndex(3);
                break;
            case "Gas":
                multiFuel.selectByIndex(4);
                break;
        }
    }

    @FindBy(id = "about")
    WebElement about;

    public AddCarPage enterAboutInfo(String aboutInfo) {
        type(about, aboutInfo);
        return this;
    }

    @FindBy(id = "photos")
    WebElement photos;

    public AddCarPage uploadPhoto(String path) {
        photos.sendKeys(path);
        return this;
    }

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    public AddCarPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement carAddedDisplay;

    public AddCarPage isCarAddedMessageDisplayed() {
        assert isElementDisplayed(carAddedDisplay);
        return this;
    }
}
