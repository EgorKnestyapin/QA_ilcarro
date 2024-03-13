package com.ilcarro.stepDefinitions;

import com.ilcarro.entities.CarDetails;
import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on Ok button")
    public void click_on_Ok_button() {
        new HomePage(driver).clickOnOkButton();
    }

    @And("User clicks on Let the car work link")
    public void click_on_LetTheCarWork_link() {
        new HomePage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User clicks on Logo")
    public void click_on_Logo() {
        new HomePage(driver).clickOnLogo();
    }

    @And("User enters location")
    public void enter_location() {
        new AddCarPage(driver).enterLocation("Tel Aviv");
    }

    @And("User enters car details")
    public void enter_car_details() {
        new AddCarPage(driver).enterCarDetails(
                new CarDetails("Germany", "Mercedes-Benz 200", "2017", "Petrol", "5",
                        "E", "12539GDS", "600"));
    }

    @And("User enters about info")
    public void enter_about_info() {
        new AddCarPage(driver).enterAboutInfo("Very cool car");
    }

    @And("User uploads photo")
    public void upload_photo() {
        new AddCarPage(driver).uploadPhoto("C:/Tools/coolcar.jpg");
    }

    @And("User clicks on Submit button")
    public void click_on_submit_button() {
        new AddCarPage(driver).clickOnSubmitButton();
    }

    @Then("User verifies Car added message displayed")
    public void verify_carAddedMessage_displayed() {
        new AddCarPage(driver).isCarAddedMessageDisplayed();
    }
}
