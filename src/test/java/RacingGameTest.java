import car.Car;
import car.RacingGame;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RacingGameTest {

    @Test
    void crateRacingGameFail(){
        assertThatThrownBy(() -> new RacingGame(0))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void joinRacingCar(){
        RacingGame game = new RacingGame(3);
        game.join(new Car("oh"));
        assertThat(game.containCar(new Car("oh").getName())).isTrue();

        assertThat(game.containCar(new Car("ha").getName())).isFalse();
    }

    @Test
    void findWinners(){
        RacingGame game = new RacingGame(3);
        Car oh = new Car("oh");
        oh.go(4);
        Car ha = new Car("ha");
        ha.go(4);
        Car zu = new Car("zu");
        zu.go(2);
        game.join(oh);
        game.join(ha);
        game.join(zu);
        assertThat(game.findWinners()).isEqualTo(Arrays.asList(oh,ha));
    }

    @Test
    void play(){
        RacingGame game = new RacingGame(5);
        Car oh = new Car("oh");
        Car ha = new Car("ha");
        Car zu = new Car("zu");
        game.join(oh);
        game.join(ha);
        game.join(zu);
        game.play();
        assertThat(game.findWinners()).isEqualTo(Arrays.asList(oh));
    }

}
