// Concrete class Truck
public class Truck extends Vehicle implements Rentable {
    private double cargoCapacity; // in tons

    public Truck(String vehicleId, String model, double baseRentalRate, double cargoCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (cargoCapacity > 5 ? 50 : 0); // Extra charge for larger trucks
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        if (cargoCapacity > 0) {
            this.cargoCapacity = cargoCapacity;
        }
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);  // Mark as rented
            customer.addRentalHistory(this, days);
        }
    }

