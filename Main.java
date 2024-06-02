public class Main {
    public static void main(String[] args) {

        Car c = new Car("Mercedes", "GLS", 2024);
        Truck t = new Truck("Volvo", "FH16", 2022);

        c.calculateFuelEfficiency();
        t.calculateFuelEfficiency();

    }
}