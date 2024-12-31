public class Motorcycle extends Vehicle implements Rentable {
    // Constructor to initialize the Motorcycle object
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);  // Calls the parent Vehicle constructor
    }

    // Method to calculate rental cost for the Motorcycle
    @Override
    public double calculateRentalCost(int days) {
        // Offers a 10% discount on the base rental rate for motorcycles
        return getBaseRentalRate() * days * 0.9;  // 10% discount on rental rate
    }

    // Method to check if the Motorcycle is available for rental
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();  // Returns the availability status from the Vehicle class
    }

    // Method to rent the motorcycle to a customer
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);  // Mark the motorcycle as not available (rented)
            System.out.println(customer.getName() + " rented Motorcycle: " + getModel() + " (ID: " + getVehicleId() + ") for " + days + " days.");
        } else {
            System.out.println("Motorcycle: " + getModel() + " (ID: " + getVehicleId() + ") is not available for rental.");
        }
    }

    // Method to return the motorcycle after use
    @Override
    public void returnVehicle() {
        setAvailable(true);  // Mark the motorcycle as available again
        System.out.println("Motorcycle: " + getModel() + " (ID: " + getVehicleId() + ") has been returned.");
    }

    // Override toString method to represent the Motorcycle object as a string
    @Override
    public String toString() {
        return "Motorcycle: " + getModel() + " (ID: " + getVehicleId() + ")";
    }
}

