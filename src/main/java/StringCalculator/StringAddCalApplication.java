package StringCalculator;

import java.util.Scanner;

public class StringAddCalApplication {
    public static void main(String [] args) {
        System.out.println("숫자를 입력해주세요");
        try {
            String input = new Scanner(System.in).nextLine();
            int answer = StringAddCalculator.splitAndSum(input);
            System.out.println(answer);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
