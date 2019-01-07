
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer {
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String address;
    private int yearOfBirth;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String customerName, String customerEmail) {
        name = customerName;
        email = customerEmail;
    }
    
    public String toString() {
        return "Name: " + name + "\nEmail: " + email;
    }
}
