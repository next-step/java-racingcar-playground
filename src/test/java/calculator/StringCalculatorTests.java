package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTests {
    private StringCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new StringCalculator();
    }

    @Test
    void null_또는_empty일_경우_0을_반환한다() {
        int result = calc.operate(null);
        assertEquals(result, 0);

        result = calc.operate("");
        assertEquals(result, 0);

        result = calc.operate(" ");
        assertEquals(result, 0);

        result = calc.operate("//;\\n");
        assertEquals(result, 0);
    }

    @ParameterizedTest
    @CsvSource(value = { "1,2|3", "1,2:3|6", "2:3:4|9" }, delimiter = '|')
    void 기본적으로_쉼표_또는_콜론으로_구분된_숫자들을_더한다(String input, int expected) {
        int result = calc.operate(input);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @CsvSource(value = { "//;\\n1;2;3=6" }, delimiter = '=')
    void 커스텀_구분자를_지정할_수_있다(String input, int expected) {
        int result = calc.operate(input);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @ValueSource(strings = { "-1", "a", "//;\\n1;a;3", "//;\\n-1;2;3" })
    void 숫자_이외의_값_또는_음수를_전달하는_경우_RuntimeException_발생(String input) {
        assertThrows(RuntimeException.class, () -> calc.operate(input));
    }
}
