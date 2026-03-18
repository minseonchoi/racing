package study.step3;

import org.junit.jupiter.api.Test;
import study.step3.common.RandomNumber;
import study.step3.domain.game.Game;
import study.step3.domain.game.PlayerName;


import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    void 게임_생성() {
        Game game = new Game(new PlayerName("PLAYER_NAME"), new ArrayList<>(Arrays.asList("Formula", "IndyCar")), 5);
        assertThat(game.getStringName()).isEqualTo("PLAYER_NAME");
        assertThat(game.getCars()).hasSize(2);
        assertThat(game.getRaceCount()).isEqualTo(5);
        assertThat(game.getCars().get(0).getCarName()).isEqualTo("Formula");
    }

    @Test
    void 값이_0_9_사이로_무작위_값_생성() {
        int randomNumber = RandomNumber.generateLimitTen();
        assertThat(randomNumber).isBetween(0, 10);
    }

}
