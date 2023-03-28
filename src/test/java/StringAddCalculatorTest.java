import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalculatorTest {
    @Test
    void calculate_null_혹은_0(){
        int sumOfNull = StringAddCalculator.calculate(null);
        int sumOfZero = StringAddCalculator.calculate("0");

        assertThat(sumOfNull).isEqualTo(0);
        assertThat(sumOfZero).isEqualTo(0);
    }

    @Test
    void calculate_숫자_1개(){
        int one = StringAddCalculator.calculate("1");
        int ten = StringAddCalculator.calculate("10");

        assertThat(one).isEqualTo(1);
        assertThat(ten).isEqualTo(10);
    }

    @Test
    void calculate_컴마로만_숫자_나누기(){
        //given, when
        int six = StringAddCalculator.calculate("1,2,3");
        int fifteen = StringAddCalculator.calculate("1,2,12");
        //then
        assertThat(six).isEqualTo(6);
        assertThat(fifteen).isEqualTo(15);
    }

    @Test
    void calculate_콜론으로_숫자_나누기(){
        //given, when
        int six = StringAddCalculator.calculate("1:2:3");
        int fifteen = StringAddCalculator.calculate("1,2:12");
        //then
        assertThat(six).isEqualTo(6);
        assertThat(fifteen).isEqualTo(15);
    }

    @Test
    void calculate_커스텀_구분자로_나누기(){
        //given, when
        int six = StringAddCalculator.calculate("//;\\n1:2;3");
        //then
        assertThat(six).isEqualTo(6);
    }

    @Test
    void calculate_음수_전달(){
        //given
        String minus = "1:-2:3";
        //when, then
        assertThatThrownBy(() -> StringAddCalculator.calculate(minus))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void calculate_문자_전달(){
        //given
        String anotherChar = "1:2:3이외의문자";
        //when, then
        assertThatThrownBy(() -> StringAddCalculator.calculate(anotherChar))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
