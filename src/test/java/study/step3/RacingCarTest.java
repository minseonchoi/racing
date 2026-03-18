package study.step3;

import org.junit.jupiter.api.Test;
import study.step3.domain.car.Cars;
import study.step3.domain.car.RacingCar;

import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingCarTest {

    @Test
    void 자동차_생성() {
        RacingCar car = new RacingCar("Formula");
        assertThat(car.getCarName()).isEqualTo("Formula");
    }

    @Test
    void 랜덤_값이_3_이하일_경우_정지() {
        RacingCar car = new RacingCar("IndyCar");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 랜덤_값이_4_이상일_경우_전진() {
        RacingCar car = new RacingCar("Formula");
        car.move(5);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 차_리스트_중_가장_큰_포지션의_수() {
        RacingCar car1 = new RacingCar("Formula");
        RacingCar car2 = new RacingCar("IndyCar");
        RacingCar car3 = new RacingCar("BMW");

        car1.move(5);
        car1.move(5);

        car2.move(4);
        car3.move(2);

        int maxPosition = Cars.findMaxPosition(List.of(car1, car2, car3));
        assertThat(maxPosition).isEqualTo(2);
    }

}
