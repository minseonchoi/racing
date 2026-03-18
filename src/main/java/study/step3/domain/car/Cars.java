package study.step3.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<RacingCar> cars;

    public Cars(List<String> carNameList) {
        this.cars = initCars(carNameList);
    }

    private List<RacingCar> initCars(List<String> carNameList) {
        List<RacingCar> carList = new ArrayList<>();
        for (String carName : carNameList) {
            carList.add(new RacingCar(carName));
        }
        return carList;
    }

    public void moveCars() {
        for (RacingCar car : this.cars) {
            car.move();
        }
    }

    public List<String> findWinners() {
        int maxPosition = findMaxPosition(this.cars);

        List<String> winners = new ArrayList<>();
        for (RacingCar car : this.cars) {
            addIfWinner(winners, car, maxPosition);
        }
        return winners;
    }

    private void addIfWinner(List<String> winners, RacingCar car, int maxPosition) {
        if (car.getPosition() == maxPosition) {
            winners.add(car.getCarName());
        }
    }

    public static int findMaxPosition(List<RacingCar> racingCars) {
        int maxPosition = 0;
        for (RacingCar car : racingCars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    public List<RacingCar> getCars() {
        return this.cars;
    }
}
