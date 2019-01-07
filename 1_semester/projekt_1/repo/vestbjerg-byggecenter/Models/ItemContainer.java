package Models;
import java.util.ArrayList;

public class ItemContainer {
    private static ItemContainer instance = null;
    private ArrayList<Item> items;

    public ItemContainer() {
        items = new ArrayList<>();
    }

    public static ItemContainer getInstance() {
        if(instance == null) {
            instance = new ItemContainer();
        }
        return instance;
    }
    
    public Item addItem(Item i) {
        items.add(i);
        return i;
    }
    
    public Item findItem(String barcode) {
        Item current = null;
        Item res = null;
        int index = 0;
        boolean found = false;
        int size = items.size();
        while (index < size && !found) {
            current = items.get(index);
            if(current.getBarcode().equals(barcode)) {
                found = true;
            } else {
                index++;
            }
        }
        if (found) {
            res = items.get(index);
        }
        return res;
    }
}