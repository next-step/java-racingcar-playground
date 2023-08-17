package game;

import org.junit.jupiter.api.Test;

public class RacingGameTests {
    @Test
    void 게임_잘_돌아가나_구경하기() {
        RacingGame racingGame = new RacingGame("a,b,c", 5);
        System.out.println(racingGame.playGame().toString());
    }
}
