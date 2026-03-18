package study.step3.domain.car;

import study.step3.constant.ErrorMessage;

public class CarName {
    private String name;

    public CarName(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_CAR_NAME.getMessage());
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_TOO_LONG.getMessage());
        }
    }

    public String getName() {
        return this.name;
    }
}
