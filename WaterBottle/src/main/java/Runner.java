public class Runner {
    public static void main(String[] args) {
        WaterBottle myBottle = new WaterBottle(100);
        System.out.println(String.format("At the beginning the bottle's volume is %d.", myBottle.getVolume()));
        myBottle.drinkWater();
        System.out.println(String.format("After one sip the bottle's volume is %d.", myBottle.getVolume()));
        myBottle.fullBottle();
        myBottle.drinkWater();
        myBottle.drinkWater();
        myBottle.drinkWater();
        System.out.println(String.format("After three sips the bottle's volume is %d.", myBottle.getVolume()));
        myBottle.emptyBottle();
        System.out.println(String.format("When the bottle is empty the bottle's volume is %d.", myBottle.getVolume()));
        myBottle.fullBottle();
        System.out.println(String.format("After refilling the bottle's volume is %d again.", myBottle.getVolume()));
    }
}
