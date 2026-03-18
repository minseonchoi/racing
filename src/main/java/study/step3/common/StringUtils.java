package study.step3.common;

import java.util.List;

public class StringUtils {
    private StringUtils() {}

    public static List<String> splitByComma(String str) {
        return List.of(str.split(",".trim()));
    }
}
