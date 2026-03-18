package study.step3.domain.game;

import study.step3.domain.car.Cars;
import study.step3.domain.car.RacingCar;
import study.step3.output.ResultView;

import java.util.List;
import java.util.Objects;

public class Game {
    private final PlayerName name;
    private final SetCount setCount;
    private final Cars cars;

    public Game(String name, List<String> carNameList, int raceCount) {
        this(new PlayerName(name), new SetCount(carNameList.size(), raceCount), carNameList);
    }

    public Game(PlayerName name, List<String> carNameList, int raceCount) {
        this(name, new SetCount(carNameList.size(), raceCount), carNameList);
    }

    public Game(PlayerName name, SetCount setCount, List<String> carNameList) {
        this.name = name;
        this.setCount = setCount;
        this.cars = new Cars(carNameList);
    }

    public void playGame() {
        ResultView.printExecutionHeader();

        for (int i = 0; i < this.getRaceCount(); i++) {
            ResultView.printRoundStart(i);

            cars.moveCars();

            ResultView.printRacingCarPositions(this);
        }
    }

    public List<String> getWinners() {
        return this.cars.findWinners();
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
