package study.step0;

import java.util.Scanner;

public class Step0Main {

    // static final = 클래스 상수
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 20;
    private static final String INPUT_NUM_MSG = "1. [1~20] 사이의 숫자를 입력하세요: ";

    private static final int MIN_SCORE = 0;
    private static final int MAX_SCORE = 100;
    private static final String INPUT_SCORE_MSG = "2. 0~100점 중 점수를 입력하세요 (등급 출력): ";


    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 1. 1부터 20까지 입력 받아서 모두 더한(+) 후 콘솔에 결과 출력해보기
        int num = getValidatedInput(scanner, MIN_NUM, MAX_NUM, INPUT_NUM_MSG);
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.println("더하는 중.. -> " + sum);
        }
        System.out.println("결과: 1부터 " + num + "까지의 합은 " + sum + "입니다.");
        System.out.println();


        // 2. 0~100점 중 입력 받은 학점 출력하기
        int score = getValidatedInput(scanner, MIN_SCORE, MAX_SCORE, INPUT_SCORE_MSG);
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        System.out.println();


        // 3. 가장 큰 수를 구해 콘솔에 결과 출력
        System.out.println("3. 배열에서 가장 큰 수 찾기");
        String[] arr1 = {"3", "7", "2", "9", "4"};

        int max = Integer.parseInt(arr1[0]);

        for (int i = 1; i < arr1.length; i++) {
            max = Math.max(Integer.parseInt(arr1[i]), max);
        }
        System.out.println("MAX INT : " + max + "\n");


        // 4. 1부터 10중 짝수만 콘솔에 한줄로 출력
        String[] arr2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.print("짝수만 출력: ");
        for (int i = 0; i < arr2.length; i++) {
            int currentNum = Integer.parseInt(arr2[i]);
            if (currentNum % 2 == 0) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    public static int getValidatedInput(Scanner scanner, int min, int max, String message) {
        int value;
        while (true) {
            System.out.println(message);

            // 숫자인지 확인
            if (!scanner.hasNextInt()) {
                System.out.println("숫자만 입력해주세요.\n");
                scanner.next();
                continue;
            }
            // 숫자이면, 범위 확인
            value = scanner.nextInt();
            if (value < min || value > max) {
                System.out.println(min + "-" + max + " 사이의 숫자만 입력해주세요.\n");
                continue;
            }

            return value; // 정상 값이면 바로 반환
        }
    }
}
