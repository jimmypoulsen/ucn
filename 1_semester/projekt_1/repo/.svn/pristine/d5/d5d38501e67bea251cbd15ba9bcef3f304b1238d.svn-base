package Models;
import java.util.HashMap;

public class SaleContainer {
    private static SaleContainer instance = null;
    private HashMap<Integer, Sale> sales;

    private SaleContainer() {
        sales = new HashMap<>();
    }

    public SaleContainer getInstance() {
        if(instance == null) {
            instance = new SaleContainer();
        }
        return instance;
    }
}