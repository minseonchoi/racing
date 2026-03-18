package study.step3.output;

import study.step3.constant.ConsoleMessage;
import study.step3.domain.game.Game;
import study.step3.domain.car.RacingCar;

import java.awt.*;
import java.util.ArrayList;


public class ResultView {

    public static void printRacingCarPositions(Game game) {
        for (RacingCar car : game.getCars()) {
            String carNamePart = ConsoleMessage.CAR_NAME.getFormatMessage(car.getCarName());
            String carPositionPart = ConsoleMessage.CAR_POSITION_MARK.getMessage().repeat(car.getPosition());
            System.out.println(carNamePart + carPositionPart);
        }

        System.out.println();
    }

    public static void printExecutionHeader() {
        // 실행 결과
        System.out.println(ConsoleMessage.EXECUTION_RESULT.getMessage());
    }

    public static void printRoundStart(int i) {
        // 각라운드 시작 번호
        System.out.println(ConsoleMessage.START_ROUND.getMessage() + (i + 1));
    }

    public static void printGameEnd(Game game) {
        System.out.println(game.getStringName() + ConsoleMessage.GAME_END.getMessage());
    }

    public static void printWinners(ArrayList<String> winners) {
        System.out.println(String.join(", ", winners) + " won the race.");
    }
}
