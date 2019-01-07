package model;
import java.util.ArrayList;

public class DVD {
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<DVDCopy> copies;

    public DVD(String barcode, String title, String artist, String publicationDate) {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        this.copies = new ArrayList<>();
    }

    public boolean addCopy(DVDCopy copy) {
        boolean res = true;
        if(copy != null)
            return copies.add(copy);
        else
            res = false;
        return res;
    }

    public DVDCopy getDVDCopy(String serialNo) {
        DVDCopy res = null;
        try {
            DVDCopy current =  null;
            int index = 0;
            boolean found = false;
            int size = copies.size();
            while (index < size && !found) {
                current = copies.get(index);
                if(current.getSerialNo().equals(serialNo)) {
                    found = true;
                } else {
                    index++;
                }
            }
            if (found) {
                res = copies.get(index);
            }
        } catch (NullPointerException e) {
            System.out.println("DVD could not be found ...");
        }
        return res;
    }

    public ArrayList<DVDCopy> getCopies() {
        ArrayList<DVDCopy> res = new ArrayList<DVDCopy>(copies);
        return res;
    }

    public boolean removeCopy(DVDCopy copy) {
        boolean res = true;
        if(copy != null)
            return copies.remove(copy);
        else
            res = false;
        return res;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String toString() {
        String res = "DVD:\n";
        res += "Barcode: " + this.getBarcode() + "\n";
        res += "Title: " + this.getTitle() + "\n";
        res += "Artist: " + this.getArtist() + "\n";
        res += "Publication date: " + this.getPublicationDate() + "\n";
        if(copies.size() > 0) {
            res += "DVD Copies:\n";
            for(DVDCopy copy : copies) {
                res += copy;
                res += "\n";
            }
        } else
            res += "There are no copies of this DVD\n";

        return res;
    }
}
