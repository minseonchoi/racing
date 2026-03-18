package study.step3;

import study.step3.input.InputView;
import study.step3.domain.game.Game;
import study.step3.output.ResultView;

import java.util.ArrayList;

import static study.step3.common.StringUtils.splitByComma;


public class Step3Main {
    public static void main(String[] args) {
        // 게임 시작
        Game game = new Game(
                InputView.getPlayerName(),
                splitByComma(InputView.getCarName()),
                InputView.getRaceCount()
        );

        // 실행 및 출력
        game.playGame();

        // 게임 끝
        ResultView.printGameEnd(game);
        ResultView.printWinners(game.getWinners());

        InputView.scannerClose();
    }
}

