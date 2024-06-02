public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double milesDriven;
    protected double fuelConsumed;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract double calculateFuelEfficiency();
}
