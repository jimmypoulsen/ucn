package controller;
import model.*;
import tui.Helper;

public class DVDController {
    public DVD createDVD(String barcode, String title, String artist, String publicationDate) {
        DVD d = new DVD(barcode, title, artist, publicationDate);

        if(!DVDContainer.getInstance().addDVD(d))
            d = null;

        return d;
    }

    public DVD getDVD(String barcode) {
        return DVDContainer.getInstance().findDVD(barcode);
    }

    public DVD updateDVD(DVD d, String barcode, String title, String artist, String publicationDate) {
        if(!Helper.checkEmptyInput(barcode))
            d.setBarcode(barcode);
        if(!Helper.checkEmptyInput(title))
            d.setTitle(title);
        if(!Helper.checkEmptyInput(artist))
            d.setArtist(artist);
        if(!Helper.checkEmptyInput(publicationDate))
            d.setPublicationDate(publicationDate);
        return d;
    }

    public DVD deleteDVD(DVD d) {
        return DVDContainer.getInstance().deleteDVD(d.getBarcode());
    }
}
