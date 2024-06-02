public class Car extends Vehicle{

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven/fuelConsumed;
    }
}
