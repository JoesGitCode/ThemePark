import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("StallTeam", "Chansey", true);
    }

    @Test
    public void getIceCreamStallName(){
        assertEquals("StallTeam", iceCreamStall.getName());
    }

    @Test
    public void getIceCreamStallOwnerName(){
        assertEquals("Chansey", iceCreamStall.getOwnerName());
    }

    @Test
    public void getIceCreamStallParkingSpot(){
        assertEquals(true, iceCreamStall.getParkingSpot());
    }
}
