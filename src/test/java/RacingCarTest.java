import model.RacingCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    @Test
    @DisplayName("4이상의 수가 들어왔을 때 레이싱카가 잘 전진하는지 확인한다")
    void racingCarMovesWell(){
        //given
        RacingCar racingCar = new RacingCar("MIKE");
        //when
        racingCar.moveRacingCar(5);
        racingCar.moveRacingCar(9);
        //then
        assertThat(racingCar.getNumOfMove()).isEqualTo(2);
    }

    @Test
    @DisplayName("4보다 작은 수가 입력되었을 떄 레이싱카가 움직이지 않는지 확인한다")
    void racingCarDoesNotMove(){
        //given
        RacingCar racingCar = new RacingCar("WINSTON");
        //when
        racingCar.moveRacingCar(1);
        racingCar.moveRacingCar(4);
        //then
        assertThat(racingCar.getNumOfMove()).isEqualTo(0);
    }
}
