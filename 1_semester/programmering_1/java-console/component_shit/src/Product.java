public class Product extends AbstractProduct {
    private double price;

    public Product(String name, double price) {
        //this.name = name;
        super(name);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + " " + getPrice());
    }
}
