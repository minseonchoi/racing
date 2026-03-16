package study.step3.common;

import java.util.Random;

public class RandomNumber {
    private static final Random random = new Random();
    private static final int DEFAULT_MAX = 10;

    private RandomNumber() {}

    public static int generateLimitTen() {
        return random.nextInt(DEFAULT_MAX);
    }
}
