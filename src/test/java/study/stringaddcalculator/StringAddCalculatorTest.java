package study.stringaddcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/16
 */
class StringAddCalculatorTest {

    private StringAddCalculator calculator;

    @BeforeEach
    void init() {
        calculator = new StringAddCalculator();
    }

    @Test
    @DisplayName("구분자 포함 계산 테스트")
    void calcIncludeTokenTest() {
        String input = "//;\n5;7;9";
        int expected = 21;
        assertThat(calculator.calc(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("기본 계산 테스트")
    @CsvSource(value = {"1,2,3=6", "5:7:9=21"}, delimiter = '=')
    void calc(String parameter, int expected) {
        assertThat(calculator.calc(parameter)).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("문자 혹은 음수 일때 예외 테스트")
    @ValueSource(strings = {"-1,2,3", "5:a:9"})
    void calcExceptionTest(String parameter) {
        assertThatThrownBy(() -> calculator.calc(parameter))
                .isInstanceOf(BadEnterException.class);
    }

    @Test
    @DisplayName("하나의 문자 입력시 테스트")
    void calcOnlyOneNumberTest() {
        assertThat(calculator.calc("5")).isEqualTo(5);
    }
}
