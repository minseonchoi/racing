package study.step3.constant;

public enum ErrorMessage {
    EMPTY_INPUT("Input cannot be empty. Please enter again."),
    NEGATIVE_NUMBER("Negative numbers are not allowed. Please enter a number greater than 0."),
    INVALID_NUMBER_FORMAT("Please enter numbers only.");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
