public class RentalTransaction   {
    private String transactionID;
    private Vehicle vehicle;
    private int rentalDay;
    private int rentalCost;


    //Constructor to initialize the rental transaction.
    public RentalTransaction(String transactionID, Vehicle vehicle, int rentalDay, int rentalCost) {
        this.transactionID = transactionID;
        this.vehicle = vehicle;
        this.rentalDay = rentalDay;
        this.rentalCost = (int) vehicle.calculateRentalCost(rentalDay);
    }

    //Getter method.
    public String getTransactionID() {
        return transactionID;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getRentalDay() {
        return rentalDay;
    }
    public int getRentalCost() {
        return rentalCost;
    }

   //Method to display the rentaltransactiondeatails.
   public String RentalTransactiondetails() {
        return "RentalTransaction [ID=" + transactionID + ", Vehicle=" + vehicle.getModel() + ", Day=" + rentalDay + ", Cost=" + rentalCost + "]";
   }

}
