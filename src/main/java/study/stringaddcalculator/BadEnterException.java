package study.stringaddcalculator;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/16
 */
public class BadEnterException extends RuntimeException {

    private static final String MESSAGE = "잘못된 입력입니다";

    public BadEnterException() {
        super(MESSAGE);
    }
}
