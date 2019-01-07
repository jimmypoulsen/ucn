package model;

public class DVDCopy {
    private String serialNo;
    private String purchaseDate;
    private String purchasePrice;
    private DVD dvd;

    public DVDCopy(String serialNo, String purchaseDate, String purchasePrice, DVD dvd) {
        this.serialNo = serialNo;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.dvd = dvd;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    public String toString() {
        String res = "Serial no.: " + this.getSerialNo() + "\n";
        res += "Purchase date: " + this.getPurchaseDate() + "\n";
        res += "Purchase price: " + this.getPurchasePrice() + "\n";
        res += "DVD title: " + this.getDvd().getTitle() + "\n";
        return res;
    }
}
