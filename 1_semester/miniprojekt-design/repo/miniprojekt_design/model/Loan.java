package model;
import tui.Helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.HashMap;

public class Loan {
    private int id;
    private Person person;
    private LocalDateTime borrowDate;
    private String period;
    private String status; // active or inactive
    private HashSet<LoanLine> loanLines;
    
    public Loan(Person p, int id, LocalDateTime borrowDate, String period) {
        this.person = p;
        this.id = id;
        this.borrowDate = borrowDate;
        this.period = period;
        this.status = "active";
        this.loanLines = new HashSet<LoanLine>();
    }

    public boolean addLoanLine(LoanLine ll) {
        HashMap<Integer, Loan> activeLoans = new HashMap<Integer, Loan>(LoanContainer.getInstance().findAllActive());
        DVDCopy dvdCopy = ll.getDVDCopy();
        boolean allowed = true;

        // check if the dvd copy is already rented
        for(Loan loan : activeLoans.values()) {
            for(LoanLine loanLine : loan.getLoanLines()) {
                if (loanLine.getDVDCopy().getSerialNo().equals(dvdCopy.getSerialNo()))
                    allowed = false;
            }
        }

        // return true if the dvd copy is not rented and false if it is
        if(allowed && this.loanLines.add(ll))
            return true;
        return false;
    }

    public HashSet<LoanLine> getLoanLines() {
        return this.loanLines;
    }

    public void setPerson(Person p) {
        this.person = p;
    }

    public Person getPerson() {
        return person;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }
    
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public String getBorrowDateString() { return Helper.formatDateTime(borrowDate); }
    
    public void setPeriod(String period) {
        this.period = period;
    }
    
    public String getPeriod() {
        return period;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        String res = "Loan:\n";
        res += "ID: " + this.getId() + "\t";
        res += "Loaner: " + this.getPerson().getName() + "\t";
        res += "Borrow date: " + this.getBorrowDateString() + "\t";
        res += "Period: " + this.getPeriod() + " days\t";
        res += "Status: " + this.getStatus() + "\n";
        res += "Loan lines:\n";
        for(LoanLine ll : loanLines) {
            res += ll;
        }
        return res;
    }
}
