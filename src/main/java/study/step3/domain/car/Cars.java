package study.step3.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<RacingCar> cars;

    public Cars(int carCount) {
        this.cars = initCars(carCount);
    }

    private List<RacingCar> initCars(int count) {
        List<RacingCar> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(new RacingCar());
        }
        return carList;
    }

    public void moveCars() {
        for (RacingCar car : this.cars) {
            car.move(RandomNumber.generateLimitTen());
        }
    }

    public List<RacingCar> getCars() {
        return this.cars;
    }
}
