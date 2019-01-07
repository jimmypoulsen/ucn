public abstract class AbstractProduct {
    private String name;
    public AbstractProduct(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public abstract void print();
}
