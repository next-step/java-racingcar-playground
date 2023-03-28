package view.output;

import java.util.List;

public class ResultOutput {
    public static void outputTurnResult(String name, int advance){
        System.out.println(name + ":" + ("-".repeat(advance)));
    }

    public static void outputGameResult(List<String> winners){
        String winnersString = "";
        for (int i=0,length= winners.size();i<length;i++) {
            if(i != 0) System.out.print(", ");
            System.out.print(winners.get(i));
        }
        System.out.println("가 최종 우승했습니다");
    }
}
