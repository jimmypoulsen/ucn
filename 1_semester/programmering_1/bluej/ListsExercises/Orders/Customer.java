import java.util.ArrayList;

public class Customer
{
    private int number;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Order> orders = new ArrayList<>();
    
    public Customer(int number, String name, String address, String phone) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.phone;
    }
    
    public void setOrder(Order order) {
        orders.add(order);
    }
    
    public void printOrders() {
        double sum = 0;
        String res = "Customer: \n" + this;
        res += "\n<><><> Orders: " + orders.size() + " <><><>\n";
        
        for(Order o : orders) {
            res += "Order nr: " + o.getNumber() + "\n";
            res += "Order date: " + o.getOrderDate() + "\n";
            res += "Delivery date: " + o.getDelivery() + "\n";
            res += "Pay date: " + o.getPayDate() + "\n";
            res += "Status: " + o.getStatusString() + "\n";
            res += "----- Order lines -----:\n";
            for(OrderLine oL : o.getOrderLines()) {
                sum += (oL.getQuantity() * oL.getProduct().getPrice());
                res += "| Quantity: " + oL.getQuantity() + " |\n";
                res += "|-- Product --|\n";
                res += "| Description: " + oL.getProduct().getDescription() + " |\n";
                res += "| Price: " + oL.getProduct().getPrice() + " |\n";
                res += "| Stock: " + oL.getProduct().getStock() + " |\n";
                res += "|-------------|\n";
            }
            res += "$$$$$ Total price: " + sum + "\n";
            sum = 0;
        }
        
        System.out.println(res);
    }
}
