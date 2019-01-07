package Controllers;

import Models.*;

public class ItemController {
    public Item createItem(Location l, String barcode, String name, String description, double price, int stock, int minStock, int maxStock, int kolli, boolean lendable) {
        Item i = newItem(l);
        i.setBarcode(barcode);
        i.setName(name);
        i.setDescription(description);
        i.setPrice(price);
        i.setStock(stock);
        i.setMinStock(minStock);
        i.setMaxStock(maxStock);
        i.setKolli(kolli);
        i.setLendable(lendable);
        return ItemContainer.getInstance().addItem(i);
    }
    
    public Item newItem(Location l) {
        return new Item(l);
    }
    
    public Item getItem(String barcode) {
        return ItemContainer.getInstance().findItem(barcode);
    }
}