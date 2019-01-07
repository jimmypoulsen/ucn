
/**
 * Write a description of class OrderLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderLine
{
    private int quantity;
    private Order order;
    public Product product;
    
    public OrderLine(int quantity, Order order, Product product) {
        this.quantity = quantity;
        this.order = order;
        this.product = product;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public Product getProduct() {
        return this.product;
    }
}
