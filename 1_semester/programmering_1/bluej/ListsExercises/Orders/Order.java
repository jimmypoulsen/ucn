import java.util.ArrayList;

public class Order
{
    private int number;
    private String orderDate;
    private String delivery;
    private String payDate;
    private boolean status;
    private ArrayList<OrderLine> orderLines = new ArrayList<>();
    
    public Order(int number, String orderDate, String delivery) {
        this.number = number;
        this.orderDate = orderDate;
        this.delivery = delivery;
        this.status = false;
    }

    public int getNumber() {
        return this.number;
    }
    
    public String getOrderDate() {
        return this.orderDate;
    }
    
    public String getDelivery() {
        return this.delivery;
    }
    
    public String getPayDate() {
        return this.payDate;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public String getStatusString() {
        String res = "Not completed";
        if(this.status)
            res = "Completed";
            
        return res;
    }
    
    public void setOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }
    
    public ArrayList<OrderLine> getOrderLines() {
        return this.orderLines;
    }
    
    public void completeOrder() {
        this.status = true;
        for(OrderLine oL : orderLines)
            oL.product.updateStock();
    }
}
