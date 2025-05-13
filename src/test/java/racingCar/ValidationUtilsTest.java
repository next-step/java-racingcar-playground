package racingCar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidationUtilsTest {

    @Test
    void 문자열_쉼표_포함_확인() {
        Assertions.assertFalse(ValidationUtils.hasComma("pobicronghonux"));
        Assertions.assertTrue(ValidationUtils.hasComma("pobi,crong,honux"));
    }

    @Test
    void 이름_5자_초과_확인() {
        Assertions.assertTrue(ValidationUtils.isLengthOver("honux"));
        Assertions.assertFalse(ValidationUtils.isLengthOver("pobixx"));
    }

    @Test
    void 시도_횟수_양수_확인() {
        Assertions.assertFalse(ValidationUtils.isPositiveNumber(-1));
        Assertions.assertFalse(ValidationUtils.isPositiveNumber(0));
        Assertions.assertTrue(ValidationUtils.isPositiveNumber(1));
    }
}