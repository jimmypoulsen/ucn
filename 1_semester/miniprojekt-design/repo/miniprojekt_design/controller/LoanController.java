  package controller;
  import model.*;
  import tui.Helper;
  import java.time.LocalDateTime;
  
  public class LoanController   {
    public Loan createLoan(Person p, LocalDateTime borrowDate, String period)   {
      int id = LoanContainer.getInstance().getLastLoanId() + 1;
      Loan l = new Loan(p, id, borrowDate, period);

      if (!LoanContainer.getInstance().addLoan(l)) {
        l = null;
      }
      return l;
    }

    // get loan
    public Loan getLoan(int id){
      return LoanContainer.getInstance().findLoan(id);
    }

    public Loan deleteLoan(Loan l) {
      return LoanContainer.getInstance().deleteLoan(l.getId());
    }

    // change loan's status to active
    public boolean activateLoan(Loan l) {
      LoanContainer.getInstance().activateLoan(l);
      return true;
    }

    // change loan's status to active
    public boolean deactivateLoan(Loan l) {
      LoanContainer.getInstance().deactivateLoan(l);
      return true;
    }
  }
