package StringCalculatorTest;

public class StringAddCalculator {
    public static int splitAndSum(String inputNumbers) throws RuntimeException {
        if(isNullorEmpty(inputNumbers)) {
            return 0;
        }
        if(inputNumbers.length() == 1) {
            return parseInputNumber(inputNumbers);
        }
        String[] numberArray = inputNumbers.split(",|:");
        return sum(numberArray);
    }
    private static int parseInputNumber(String inputNumbers) throws RuntimeException {
        return Integer.parseInt(inputNumbers);
    }
    private static boolean isNullorEmpty (String inputNumbers) {return inputNumbers == null || inputNumbers.equals("");}

    private static int sum (String[] numberArray) {
        int sum=0;
        for (String number : numberArray) {
            sum += parseInputNumber(number);
        }
        return sum;
    }
}
