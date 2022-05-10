import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passangers;

    public  Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passangers = new ArrayList<>();
    }
    public int passengerCount() {
        return passangers.size();
    }

    public void addPassanger(Person passanger) {
        if (passangers.size() < capacity) {
            passangers.add(passanger);
        }
    }

    public void removePassanger() {
        passangers.remove(0);
    }

    public void pickUpPassanger(BusStop bustop){
       Person passanger = bustop.removeFromQue();
        addPassanger(passanger);
    }
}
