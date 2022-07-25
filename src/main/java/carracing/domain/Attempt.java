package carracing.domain;

public class Attempt {

    public static final String OUT_OF_COUNT = "시도 횟수는 1보다 작을 수 없습니다.";
    public static final int DECREASE_COUNT = 1;
    private final int attempt;

    public Attempt(int attempt) {
        validateAttempt(attempt);
        this.attempt = attempt;
    }
    
    private void validateAttempt(int attempt){
        if(attempt<0){
            throw new IllegalArgumentException(OUT_OF_COUNT);
        }
    }


    public Attempt decrease() {
        return new Attempt(this.attempt- DECREASE_COUNT);
    }


    public int toInt() {
        return attempt;
    }
}
