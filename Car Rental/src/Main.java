// RentalAgency Class to manage the rental process
public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();

    public static Vehicle createVehicle(String type, String vehicleId, String model, double baseRate) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(vehicleId, model, baseRate, 4);
            case "motorcycle":
                return new Motorcycle(vehicleId, model, baseRate, false);
            case "truck":
                return new Truck(vehicleId, model, baseRate, 10);
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle getVehicleById(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;  }
}
