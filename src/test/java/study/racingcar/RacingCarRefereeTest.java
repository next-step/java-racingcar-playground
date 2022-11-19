package study.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/19
 */
class RacingCarRefereeTest {

    private RacingCarReferee racingCarReferee;
    private List<Car> cars;

    @BeforeEach
    void init() {
        cars = Arrays.asList(new Car("one"), new Car("two"), new Car("three"));
        racingCarReferee = new RacingCarReferee(cars);
    }

    @Test
    @DisplayName("Winner 가져오는 테스트")
    void getWinnerTest() {

        for (int i=0; i<5; i++) {
            racingCarReferee.judge();
        }

        assertThat(racingCarReferee.getWinners()).isNotEmpty();
    }
}
