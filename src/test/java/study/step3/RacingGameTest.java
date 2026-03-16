package study.step3;

import org.junit.jupiter.api.Test;
import study.step3.common.RandomNumber;
import study.step3.model.Game;
import study.step3.model.PlayerName;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    void 게임_생성() {
        Game game = new Game(new PlayerName("PLAYER_NAME"), 3, 5);
        assertThat(game).isNotNull();
    }

    @Test
    void 값이_0_9_사이로_무작위_값_생성() {
        int randomNumber = RandomNumber.generateLimitTen();
        assertThat(randomNumber).isBetween(0, 10);
    }

    @Test
    void 게임_생성시_carCount에_맞게_자동자_생성() {
        Game game = new Game(new PlayerName("PLAYER_NAME"), 3, 5);
        // Game 내부에서 만들어진 자동차 목록을 가져와서 사이즈가 3인지 검증
        assertThat(game.getCars()).hasSize(3);
    }

}
