package tui;

import model.*;
import control.*;
import java.util.Scanner;
/**
 * Write a description of class CDMenu here.
 * 
 * @author Kis Boisen Hansen, knol, mhi
 * @version 2010.04.08, 2012.04.10, 2015.11.01, 2018.10.19
 */
public class CDMenu {
    
    public CDMenu() {
    }

    public void cdMenuStart() { 
        boolean exit = false;
        while (!exit) { //! means while exit not is true (that is: false)
            int choice = writeCDMenu();
            if(choice == 1) {
                startCD();
            }
            else if(choice == 2) { 
                startFindCD();
            }
            else if(choice == 3) {
                startAddTrack();
            }
            else {
                exit = true;
            }//end else
        }//end while
    }

    private int writeCDMenu() {       
        // creates a keyboard object to read input
        TextOptions menu = new TextOptions("\n *** CD Menu ***", "Close");
        menu.addOption("Create CD");
        menu.addOption("Find CD");
        menu.addOption("Add Track to CD");
        int choice = menu.prompt();

        return choice;
    }

    private void startCD() {
        System.out.println(" *** Create New CD ***");
        int no = TextInput.inputNumber("CD Number");
        String title = TextInput.inputString("Title");
        CDTrackController cdCtrl = new CDTrackController();
        cdCtrl.createCD(no, title);
    }

    private void startAddTrack() {
        System.out.println(" *** Add Track ***");
        String cdTitle = TextInput.inputString("CD Title");
        String trackName = TextInput.inputString("Track title");
        int playingTime = TextInput.inputNumber("Track playing time");
        CDTrackController cdCtrl = new CDTrackController();
        boolean success = cdCtrl.addTrack(cdTitle, trackName, playingTime);
        if(success) {
            System.out.println("\nTrack added.\n");
        } else {
            System.out.println("\nThe CD Title you specified did not match any CDs in the CD register in the backend of this software product (c)(tm)");
        }
    }

    private void startFindCD() {
        System.out.println(" *** Find CD by Title ***");
        String title = TextInput.inputString("CD Title");
        CDTrackController cdCtrl = new CDTrackController();
        CD cdObj = cdCtrl.findCDByTitle(title);
        printCD(cdObj);
        //pause();
    }
    
    private void printCD(CD cd) {
        System.out.println(" *** CD Info ***");
        if(cd != null) {
            System.out.println("Title: "+ cd.getTitle());
            System.out.println("Total length: " + cd.totalPlaybackTime());
        }
        else {
            System.out.println("Oh noes! I had it right here, but now it's gone!");
        }
    }

    private void pause() {
        Scanner keyboard = new Scanner(System.in);
        String vent = keyboard.nextLine();
    }

}
