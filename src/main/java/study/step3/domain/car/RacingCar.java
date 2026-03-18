package study.step3.domain.car;

import study.step3.common.RandomNumber;

public class RacingCar {
    private static final int FORWARD_CONDITION = 4;
    private CarPosition position = new CarPosition();
    private CarName carName;

    public RacingCar(String name) {
        this.carName = new CarName(name);
    }

    public void move() {
        move(RandomNumber.generateLimitTen());
    }

    public void move(int randomNumber) {
        if (isForwardCondition(randomNumber)){
            this.position.move();
        }
    }

    private boolean isForwardCondition(int randomNumber) {
        return randomNumber >= FORWARD_CONDITION;
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public String getCarName() {
        return this.carName.getName();
    }
}
