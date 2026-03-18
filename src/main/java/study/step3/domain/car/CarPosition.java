package study.step3.domain.car;

public class CarPosition {
    private int position;

    public CarPosition() {
        this.position = 0;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}
