
/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int number;
    private String orderDate;
    private String delivery;
    private String payDate;
    private boolean status;
    private OrderLine orderLine;
    
    public Order(int number, String orderDate, String delivery) {
        this.number = number;
        this.orderDate = orderDate;
        this.delivery = delivery;
        this.status = false;
    }
    
    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
    
    public void completeOrder() {
        this.status = true;
        this.orderLine.product.updateStock();
    }
}
