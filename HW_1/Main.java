//Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour, имитируют работу 
//очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдает 
//заказы).

package HW_1;

import java.util.LinkedList;
import java.util.Queue;
public class Main {
    
}

interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
}

interface MarketBehaviour {
    void addPerson(String person);
    void removePerson(String person);
}

 public class Market implements QueueBehaviour, MarketBehaviour {
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
        
        System.out.println("Market has been updated.");
    }

    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("John");
        market.addPerson("Alice");
        market.addPerson("Bob");

        market.removePerson("Alice");

        market.update();
    }
}