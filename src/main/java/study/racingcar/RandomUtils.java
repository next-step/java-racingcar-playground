package study.racingcar;

import java.util.Random;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class RandomUtils {

    private RandomUtils(){}

    private static final Random random = new Random();

    public static int getInt(int limit) {
        return random.nextInt(limit);
    }
}
