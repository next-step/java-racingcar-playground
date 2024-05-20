package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ValidationCheckTest {
    @DisplayName("문자열 계산기 이외의 값 또는 음수를 입력하는 경우 Error 기능")
    @Test
    void 문자열_이외의값_또는_음수() throws RuntimeException{
        String input = "가:나";
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class ,()-> {
            Calculator calculator = new Calculator(input);
            String[] values = calculator.remove();
            int result = calculator.sum(values);
        });

        String message = exception.getMessage();
        assertThat(message).isEqualTo("문자열 이외의 값 또는 음수가 포함되어 있습니다.");
    }


}
