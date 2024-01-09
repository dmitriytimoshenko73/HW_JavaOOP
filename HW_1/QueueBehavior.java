package HW_1;

public interface QueueBehavior {
    void takeInQueue(Buyer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}