package view.input;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    public static int inputTrial(){
        return scanner.nextInt();
    }

    public static String[] inputNames(){
        String name = getName();

        return splitInName(name);
    }

    private static String getName() {
        String name = scanner.next();
        return name;
    }

    private static String[] splitInName(String name) {
        return name.trim().split(",");
    }
}
