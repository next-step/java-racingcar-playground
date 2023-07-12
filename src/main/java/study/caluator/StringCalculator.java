package study.caluator;

public class StringCalculator {

    private final StringParser stringParser;

    public StringCalculator(StringParser stringParser) {
        this.stringParser = stringParser;
    }

    public int calculate(String input) {
        if (input.startsWith("//")) {
            String regex = stringParser.customRegexParse(input)[0];
        }

        String[] strings = stringParser.parse(input);

        return 1;

    }
}
