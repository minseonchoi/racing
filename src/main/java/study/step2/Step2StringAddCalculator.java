package study.step2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Step2StringAddCalculator {

    public static int splitAndSum(String text) {
        // 1. 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.
        if (isBlank(text)) {
            return 0;
        }

        String[] tokens = customSplit(text); // 요구사항 3, 4, 5 (요구사항 2의 값은 그대로 []에 담김)
        return sum(tokens); // 요구사항 2, 6 (덧셈 및 음수 검증)
    }

    // 1. 입력값이 비어있는지 확인하는 메서드
    private static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    // 3. 문자열을 배열로 만들기 (기본 구분자 | 커스텀 구분자)
    private static String[] customSplit(String text) {
        // 요구사항 5 _ Pattern.compile로 인식 + matcher로 찾기
        Matcher m = Pattern.compile("//(.+)\n(.*)").matcher(text);
        if (m.find()) {
            // 그룹 1의 구분자로 split 하기
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        // 요구사항 3, 4 -> String[] 반환
        return text.split(",|:");
    }

    // 4. 문자열 배열을 받아서 모두 더하기
    private static int sum(String[] tokens) {
        int total = 0;
        for (String token : tokens) {
            // toPositiveInt 문자열 숫자로 변경 및 음수 체크
            total += toPositiveInt(token);
        }
        return total;
    }

    // 5. 문자열을 숫자로 바꾸고, 음수인지 검사
    private static int toPositiveInt(String token) {
        int number = Integer.parseInt(token);
        if (number < 0) {
            // 요구사항 6 -> 자바에서는 throw 키워드를 사용하여 강제로 예외를 발생시킬 수 있다.
            throw new RuntimeException("음수는 입력할 수 없습니다.");
        }
        return number;
    }

    public static void main(String[] args) {

    }
}
