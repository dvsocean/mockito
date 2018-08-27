package com.expService.expService.controllers;

import com.expService.expService.garage.Garage;
import com.expService.expService.objects.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

  @Autowired
  private Garage garage;

  @GetMapping("/car/{make}")
  public Car fetchCarByMake(@PathVariable("make") String make){
    return garage.getMyCar(make);
  }

  @PostMapping("/car/add")
  public Car createCar(@RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("year") int year){
    return garage.createCarAndAddToList(make, model, year);
  }

  @GetMapping("/garage")
  public List<Car> fetchGarage(){
    return garage.showList();
  }

}
