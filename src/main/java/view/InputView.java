package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static InputView view;
    private Scanner scanner;

    private InputView() {
        scanner = new Scanner(System.in);
    }

    public static InputView getInstance() {
        if (view == null) {
            view = new InputView();
        }
        return view;
    }

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return Arrays.asList(scanner.nextLine().split(","));
    }

    public int readRoundCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

}
