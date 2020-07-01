package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> listCar = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        addCarsToList();
        return listCar;
    }

    private void addCarsToList() {
        listCar.clear();
        Car car1 = new Car("Car1", 1, 14);
        Car car2 = new Car("Car2", 2, 15);
        Car car3 = new Car("Car3", 3, 16);
        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);

    }
}
