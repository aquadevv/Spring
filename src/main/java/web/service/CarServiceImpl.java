package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = createCars();

    @Override
    public List<Car> getCars(int count) {
        if (count < 0)
            return new ArrayList<>();
        if (count == 0 || count >= cars.size()) {
            return this.cars;
        }
        return cars.stream().limit(count).toList();
    }

    private List<Car> createCars() {
        return List.of(
                new Car("Lada Priora (zanijena)", "pink", "v8"),
                new Car("Ya", "skyblue", "ass"),
                new Car("Harin Alexey", "pidor", "asssss"),
                new Car("Zek C#", "gay", "Unity"),
                new Car("Furry", "brown", "x5")
        );
    }
}
