package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class StringAddCalculatorTest {
    StringAddCalculator stringAddCalculator = new StringAddCalculator();

    @Test
    public void splitAndSum_null_또는_빈문자() {
        assertThat(0).isEqualTo(stringAddCalculator.splitAndSum("0"));
        assertThat(0).isEqualTo(stringAddCalculator.splitAndSum(null));
    }

    @Test
    public void splitAndSum_길이1() {
        assertThat(1).isEqualTo(stringAddCalculator.splitAndSum("1"));
    }

    @Test
    public void splitAndSum_쉼표() {
        assertThat(3).isEqualTo(stringAddCalculator.splitAndSum("1,2"));
    }

    @Test
    public void splitAndSum_쉼표_콜론() {
        assertThat(6).isEqualTo(stringAddCalculator.splitAndSum("1,2:3"));
    }

    @Test
    public void splitAndSum_커스텀구분자() {
        assertThat(6).isEqualTo(stringAddCalculator.splitAndSum("//_\n1_2_3"));
    }

    @Test
    public void splitAndSum_커스텀구분자_쉼표() {
        assertThat(10).isEqualTo(stringAddCalculator.splitAndSum("//_\n1_2_3,4"));
    }

    @Test
    public void splitAndSum_커스텀구분자_쉼표_콜론() {
        assertThat(15).isEqualTo(stringAddCalculator.splitAndSum("//_\n1_2_3,4:5"));
    }

    @Test
    public void splitAndSum_음수_RuntimeException() {
        assertThatThrownBy(() -> stringAddCalculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }
}
