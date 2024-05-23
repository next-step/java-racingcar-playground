package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.domain.CarName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationCheckTest {

    @DisplayName("자동차이름이 1글자 이상 5글자 미만 기능")
    @Test
    void 자동차이름_1이상_5미만(){
        Assertions.assertThatThrownBy(()->{
            assertThat(new CarName(""));
            assertThat(new CarName("qwert"));
        }).isInstanceOf(IllegalArgumentException.class);
    }

}
