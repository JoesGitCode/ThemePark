import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("StallTeam", "Chansey", true);
    }

    @Test
    public void getTobaccoStallName(){
        assertEquals("StallTeam", tobaccoStall.getName());
    }

    @Test
    public void getTobaccoStallOwnerName(){
        assertEquals("Chansey", tobaccoStall.getOwnerName());
    }

    @Test
    public void getTobaccoStallParkingSpot(){
        assertEquals(true, tobaccoStall.getParkingSpot());
    }
}
