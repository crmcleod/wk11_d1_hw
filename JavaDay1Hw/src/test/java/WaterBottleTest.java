import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void Before() { this.waterBottle = new WaterBottle(100);}

    @Test
    public void hasVolume100(){ assertEquals(100, waterBottle.getVolume());}

    @Test public void hasReducedVolumeOnDrinkCall(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());}

    @Test public void canBeEmptied(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());}

    @Test public void canBeFilled(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());}
}
