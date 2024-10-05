package racingcarGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcarGame.utils.Validation;

public class ValidationUtilsTest {

    @Test
    void 자동차_이름_유효성() {
        String name = "carname";
        Assertions.assertThat(Validation.carNameValidator(name))
                .isEqualTo(false);
    }



}
