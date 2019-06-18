import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Paul Lambert");
    }

    @Test
    public void hasAName(){
        assertEquals("Paul Lambert", rollercoaster.getName());
    }
}