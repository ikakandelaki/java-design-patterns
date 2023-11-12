package behavioral.templatemethod;

public class App {
    public static void main(String[] args) {
        HouseTemplate house = new WoodenHouse();

        //using template method
        house.buildHouse();
        System.out.println("************");

        house = new GlassHouse();

        house.buildHouse();
    }
}
