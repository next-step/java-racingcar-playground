package RacingGameTest;

import RacingGame.util.RandomNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomNumberTest {
    RandomNumber randomNumber;

    @BeforeEach
    void generateInstance() {
        randomNumber = new RandomNumber();
    }

    @Test
    void generateRandomNumber() {
        for (int i=0; i<1000; i++) {
            int generatedNumber = randomNumber.genateRandomNumber();
            assertTrue(generatedNumber>=1 && generatedNumber<=9);
        }
    }


}
