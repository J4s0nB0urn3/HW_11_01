public class WaterBottle {
    private int volume = 100;

    public WaterBottle(int volume) {
    this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void drinkWater() {
        this.volume -= 10;
    }

    public void emptyBottle() {
        this.volume = 0;
    }

    public void fullBottle() {
        this.volume = 100;
    }
}
