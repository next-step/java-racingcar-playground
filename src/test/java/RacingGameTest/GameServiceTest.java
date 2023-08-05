package RacingGameTest;

import RacingGame.Cars;
import RacingGame.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GameServiceTest {
    GameService gameService;
    @BeforeEach
    void generateInstance() {
        gameService = new GameService();
    }

    @Test
    void joinCarTest() {

        String[] carNames={"truck","suv","volvo"};
        Cars result = gameService.joinCar(carNames);
        Cars cars = Cars.getInstance();

        assertSame(cars,result);
        assertEquals(3,result.getJoinedCar().size());
        assertEquals("truck", result.getJoinedCar().get(0).getCarName());
        assertEquals(0, result.getJoinedCar().get(0).getCarPosition());
        assertEquals("suv", result.getJoinedCar().get(1).getCarName());;
        assertEquals("volvo", result.getJoinedCar().get(2).getCarName());

    }
    @Test
    void playRoundTest(int rounds) {

    }
}
