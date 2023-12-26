//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод 
//getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе

package HW_1;

public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink();
        tea.setName("Чай");
        tea.setVolume(200);
        tea.setTemperature(80);

        HotDrink coffee = new HotDrink();
        coffee.setName("Кофе");
        coffee.setVolume(150);
        coffee.setTemperature(90);

        VendingMachine automat = new HotDrinkAutomat();
        automat.getProduct(1, 200, 80);
    
    }
}