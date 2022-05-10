import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int queCount() {
        return queue.size();
    }

    public void addToQue(Person passanger) {
        queue.add(passanger);
    }

    public Person removeFromQue() {
         return queue.remove(0);
    }
}
