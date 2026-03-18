package study.step3;

import org.junit.jupiter.api.Test;
import study.step3.model.RacingCar;
import study.step3.domain.car.Cars;
import study.step3.domain.car.RacingCar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingCarTest {

    @Test
    void 자동차_생성() {
        RacingCar car = new RacingCar();
        assertThat(car).isNotNull();
    }

    @Test
    void 랜덤_값이_3_이하일_경우_정지() {
        RacingCar car = new RacingCar();
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 랜덤_값이_4_이상일_경우_전진() {
        RacingCar car = new RacingCar();
        car.move(5);
        assertThat(car.getPosition()).isEqualTo(1);
    }

}
