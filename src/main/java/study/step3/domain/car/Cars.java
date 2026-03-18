package study.step3.domain.car;

import java.util.ArrayList;

public class Cars {

    private final ArrayList<RacingCar> cars;

    public Cars(ArrayList<String> carNameList) {
        this.cars = initCars(carNameList);
    }

    private ArrayList<RacingCar> initCars(ArrayList<String> carNameList) {
        ArrayList<RacingCar> carList = new ArrayList<>();
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

    public ArrayList<String> findWinners() {
        int maxPosition = findMaxPosition(this.cars);

        ArrayList<String> winners = new ArrayList<>();
        for (RacingCar car : this.cars) {
            addIfWinner(winners, car, maxPosition);
        }
        return winners;
    }

    private void addIfWinner(ArrayList<String> winners, RacingCar car, int maxPosition) {
        if (car.getPosition() == maxPosition) {
            winners.add(car.getCarName());
        }
    }

    public static int findMaxPosition(ArrayList<RacingCar> racingCars) {
        int maxPosition = 0;
        for (RacingCar car : racingCars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    public ArrayList<RacingCar> getCars() {
        return this.cars;
    }
}
