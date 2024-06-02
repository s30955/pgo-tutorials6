public class Truck extends Vehicle{
    private double cargoWeight;

    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven/(fuelConsumed+ (cargoWeight*0.5));
    }
}
