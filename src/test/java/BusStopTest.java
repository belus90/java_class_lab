import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Person passanger;
    private BusStop bustop;

    @Before
    public void before(){
        passanger = new Person();
        bustop = new BusStop("The Best");
    }

    @Test
    public void startsEmpty(){
        assertEquals(0,bustop.queCount());
    }

    @Test
    public void addToTheQue(){
        bustop.addToQue(passanger);
        assertEquals(1, bustop.queCount());
    }

    @Test
    public void removeFromTheQue(){
        bustop.addToQue(passanger);
        bustop.removeFromQue();
        assertEquals(0, bustop.queCount());
    }
}
