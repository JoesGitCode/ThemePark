import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Paul Lambert");
    }

    @Test
    public void hasAName(){
        assertEquals("Paul Lambert", playground.getName());
    }
}