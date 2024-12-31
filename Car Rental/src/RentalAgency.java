public class RentalAgency {
    private List<Vehicle> fleet;  // List to store all available vehicles

    // Constructor initializes the fleet as an empty list
    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    // Method to add a vehicle to the rental agency's fleet
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    // Method to rent a vehicle to a customer for a specified number of days
    public void rentVehicle(String vehicleId, Customer customer, int days) {
        // Search for the vehicle in the fleet by its unique vehicle ID
        for (Vehicle vehicle : fleet) {
            // If vehicle ID matches and it's available for rent, proceed
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailable()) {
                // Check if the vehicle is of type Rentable (can be rented)
                if (vehicle instanceof Rentable rentable) {
                    rentable.able(customer,int days);  // Rent the vehicle to the customer
                return;  // Exit after renting the vehicle
            }
        }
        // If vehicle is not found or is not available for rent, print message
        System.out.println("Vehicle with ID " + vehicleId + " is not available for rental.");
    }

    // Method to return a rented vehicle back to the agency
    public void returnVehicle(String vehicleId) {
        // Search for the vehicle in the fleet by its ID
        for (Vehicle vehicle : fleet) {
            // If the vehicle ID matches, mark it as available again
            if (vehicle.getVehicleId().equals(vehicleId)) {
                if (vehicle instanceof Rentable rentable) {
                    rentable.returnVehicle();  // Return the vehicle
                }
                return;  // Exit after returning the vehicle
            }
        }
        // If the vehicle is not found, print a message
        System.out.println("Vehicle with ID " + vehicleId + " was not found.");
    }

    // Method to display all vehicles in the fleet
    public void displayFleet() {
        System.out.println("Vehicle Fleet:");
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle.toString());
        }
    }
}
