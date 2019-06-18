import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Paul Lambert");
    }

    @Test
    public void hasAName(){
        assertEquals("Paul Lambert", dodgems.getName());
    }
}
