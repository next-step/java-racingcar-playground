package racingCar;

import racingCar.controller.CarList;
import racingCar.controller.CarReport;
import racingCar.domain.CarName;
import racingCar.domain.GameStatus;
import racingCar.domain.Position;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요. 구분기준은 콤마(,)입니다.");
        String names = input.next();
        System.out.println("시도할 횟수는 몇회인가요?");
        int tryCount = input.nextInt();
        GameStatus status = GameStatus.START;
        CarList carList = new CarList(names);
        CarReport report = new CarReport();

        while (status.isStart()){
            report.positionPrint(carList.move());
            if (status.isEnd(--tryCount)){
                status = GameStatus.END;
            }
        }

        Map<CarName, Boolean> victoryFlag = report.getVictoryFlag();
        for (CarName name : victoryFlag.keySet()){
            if (victoryFlag.get(name)){
                System.out.print(name + " ");
            }
        }
        System.out.println("가 최종우승했습니다.");
    }
}
