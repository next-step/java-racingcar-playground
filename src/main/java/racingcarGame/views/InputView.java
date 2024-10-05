package racingcarGame.views;

import java.util.Scanner;

public class InputView {
    static String nameInput = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
    static String timesInput = "시도할 회수는 몇회인가요?";

    public static String name(Scanner scanner) {
        System.out.println(nameInput);
        return scanner.nextLine();
    }

    public static int number(Scanner scanner) {
        System.out.println(timesInput);
        return scanner.nextInt();
    }
}
