package study.racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameValidatorTest {

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없습니다.")
    void validCarNameTest() {

        // given
        String carName = "name";
        CarNameValidator validator = new CarNameValidator();

        // when
        boolean result = validator.validCarName(carName);

        // then
        assertThat(result).isEqualTo(true);
    }

}
