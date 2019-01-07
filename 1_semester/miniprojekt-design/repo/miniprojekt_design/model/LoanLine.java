package model;

public class LoanLine {
  private Loan loan;
  private DVDCopy dvdCopy;

  public LoanLine(Loan l, DVDCopy dc) {
    this.loan = l;
    this.dvdCopy = dc;
  }

  public Loan getLoan() {
    return loan;
  }

  public void setLoan(Loan loan) {
    this.loan = loan;
  }

  public DVDCopy getDVDCopy() {
    return dvdCopy;
  }

  public void setDVDCopy(DVDCopy dc) {
    this.dvdCopy = dc;
  }
 
  @Override
  public String toString() {
    String res = "Title: " + this.getDVDCopy().getDvd().getTitle() + "\t";
    res += "Serial no.: " + this.getDVDCopy().getSerialNo() + "\n";
    return res;
  }
}
