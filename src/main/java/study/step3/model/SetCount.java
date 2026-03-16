package study.step3.model;

public class SetCount {
    private final int carCount;
    private final int raceCount;

    public SetCount(int carCount, int raceCount) {
        this.carCount = carCount;
        this.raceCount = raceCount;
    }
    public int getCarCount() {
        return this.carCount;
    }
    public int getRaceCount() {
        return this.raceCount;
    }
}
