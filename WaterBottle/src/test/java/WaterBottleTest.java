import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;

    @Before
    public void before() {
        myBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume() {
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void drinkWater() {
        myBottle.drinkWater();
        myBottle.drinkWater();
        assertEquals(80, myBottle.getVolume());
    }

    @Test
    public void emptyBottle() {
        myBottle.emptyBottle();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void fullBottle() {
        myBottle.fullBottle();
        assertEquals(100, myBottle.getVolume());
    }

}
