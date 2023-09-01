package study.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    @Test
    @DisplayName("경주차는 random숫자가 4 이상이면 움직인다.")
    void moveTest(){
        // given
        RacingCar racingCar = new RacingCar();
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        int randomNumber = randomNumberCreator.createZeroToNine();
        // when
//        racingCar.move(randomNumber);

        // then
    }

}
