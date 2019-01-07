package Models;


public class SalesLine {
    private int quantity;
    private double subtotal;
    private Item item;
    
    public SalesLine(int quantity, double subtotal) {
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.item = item;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
}
