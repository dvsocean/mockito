package com.expService.garage;

import com.expService.objectsToMock.Car;

public class Garage {

  Car car = new Car("Honda");

  public String getMyCar(){
    return car.getMake();
  }

}//End of class
