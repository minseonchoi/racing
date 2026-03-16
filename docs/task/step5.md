# 🚀 5단계 - 자동차 경주(추가 연습)

## 마지막 의식적인 연습

- 새로운 미션을 도전하는 것도 의미있으나 지금까지 진행한 자동차 경주 미션을 새로 구현하거나 한번 더 리팩터링해보는 것이 성장에 더 도움이 될 것으로 생각한다.
- 현재 자신의 상태에 따라 연습 방법을 정하고 도전해 볼 것을 추천한다.

## 연습 1 - 객체 설계 & TDD

- 지금까지 구현한 자동차 경주 게임의 모든 코드를 삭제한다.
- 기능 목록 작성 -> 간단한 객체 설계 후에 TDD로 구현한다. TDD는 아무 것도 의존하지 않는 가장 작은 단위의 객체부터 시작한다.

## 연습 2 - MVC 기반 리팩터링 연습

- 핵심 비지니스 로직을 가지는 객체를 domain 패키지, UI 관련한 객체를 view 패키지에 구현한다.
- MVC 패턴 기반으로 리팩토링해 view 패키지의 객체가 domain 패키지 객체에 의존할 수 있지만, domain 패키지의 객체는 view 패키지 객체에 의존하지 않도록 구현한다.

### MVC 패턴 구조로 구현해본 샘플 코드

```java
public class RacingGameApplication {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames, tryNo);
        RacingResult result = null;
        while(racingGame.isEnd()) {
            result = racingGame.race();
            ResultView.printResult(result);
        }
        ResultView.printWinners(result); // RacingResult에서 우승자를 구해 출력
    }
}
```

위 코드에서 힌트를 얻어 본인의 코드에 개선할 부분이 있는지 검토해 보고 리팩토링할 부분이 있다면 리팩토링에 도전해 본다.
단, 이미 위와 같은 구조로 구현했다면 특별히 개선할 부분은 없으면 바로 리뷰 요청해도 된다.