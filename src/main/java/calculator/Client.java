package calculator;

public class Client {
    public static void main(String[] args) {
        String line = "//;\n1;2;3;4;5";
        Calculator calculator = new Calculator(line);
        String[] values = calculator.remove();
        int result = calculator.sum(values);
        System.out.println("결과 : " + result);
    }
}
