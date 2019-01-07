package tui;
import controller.*;
import model.*;
import java.time.LocalDateTime;

public class MainMenuUI {
    public static void main(String args[]) {
        new MainMenuUI().start();
    }

    private void start() {
        printMenu();
        boolean run = true;

        while(run) {
            String command = Helper.readInput("What is your command?");
            switch(command.toLowerCase()) {
                case "exit":
                case "quit":
                case "q":
                    run = false;
                    break;
                case "help":
                    printMenu();
                case "person":
                    PersonUI.start();
                    break;
                case "dvd":
                    DVDUI.start();
                    break;
                case "loan":
                    LoanUI.start();
                    break;
                case "test me":
                    runTests();
                    break;
                default:
                    System.out.println("Command not recognized.. Try again!");
            }
        }
        System.out.println("System terminated...");
    }

    private void printMenu() {
        System.out.println("*************************");
        System.out.println("*       Main Menu       *");
        System.out.println("*                       *");
        System.out.println("*   Available options:  *");
        System.out.println("*  Quit: q, quit, exit  *");
        System.out.println("*  Person menu: person  *");
        System.out.println("*     DVD menu: dvd     *");
        System.out.println("*    Loan menu: loan    *");
        System.out.println("*************************");
    }

    private void runTests() {
        PersonController pCtrl = new PersonController();
        DVDController dCtrl = new DVDController();
        LoanController lCtrl = new LoanController();

        pCtrl.createPerson("Jimmy", "Langagervej 4, st. 69", "9220", "Aalborg Øst", "31337135");
        pCtrl.createPerson("Kongen", "Kongevej 4", "2400", "København", "1337");

        dCtrl.createDVD("123456", "Saw", "James Cameron", "07/11-2007");
        dCtrl.createDVD("654321", "Saw IV", "James Cameron", "05/12-2008");
        DVD d = dCtrl.getDVD("123456");
        DVD d1 = dCtrl.getDVD("654321");

        d.addCopy(new DVDCopy("asd", "22/12-1221", "20$", d));
        d.addCopy(new DVDCopy("asdasd", "25/12-1221", "20$", d));
        d1.addCopy(new DVDCopy("asdasdasd", "25/12-1221", "20$", d1));
        d1.addCopy(new DVDCopy("asdasdasdasd", "25/12-1221", "20$", d1));

        // create a loan
        Person p = pCtrl.getPerson(1);
        LocalDateTime borrowDate =  LocalDateTime.from(Helper.currentDateTime().minusDays(1));
        Loan l = lCtrl.createLoan(p, borrowDate, "30");
        LoanLine ll = new LoanLine(l, d.getDVDCopy("asd"));
        l.addLoanLine(ll);
    }
}
