package study.caluator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculatorTest {

    @Test
    @CsvSource(value = {"1,2,3*6", "1:2:3*6", "//A\n1A2A3*6", "1:-2:3*5"}, delimiter = '*')
    void calculateTest(String value, String expected) {
        //given
        StringCalculator stringCalculator = new StringCalculator();
        //when
        int actual = stringCalculator.calculate(value);
        //then
        assertThat(actual).isEqualTo(expected);
    }

}
