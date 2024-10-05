package racingcarGame;

public class UserInput {
    private final String inputName;
    private final int times;

    UserInput(String inputName,int times) {
        this.inputName = inputName;
        this.times = times;
    }

    public String getInput() {
        return inputName;
    }
    public int getTimes() {
        return times;
    }
}
