package model;
import tui.Helper;

import java.util.*;

public class LoanContainer {
  private static LoanContainer instance = null;
  private HashMap<Integer, Loan> loans;

  private LoanContainer() {
    loans = new HashMap<Integer, Loan>();
  }

  public static LoanContainer getInstance() {
    if(instance == null)
      instance = new LoanContainer();
    return instance;
  }

  public boolean addLoan(Loan l) {
    loans.put(l.getId(), l);
    return true;
  }

  public Loan findLoan(int id) {
    return loans.get(id);
  }

  public HashMap<Integer, Loan> findAll() {
    HashMap<Integer, Loan> res = new HashMap<Integer, Loan>(loans);
    return res;
  }

  public HashMap<Integer, Loan> findAllActive() {
    HashMap<Integer, Loan> res = new HashMap<Integer, Loan>();

    for(int i = 1; i <= loans.size(); i++) {
      Loan current = loans.get(i);
      if(current.getStatus().equals("active")) {
        res.put(current.getId(), current);
      }
    }

    return res;
  }

  public HashMap<Integer, Loan> findAllInActive() {
    HashMap<Integer, Loan> res = new HashMap<Integer, Loan>();

    for(int i = 1; i <= loans.size(); i++) {
      Loan current = loans.get(i);
      if(current.getStatus().equals("inactive")) {
        res.put(current.getId(), current);
      }
    }

    return res;
  }

  public Loan deleteLoan(int id){
    Loan l = findLoan(id);
    loans.remove(l.getId());
    return l;
  }

  public boolean activateLoan(Loan l) {
    l.setStatus("active");
    l.setBorrowDate(Helper.currentDateTime());
    return true;
  }

  public boolean deactivateLoan(Loan l) {

    l.setStatus("inactive");
    return true;
  }

  public int getLastLoanId() {
    int res = 0;
    Loan l;
    if(!loans.isEmpty()) {
      l = loans.get(loans.size());
      res = l.getId();
    }
    return res;
  }
}
