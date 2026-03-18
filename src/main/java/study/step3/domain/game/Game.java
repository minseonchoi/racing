package study.step3.domain.game;

import study.step3.constant.ConsoleMessage;
import study.step3.output.OutputMethod;
import study.step3.domain.car.Cars;
import study.step3.domain.car.RacingCar;

import java.util.List;
import java.util.Objects;

public class Game {
    private final PlayerName name;
    private final SetCount setCount;
    private final Cars cars;

    public Game(String name, int carCount, int raceCount) {
        this(new PlayerName(name), new SetCount(carCount, raceCount));
    }

    public Game(PlayerName name, int carCount, int raceCount) {
        this(name, new SetCount(carCount, raceCount));
    }

    public Game(PlayerName name, SetCount setCount) {
        this.name = name;
        this.setCount = setCount;
        this.cars = new Cars(setCount.getCarCount());
    }

    public void playGame(int raceCount) {
        for (int i = 0; i < raceCount; i++) {
            System.out.println(ConsoleMessage.START_ROUND.getMessage() + (i + 1));
            if (i == raceCount - 1) {
                System.out.println(ConsoleMessage.EXECUTION_RESULT.getMessage());
            }
            cars.moveCars();
            OutputMethod.printRacingCarPositions(this);
            System.out.println();
        }
    }

    public List<RacingCar> getCars() {
        return this.cars.getCars();
    }

    public String getStringName() {
        return this.name.getName();
    }

    public int getCarCount() {
        return this.setCount.getCarCount();
    }

    public int getRaceCount() {
        return this.setCount.getRaceCount();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(name, game.name) && Objects.equals(setCount, game.setCount) && Objects.equals(cars, game.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, setCount, cars);
    }
}
