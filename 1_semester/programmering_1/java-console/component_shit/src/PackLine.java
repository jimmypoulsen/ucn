public class PackLine {
    private int quantity;
    private AbstractProduct product;

    public PackLine(AbstractProduct p, int q) {
        product = p;
        quantity = q;
    }

    public int getQuantity() {
        return quantity;
    }

    public AbstractProduct getProduct() {
        return product;
    }
}
