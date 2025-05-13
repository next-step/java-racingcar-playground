import racingCar.Cars;
import racingCar.ResultView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,) 기준으로 구분).");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);

        System.out.println("시도할 횟수는 몇회인가요?");
        int trial = sc.nextInt();
        System.out.println(trial);
        System.out.println();

        System.out.println("실행 결과");

        Cars cars = new Cars(input);
        for (int i = 0; i < trial; i++) {
            cars.play();
        }

        ResultView.printWinner(cars.whoIsWinner(cars.getAllCarList()));
    }
}
