package com.expService.expService.objects;

public class Car {

  private String make;
  private String model;
  private int year;
  private String interior;
  private String color;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getInterior() {
    return interior;
  }

  public void setInterior(String interior) {
    this.interior = interior;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }



}//End of class
