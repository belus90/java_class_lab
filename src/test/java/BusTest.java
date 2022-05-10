import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passanger;
    private BusStop bustop;


    @Before
    public void before(){
        bus = new Bus("West End", 2);
        passanger = new Person();
        bustop = new BusStop("The Best");
        bustop.addToQue(passanger);
    }

    @Test
    public void passengerStartEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassanger(){
        bus.addPassanger(passanger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void isTheBusFull(){
        bus.addPassanger(passanger);
        bus.addPassanger(passanger);
        bus.addPassanger(passanger);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void removePassangerFromBus(){
        bus.addPassanger(passanger);
        bus.addPassanger(passanger);
        bus.removePassanger();
        assertEquals(1,bus.passengerCount());

    }
    @Test
    public void busCanPickUpFromStop(){
        bus.pickUpPassanger(bustop);
        assertEquals(0,bustop.queCount());
        assertEquals(1, bus.passengerCount());

    }

}
