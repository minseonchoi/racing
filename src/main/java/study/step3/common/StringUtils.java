package study.step3.common;

import java.util.ArrayList;

public class StringUtils {
    private StringUtils() {}

    public static ArrayList<String> splitByComma(String str) {
        return new ArrayList<>(java.util.Arrays.asList(str.split(",".trim())));
    }
}
