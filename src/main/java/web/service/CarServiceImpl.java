package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.repo.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("red", 1996, "car1"),
            new Car("blue", 2006, "DAcar2"),
            new Car("grey", 2016, "car3"),
            new Car("green", 2018, "DAcar4"),
            new Car("pink", 2020, "car5")
    ));

    public List<Car> getCars(int count) {
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            if (count == cars.size()){
                break;
            }
            carsList.add(cars.get(i));
        }
        return carsList;
    }
}