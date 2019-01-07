package model;
import java.util.*;

public class DVDContainer {
    private static DVDContainer instance = null;
    private ArrayList<DVD> dvds;

    private DVDContainer() {
        dvds = new ArrayList<>();
    }

    public static DVDContainer getInstance() {
        if (instance == null) {
            instance = new DVDContainer();
        }
        return instance;
    }

    public boolean addDVD(DVD d) {
        return dvds.add(d);
    }

    public DVD findDVD(String barcode) {
        DVD current = null;
        DVD res = null;
        int index = 0;
        boolean found = false;
        int size = dvds.size();
        while (index < size && !found) {
            current = dvds.get(index);
            if(current.getBarcode().equals(barcode)) {
                found = true;
            } else {
                index++;
            }
        }
        if (found) {
            res = dvds.get(index);
        }
        return res;
    }

    public DVD deleteDVD(String barcode) {
        DVD current = null;
        DVD res = null;
        int index = 0;
        boolean found = false;
        int size = dvds.size();
        while (index < size && !found) {
            current = dvds.get(index);
            if(current.getBarcode().equals(barcode)) {
                found = true;
            } else {
                index++;
            }
        }
        if(found) {
            res = dvds.get(index);
            dvds.remove(index);
        }
        return res;
    }
}
