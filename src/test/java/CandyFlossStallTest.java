import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("StallTeam", "Chansey", true);
    }

    @Test
    public void getCandyFlossStallName(){
        assertEquals("StallTeam", candyFlossStall.getName());
    }

    @Test
    public void getCandyFlossStallOwnerName(){
        assertEquals("Chansey", candyFlossStall.getOwnerName());
    }

    @Test
    public void getCandyFlossStallParkingSpot(){
        assertEquals(true, candyFlossStall.getParkingSpot());
    }
}
