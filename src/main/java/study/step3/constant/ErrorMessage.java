package study.step3.constant;

public enum ErrorMessage {
    ERROR("[ERROR] "),
    EMPTY_INPUT("Input cannot be empty. Please enter again."),
    NEGATIVE_NUMBER("Negative numbers are not allowed. Please enter a number greater than 0."),
    INVALID_NUMBER_FORMAT("Please enter numbers only."),
    EMPTY_CAR_NAME("Car name must not be empty."),
    CAR_NAME_TOO_LONG("Car name must not exceed 5 characters.");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
