import car.Car;
import car.RacingGame;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNameString = scanner.nextLine();
        String[] carNames = carNameString.split(",");
        System.out.println("시도할 횟수는 몇회인가요?");
        int gameCount = scanner.nextInt();
        RacingGame game = new RacingGame(gameCount);

        for(String carName : carNames){
            game.join(new Car(carName));
        }
        game.play();

        List<Car> winners = game.findWinners();
        String winnerString = "";
        for(Car winner : winners){
            winnerString += winner.getName() + ", ";
        }
        System.out.println( winnerString.substring(0, winnerString.length()-2) + "가 최종 우승했습니다.");
    }
}
