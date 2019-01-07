import java.util.*;

public class Pack extends AbstractProduct {
    private List<PackLine> children;

    public Pack(String name) {
        super(name);
        children = new ArrayList<>();
    }

    public void addChild(AbstractProduct p, int q) {
        children.add(new PackLine(p, q));
    }

    public double getPrice() {
        double price = 0;
        for(PackLine pl : children) {
            price = pl.getProduct().getPrice() * pl.getQuantity();
        }
        return price;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + ":");
        for(PackLine pl : children) {
            System.out.println(pl.getQuantity() + "x");
            pl.getProduct().print();
        }
    }
}
