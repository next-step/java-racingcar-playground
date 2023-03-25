package racing;

import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int loopCount = scanner.nextInt();

        System.out.println();

        RacingGameOrganizer gameOrganizer = new RacingGameOrganizer();
        List<RacingCar> cars = gameOrganizer.createCars(carNames);
        gameOrganizer.play(cars, loopCount);
        gameOrganizer.result(cars);
    }
}
