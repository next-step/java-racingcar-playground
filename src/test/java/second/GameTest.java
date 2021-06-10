package second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    public void 자동차_여러개_생성() {
        game.addCars("pobi,crong,holux");
        assertThat(game.getCars().size()).isEqualTo(3);
    }
}