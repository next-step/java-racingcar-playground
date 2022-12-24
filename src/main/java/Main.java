import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Racing racing = new Racing();
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = "pobi,crong,honux";
                //scanner.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int game = 5;
                //scanner.nextInt();
        List<Car> cars = racing.start(input,game);

        boolean play = true;
        while(play){
            play = racing.play();
        }

        Result.printResult(cars);


    }
}
