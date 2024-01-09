package HW_1_1;
import java.util.LinkedList;
import java.util.Queue;

public  class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
        System.out.println(person + " has entered the queue.");
    }

    @Override
    public String dequeue() {
        String person = queue.poll();
        if (person != null) {
            System.out.println(person + " has left the queue.");
        }
        return person;
    }

    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    @Override
    public void removePerson(String person) {
        if (queue.contains(person)) {
            queue.remove(person);
            System.out.println(person + " has been removed from the queue.");
        } else {
            System.out.println(person + " is not in the queue.");
        }
    }

    public void update() {
    }

    
}
