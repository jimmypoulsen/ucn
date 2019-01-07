
/**
 * Write a description of class Cutomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    private int number;
    private String name;
    private String address;
    private String phone;
    private Order order;
    
    public Customer(int number, String name, String address, String phone) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
}
