package study.step3.input;

import study.step3.constant.ConsoleMessage;
import study.step3.constant.ErrorMessage;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static String getPlayerName() {
        return getStringInput(ConsoleMessage.INPUT_PLAYER_NAME.getMessage());
    }

    public static int getCarCount() {
        return getPositiveIntInput(ConsoleMessage.INPUT_CAR_COUNT.getMessage());
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
                System.out.println(ErrorMessage.EMPTY_INPUT.getMessage());
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
                System.out.println(ErrorMessage.EMPTY_INPUT.getMessage());
                continue;
            }

            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println(ErrorMessage.NEGATIVE_NUMBER.getMessage());
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println(ErrorMessage.INVALID_NUMBER_FORMAT.getMessage());
            }
        }
    }
}
