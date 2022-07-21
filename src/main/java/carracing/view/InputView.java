package carracing.view;

import java.util.Scanner;

public class InputView {

    public static final String NAME_REGEX = ",";
    Scanner scanner = new Scanner(System.in);

    public String[] getCarNames() {
    return scanner.nextLine().split(NAME_REGEX);
    }

    public int getAttemptCount(){
        return scanner.nextInt();
    }

}
