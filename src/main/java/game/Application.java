package game;

import game.ui.RacingConsole;
import game.ui.RacingInputImpl;
import game.ui.RacingOutputImpl;

public class Application {
    public static void main(String[] args) {
        RacingConsole racingConsole = new RacingConsole(new RacingInputImpl(), new RacingOutputImpl());
        racingConsole.start();
    }
}
