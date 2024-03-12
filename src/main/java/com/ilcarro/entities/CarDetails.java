package com.ilcarro.entities;

import java.util.Objects;

public class CarDetails {
    private String manufacture;
    private String model;
    private String year;
    private String fuel;
    private String seats;
    private String carClass;
    private String carRegistrationNumber;
    private String price;

    public CarDetails(String manufacture, String model, String year, String fuel, String seats, String carClass,
                      String carRegistrationNumber, String price) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.seats = seats;
        this.carClass = carClass;
        this.carRegistrationNumber = carRegistrationNumber;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getFuel() {
        return fuel;
    }

    public String getSeats() {
        return seats;
    }

    public String getCarClass() {
        return carClass;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public String getPrice() {
        return price;
    }
}
