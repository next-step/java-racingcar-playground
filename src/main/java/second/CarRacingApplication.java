package second;

public class CarRacingApplication {
    public static void main(String[] args) {
        Game game = new Game();
        game.addCars("pobi, crong, holux");
        game.setPlayCount(5);

        game.play();

        game.printWinners(game.getWinners());
    }
}
