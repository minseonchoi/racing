package study.step3;

import study.step3.constant.ConsoleMessage;
import study.step3.input.InputView;
import study.step3.model.Game;
import study.step3.domain.game.Game;


public class Step3Main {
    public static void main(String[] args) {

        String playerName = InputView.getPlayerName();
        int carCount = InputView.getCarCount();
        int raceCount = InputView.getRaceCount();

        // 게임 시작
        Game game = new Game(playerName, carCount, raceCount);

        // 실행 및 출력
        game.playGame(raceCount);

        // 게임 끝
        System.out.println(game.getStringName() + ConsoleMessage.GAME_END.getMessage());
        InputView.scannerClose();
    }
}

