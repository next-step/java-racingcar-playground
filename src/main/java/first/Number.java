package first;

public class Number {

    private int number;

    public Number(String input) {
        chkValidNumber(input);
        chkPositive();
    }

    public int getNumber() {
        return this.number;
    }

    private void chkValidNumber(String input) {
        try {
            this.number = Integer.parseInt(input);
        } catch (Exception e) {
            throw new RuntimeException("숫자를 입력하세요");
        }
    }

    private void chkPositive() {
        if (this.number < 0) {
            throw new RuntimeException("음수를 입력할 수 없습니다");
        }
    }
}
