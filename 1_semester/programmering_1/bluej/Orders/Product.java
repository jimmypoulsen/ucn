
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    private int id;
    private String description;
    private double price;
    private int stock;
    
    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.stock = 5;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void updateStock() {
        this.stock -= 1;
    }
}
