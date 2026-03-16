package study.step3.constant;

public enum ConsoleMessage {
    INPUT_PLAYER_NAME("Enter the player's nickname to start the game."),
    INPUT_CAR_COUNT("Enter the number of cars."),
    INPUT_RACE_COUNT("Enter the number of race attempts."),
    EXECUTION_RESULT("Race Result"),
    CAR_POSITION_MARK("-"),
    START_ROUND("Start Round: "),
    GAME_END("'s Game Over!");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
