package study.step3.output;

import study.step3.constant.ConsoleMessage;
import study.step3.model.Game;
import study.step3.model.RacingCar;
import study.step3.domain.game.Game;
import study.step3.domain.car.RacingCar;


public class OutputMethod {

    public static void printRacingCarPositions(Game game) {
        for (RacingCar car : game.getCars()) {
            System.out.println(
                    ConsoleMessage.CAR_POSITION_MARK.getMessage()
                            .repeat(car.getPosition())
            );
        }
    }
}
