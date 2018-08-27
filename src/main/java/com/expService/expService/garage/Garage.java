package com.expService.expService.garage;

import com.expService.expService.objects.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Garage {

  private List<Car> carsList = new ArrayList<>();

  public Car getMyCar(String make){
    for(Car c: carsList) {
      if(c.getMake().equalsIgnoreCase(make)){
        return c;
      }
    }
    return null;
  }

  public Car createCarAndAddToList(String make, String model, int year){
    Car car = new Car(make, model, year);
    carsList.add(car);
    return car;
  }

  public List<Car> showList(){
    return carsList;
  }





}//End of class
