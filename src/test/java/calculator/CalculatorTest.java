package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    @DisplayName("실패 - 숫자 이외의 값 혹은 음수를 던진다.")
    void plusFailedTest() {
        String[] inputWithMinus = new String[]{"1", "-1", "0"};
        String[] inputWithAlphabet = new String[]{"1", "-", "a"};
        Calculator cal = new Calculator();
        Assertions.assertThrows(RuntimeException.class, () -> cal.plus(inputWithMinus));
        Assertions.assertThrows(RuntimeException.class, () -> cal.plus(inputWithAlphabet));
    }

    @Test
    @DisplayName("빈 문자를 던진다.")
    void nullTest() {
        String[] inputWithNull = new String[]{null};
        Calculator cal = new Calculator();
        assertThat(cal.plus(inputWithNull)).isEqualTo(0);
    }

    @Test
    @DisplayName("주어진 배열 숫자로 덧셈한다.")
    void plusTest() {
        String[] input = new String[]{"1","2","3"};
        Calculator cal = new Calculator();
        assertThat(cal.plus(input)).isEqualTo(1+2+3);
    }
}
