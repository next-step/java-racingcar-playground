package RacingGameTest;

import RacingGame.domain.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameTest {
    Name nameOne;
    Name nameTwo;
    @BeforeEach
    void generateInstance() {
        nameOne = new Name("truck");
        nameTwo = new Name("sportsCar");
    }

    @Test
    void isCarNameOverFiveTest() {
        assertThat(nameOne.isCarNameLengthOverFive("truck")).isFalse();
        assertThat(nameTwo.isCarNameLengthOverFive("superCar")).isTrue();
    }
}
