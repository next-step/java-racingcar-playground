package racinggame;

import racinggame.ui.RacingConsole;
import racinggame.ui.RacingInputImpl;
import racinggame.ui.RacingOutputImpl;

public class Application {
    public static void main(String[] args) {
        RacingConsole racingConsole = new RacingConsole(new RacingInputImpl(), new RacingOutputImpl());
        racingConsole.start();
    }
}
