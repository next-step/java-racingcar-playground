package game;

public class Application {
    public static void main(String[] args) {
        RacingConsole racingConsole = new RacingConsole(new RacingInputImpl(), new RacingOutputImpl());
        racingConsole.start();
    }
}
