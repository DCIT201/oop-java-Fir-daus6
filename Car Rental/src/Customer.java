public class Customer {
    private String name;
    private String address;
    private String phone;
    private String customerId;

//Constructor to initialize a new customer details.
    public Customer(String name, String address, String phone, String customerId) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.customerId = customerId;
    }

//Getter method customer details.
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getCustomerId() {
        return customerId;
    }

    //Setter method customer details.
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

//Method to print customer details.
    public String Customerdetails() {
        return "Name: " + name + " Address: " + address + " Phone: " + phone + " CustomerId: " + customerId;
    }
}
