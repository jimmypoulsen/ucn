package tui;
import controller.*;
import model.*;

public final class LoanUI {
  public static void start() {
    printMenu();
    boolean run = true;

    while(run) {
      String command = Helper.readInput("What is your command?");
      switch (command.toLowerCase()) {
        case "help":
          printMenu();
          break;
        case "back":
          System.out.println("Going back to main menu ...");
          run = false;
          break;
        case "add loan":
          addLoan();
          break;
        case "find loan":
          findLoan();
          break;
        case "return loan":
          returnLoan();
          break;
        case "reopen loan":
          reOpenLoan();
          break;
        case "all loans":
          allLoans();
          break;
        case "all active loans":
          allActiveLoans();
          break;
        case "all returned loans":
          allInActiveLoans();
          break;
        case "return date":
          getReturnDate();
          break;
        default:
          System.out.println("Command not recognized.. Try again!");
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("*********************************************");
    System.out.println("*                 Loan Menu                 *");
    System.out.println("*                                           *");
    System.out.println("*             Available options:            *");
    System.out.println("*              Main menu: back              *");
    System.out.println("*             Add loan: add loan            *");
    System.out.println("*            Find loan: find loan           *");
    System.out.println("*          Return date: return date         *");
    System.out.println("*          Return loan: return loan         *");
    System.out.println("*          Re-open loan: reopen loan        *");
    System.out.println("*             All loans: all loans          *");
    System.out.println("*     All active loans: all active loans    *");
    System.out.println("*  All in-active loans: all returned loans  *");
    System.out.println("*********************************************");
  }

  private static void addLoan() {
    LoanController lCtrl = new LoanController();
    PersonController pCtrl = new PersonController();
    DVDController dCtrl = new DVDController();
    boolean run = true;
    String input;

    // find person
    int pId = Helper.readInt("Enter the person's ID");
    Person p = pCtrl.getPerson(pId);

    // create a loan
    Loan l = lCtrl.createLoan(p, Helper.currentDateTime(), "30");

    System.out.println("Begin adding dvd's to your loan!");
    System.out.println("Type :done when you're done.");
    while(run) {
      String dBarcode = Helper.readInput("Enter the DVD's barcode");
      switch(dBarcode) {
        case ":done":
          if(l.getLoanLines().size() == 0) {
            lCtrl.deleteLoan(l);
            System.out.println("Loan was not added because you did not add any loan lines!");
          } else
            System.out.println("A loan was added!");
          run = false;
          break;
        default:
          try {
            // find dvd
            DVD d = DVDContainer.getInstance().findDVD(dBarcode);

            // find dvd copy
            String dcSerialNo = Helper.readInput("Enter the DVD Copy's serial no.");
            DVDCopy dc = d.getDVDCopy(dcSerialNo);

            // add loan line
            if (d.getTitle() != null && dc.getSerialNo() != null) {
              LoanLine ll = new LoanLine(l, dc);

              // if addLoanLine returns false then the dvd copy is already rented
              if(!l.addLoanLine(ll))
                System.out.println("That DVD copy is already rented!");
            }
          } catch (NullPointerException e) {
            System.out.println("DVD or DVD copy could not be found!");
          }
          break;
      }
    }
  }

  private static void findLoan() {
    LoanController lCtrl = new LoanController();

    int lId = Helper.readInt("Enter the loan's ID");
    Loan l = lCtrl.getLoan(lId);

    if(l != null)
      System.out.println(l);
    else
      System.out.println("Loan could not be found!");
  }

  private static void returnLoan() {
    LoanController lCtrl = new LoanController();

    int lId = Helper.readInt("Enter the loan's ID");
    Loan l = lCtrl.getLoan(lId);

    if(Helper.currentDateTime().isBefore(l.getBorrowDate().plusDays(Integer.parseInt(l.getPeriod())))) {
      lCtrl.deactivateLoan(l);
      System.out.println("Loan is now returned!");
    } else {
      l.setStatus("overdue");
      System.out.println("That loan is overdue .. Idiot!");
    }


  }

  private static void reOpenLoan() {
    LoanController lCtrl = new LoanController();

    int lId = Helper.readInt("Enter the loan's ID");
    Loan l = lCtrl.getLoan(lId);
    lCtrl.activateLoan(l);
    l.setBorrowDate(Helper.currentDateTime());

    System.out.println("Loan is now active!");
  }

  private static void allLoans() {
    for(Loan l : LoanContainer.getInstance().findAll().values()) {
      System.out.println(l);
    }
  }

  private static void allActiveLoans() {
    System.out.println("Listing active loans ...");
    for(Loan l : LoanContainer.getInstance().findAllActive().values()) {
      System.out.println(l);
    }
  }

  private static void allInActiveLoans() {
    System.out.println("Listing returned loans ...");
    for(Loan l : LoanContainer.getInstance().findAllInActive().values()) {
      System.out.println(l);
    }
  }

  private static void getReturnDate() {
    int lId = Helper.readInt("Enter loan ID");
    Loan l = LoanContainer.getInstance().findLoan(lId);
    System.out.println(Helper.formatDateTime(Helper.returnDateTime(l.getBorrowDate(), l.getPeriod())));
  }
}