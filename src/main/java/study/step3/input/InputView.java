package study.step3.input;

import study.step3.constant.ConsoleMessage;
import study.step3.constant.ErrorMessage;
import study.step3.domain.car.CarName;

import java.util.Scanner;

import static study.step3.common.StringUtils.splitByComma;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String ERROR_MSG = ErrorMessage.ERROR.getMessage();

    private InputView() {}

    public static String getPlayerName() {
        return getStringInput(ConsoleMessage.INPUT_PLAYER_NAME.getMessage());
    }

    public static String getCarName() {
        return getStringInput(ConsoleMessage.INPUT_CAR_NAME.getMessage());
        return getCarNamesWithValidation();
    }

    public static int getRaceCount() {
        return getPositiveIntInput(ConsoleMessage.INPUT_RACE_COUNT.getMessage());
    }

    public static void scannerClose() {
        scanner.close();
    }

    private static String getStringInput(String message) {
        String value;
        while (true) {
            System.out.println(message);

            // 빈문자열 검사
            value = scanner.nextLine().trim();
            if (value.isBlank()) {
                System.out.println(ERROR_MSG + ErrorMessage.EMPTY_INPUT.getMessage());
                continue;
            }

            return value; // 정상 값만 반환
        }
    }

    private static int getPositiveIntInput(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();

            if (input.isBlank()) {
                System.out.println(ERROR_MSG + ErrorMessage.EMPTY_INPUT.getMessage());
                continue;
            }

            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println(ERROR_MSG + ErrorMessage.NEGATIVE_NUMBER.getMessage());
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG + ErrorMessage.INVALID_NUMBER_FORMAT.getMessage());
            }
        }
    }

    private static List<String> getCarNamesWithValidation() {
        while (true) {
            String input = getStringInput(ConsoleMessage.INPUT_CAR_NAME.getMessage());
            List<String> names = splitByComma(input);

            try {
                // 도메인 규칙: 5자 제한
                for (String name : names) {
                    new CarName(name);
                }
                return names;
            } catch (IllegalArgumentException e) {
                System.out.println(ERROR_MSG + e.getMessage());
            }
        }
    }
}
