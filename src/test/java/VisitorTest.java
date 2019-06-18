import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(500, 250, 4);
    }

    @Test
    public void aVisitorHasAnAge(){
        assertEquals(500, visitor.getVisitorAge());
    }

    @Test
    public void aVisitorHasAHeight(){
        assertEquals(250, visitor.getVisitorHeight());
    }

    @Test
    public void aVisitorHasMoney(){
        assertEquals(4, visitor.getVisitorMoney());
    }



}
