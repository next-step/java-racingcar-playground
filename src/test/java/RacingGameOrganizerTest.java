import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.RacingCar;
import racing.RacingGameOrganizer;

import java.util.List;

class RacingGameOrganizerTest {


    @Test
    @DisplayName("자동차 이름은 ,로 구분한다.")
    void test1() {
        String carNames = "pobi,crong,honux";
        RacingGameOrganizer racingGameOrganizer = new RacingGameOrganizer();
        List<RacingCar> cars = racingGameOrganizer.createCars(carNames);
        assertThat(cars).hasSize(3);
    }

    @Test
    @DisplayName("게임 랜덤값은 0~9사이의 값을 갖는다.")
    void test2() {
        RacingGameOrganizer racingGameOrganizer = new RacingGameOrganizer();
        assertThat(racingGameOrganizer.createGameNumber())
                .isLessThanOrEqualTo(9)
                .isNotNegative();
    }
}
