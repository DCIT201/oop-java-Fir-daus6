public class Car extends Vehicle implements Rentable {

    // Constructor to initialize the Car object
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);  // Calls the parent (Vehicle) constructor
    }

    // Overridden method to calculate rental cost for a car
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;  // Simple daily rate calculation
    }

    // Overridden method to check availability for rental
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();  // Checks if the car is available
    }

    // Implementing the rent method from the Rentable interface
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);  // Mark the vehicle as rented
            System.out.println(customer.getName() + " rented " + this + " for " + days + " days.");
        } else {
            System.out.println(this + " is not available for rental.");
        }
    }

    // Implementing the returnVehicle method from the Rentable interface
    @Override
    public void returnVehicle() {
        setAvailable(true);  // Mark the vehicle as available again
        System.out.println(this + " has been returned.");
    }

    // toString method to provide a string representation of the car
    @Override
    public String toString() {
        return "Car [ID=" + getVehicleId() + ", Model=" + getModel() + "]";
    }
}
