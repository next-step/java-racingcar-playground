package second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    private Game game;

    @BeforeEach
    void setup() {
        game = new Game();
    }

    @Test
    void 이름_다섯자_유효_테스트() {
        assertThat("holux".length() > 5).isFalse();
    }

    @Test
    void 자동차_여러개_생성() {
        game.addCars("pobi,crong,holux");
        assertThat(game.getCars().size()).isEqualTo(3);
    }

    @Test
    void 플레이_테스트() {
        game.addCars("pobi,crong,holux");
        game.setPlayCount(5);
        game.play();
    }
}