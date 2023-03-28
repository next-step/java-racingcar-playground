package view.input;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static String[] inputNames(){
        String name = getName();

        return splitInName(name);
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }

    private static String[] splitInName(String name) {
        return name.trim().split(",");
    }
}
