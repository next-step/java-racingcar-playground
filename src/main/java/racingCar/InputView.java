package racingCar;

import java.util.Scanner;

public class InputView {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("차량들의 이름을 정해주세요.");
        String names = input.next();

        System.out.print("시도할 회수는 몇회인가요?");
        int loop = input.nextInt();
        CarList carList = new CarList(names);

        while (loop-- > 0){
            carList.play();
            CarReport report = new CarReport();
            report.print(carList.getCars());
        }
        carList.whoIsVictory();
    }

}
