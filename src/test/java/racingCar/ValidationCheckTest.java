package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationCheckTest {

    @DisplayName("자동차 이름 길이가 5자를 초과하는지 판별하는 기능")
    @Test
    void 자동차_이름길이_5자_초과(){
        assertThat(ValidationCheck.isFiveLessThan("gabe")).isFalse();
        assertThat(ValidationCheck.isFiveLessThan("qwert")).isTrue();
        assertThat(ValidationCheck.isFiveLessThan("")).isTrue();
    }

}
