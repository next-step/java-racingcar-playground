package study.caluator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringParserTest {

    private StringParser stringParser;

    @BeforeEach
    void setup() {
        stringParser = new StringParser();
    }

    @Test
    void parse() {
        //given
        String input1 = "1:2:3";
        String input2 = "1,2,3";

        //when
        String[] components1 = stringParser.parse(input1);
        String[] components2 = stringParser.parse(input2);

        //then
        assertThat(components1).usingRecursiveComparison().isEqualTo(new String[]{"1", "2", "3"});
        assertThat(components2).usingRecursiveComparison().isEqualTo(new String[]{"1", "2", "3"});
    }

    @Test
    void customParse() {
        //given
        String input = "//A\n1A2A3";
        //when
        String[] inputAndRegex = stringParser.customRegexParse(input);
        //then
        assertThat(inputAndRegex).usingRecursiveComparison().isEqualTo(new String[]{"1", "2", "3"});
    }

    @Test
    void exceptionTest() {
        //given
        String[] parsedInput = {"1", "-2", "3"};
        //when
        //then
        assertThatThrownBy(() -> stringParser.processMinusValue(parsedInput))
            .isInstanceOf(RuntimeException.class);
    }


}
