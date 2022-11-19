package study.racingcar;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class CarNamingOverException extends RuntimeException {

    private static final String MESSAGE = "자동차 이름은 %d를 넘길 수 없습니다.";

    public CarNamingOverException(int limit) {
        super(String.format(MESSAGE, limit));
    }
}
