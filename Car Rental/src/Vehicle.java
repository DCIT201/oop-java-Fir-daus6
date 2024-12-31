public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

//Constructor to initialize vehicle object
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

//Getters to access private fields.
    public String getVehicleId() {
        return vehicleId;
    }
    public String getModel() {
        return model;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    //Setter to update availability.
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    //Abstract methods to calculate for rental cost.
    public abstract double calculateRentalCost(int days);

    //Abstract methods to check if there is any vehcile available.
    public abstract boolean isAvailableForRental();

    //Method to print basic vehicle details.
    public String printVehicleDetails() {
        return ("Vehicle ID: " + vehicleId + ", model: " + model + ", baseRentalRate: " + baseRentalRate);
    }
}
