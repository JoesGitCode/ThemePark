import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Paul Lambert");
    }

    @Test
    public void hasAName(){
        assertEquals("Paul Lambert", park.getName());
    }
}