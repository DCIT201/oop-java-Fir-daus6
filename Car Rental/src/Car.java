public class Car extends Vehicle {

    //Constructor to initialize the Car object
    public Car(String vehicleId,String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }


    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    //Method to print car details.
    public String toString() {
        return "Car[vehicleID=" + getVehicleId() + ", Model=" + getModel() + ", BaseRentalRate=" + getBaseRentalRate() + "]";
    }






}
