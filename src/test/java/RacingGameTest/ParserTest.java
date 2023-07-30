package RacingGameTest;

import RacingGame.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {
    Parser parser;
    @BeforeEach
    void generateInstance() {
        parser = new Parser();
    }

    @Test
    void splitInputNamesTest() {
        String inputNames = "truck,cart,ban";
        String[] carNames = {"truck","cart","ban"};
        assertThat(parser.splitInputNames(inputNames)).isEqualTo(carNames);
    }
}
