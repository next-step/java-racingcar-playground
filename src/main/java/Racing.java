import java.util.*;


public class Racing {
    List<Car> cars;
    int game;

    public Racing() {
        this.cars = new ArrayList<>();
        this.game = 0;
    }

    public Racing(List<Car> cars, int game) {
        this.cars = cars;
        this.game = game;
    }

    public List<Car> start(String input, int game){
        GameStart gameStart = new GameStart();
        String[] split = gameStart.input(input);
        for(String s : split){
            this.cars.add(new Car(s));
        }

        this.game = game;
        return this.cars;
    }

    public static int randomGenerate() {
        Random random = new Random();
        int ran = random.nextInt(9);
        return ran;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getGame() {
        return game;
    }

    private boolean consumeGame(){
        if(getGame() == 0) {
            return false;
        }
        cars.stream().forEach(car-> car.progress(Racing.randomGenerate()));
        Result.printProgreeBar(this.cars);
        this.game-=1;
        return true;
    }

    public boolean play() {
        return consumeGame();
    }
}
