package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;

public class CalculatorTest {
    @DisplayName("입력값을 구분자 기준으로 분리하는 작업")
    @ParameterizedTest
    @CsvSource(value = {"1,2:3,4:5/12345"}, delimiter = '/')
    void 구분자_기준_분리(String input, String result){
        Calculator calculator = new Calculator(input);
        assertThat(calculator.removeSeparator()).isEqualTo(result.split(""));
    }

    @DisplayName("입력값이 커스텀일 경우 커스텀 구분자로 분리하는 작업")
    @Test
    void 커스텀_구분자_분리(){
        String input = "//;\n1;2;3";
        Calculator calculator = new Calculator(input);
        assertThat(calculator.remove()).isEqualTo(new String[]{"1", "2", "3"});
    }

    @DisplayName("입력값 구분자를 분리 후 각 숫자의 합을 반환하는 작업")
    @Test
    void 구분자_분리_숫자합_반환(){
        String input = "//;\n1;2;3;4;5";
        Calculator calculator = new Calculator(input);
        String[] values = calculator.remove();
        int result = calculator.sum(values);
        assertThat(result).isEqualTo(15);
    }


}
