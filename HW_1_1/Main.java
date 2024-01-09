package HW_1_1;

public class Main {

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
    

