package tui;


/**
 * Description of MainMenu goes here.
 * 
 * @author knol, mhi
 * @version 2018.10.19
 */
public class MainMenu {
    // instansvariables 
    private CDMenu cdMenu;

    /**
     * Constructor for objects of MainMenu
     */
    public MainMenu() {
        // initialise instansvariables
        cdMenu = new CDMenu();
        mainMenuStart();
    }

    public void mainMenuStart() { 
        boolean exit=false;
        while (!exit) { //! means while exit not is true (that is: false)
            int choice = writeMainMenu();
            if(choice == 1) {
                cdMenu.cdMenuStart();
            }
            // else if(choice == 2) { 
                // startFindCD();
            // }
            // else if(choice == 3) {
                // startAddNumber();
            // }
            else {
                writeEnd();
                exit = true;
            }//end else
        }//end while
    }
    private int writeMainMenu(){
        TextOptions menu = new TextOptions("\n ***Main Menu***", "Exit");
        menu.addOption("Manage CDs");
        return menu.prompt();
    }
    private void writeEnd() {
        System.out.println(" The System is shutting down ");
    }
}
