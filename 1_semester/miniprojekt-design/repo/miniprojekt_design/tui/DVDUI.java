package tui;
import controller.*;
import model.*;

public final class DVDUI {
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
        case "add dvd":
          addDVD();
          break;
        case "find dvd":
          findDVD();
          break;
        case "update dvd":
          updateDVD();
          break;
        case "delete dvd":
          deleteDVD();
          break;
        case "add dvd copy":
          addDVDCopy();
          break;
        case "delete dvd copy":
          deleteDVDCopy();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("**************************************");
    System.out.println("*              DVD Menu              *");
    System.out.println("*                                    *");
    System.out.println("*         Available options:         *");
    System.out.println("*          Main menu: back           *");
    System.out.println("*          Add DVD: add dvd          *");
    System.out.println("*         Find DVD: find dvd         *");
    System.out.println("*       Update DVD: update dvd       *");
    System.out.println("*       Delete DVD: delete dvd       *");
    System.out.println("*     Add DVD Copy: add dvd copy     *");
    System.out.println("*  Delete DVD Copy: delete dvd copy  *");
    System.out.println("**************************************");
  }

  private static void addDVD() {
    DVDController dvdCtrl = new DVDController();
    String barcode = Helper.readInput("Enter the DVD's barcode");
    String title = Helper.readInput("Enter the DVD's title");
    String artist = Helper.readInput("Enter the DVD's artist");
    String pubDate = Helper.readInput("Enter the DVD's privateation date");

    DVD d = dvdCtrl.createDVD(barcode, title, artist, pubDate);
    if(d != null) {
      System.out.println("A new DVD was created!");
    }
    else
      System.out.println("An error occurred ...");
  }

  private static void findDVD() {
    DVDController dvdCtrl = new DVDController();
    String barcode = Helper.readInput("Enter the DVD's barcode");

    DVD d = dvdCtrl.getDVD(barcode);
    if(d != null)
      System.out.println(d);
    else
      System.out.println("DVD not found!");
  }

  private static void updateDVD() {
    DVDController dvdCtrl = new DVDController();
    String res;
    String inputBarcode = Helper.readInput("Enter the DVD's barcode");

    DVD d = dvdCtrl.getDVD(inputBarcode);

    if(d != null) {
      String barcode = Helper.readInput("Enter new barcode");
      String title = Helper.readInput("Enter new title");
      String artist = Helper.readInput("Enter new artist");
      String pubDate = Helper.readInput("Enter new privateation date");

      dvdCtrl.updateDVD(d, barcode, title, artist, pubDate);
      res = "The DVD was updated!";
    } else
      res = "DVD was not found!";

    System.out.println(res);
  }

  private static void deleteDVD() {
    DVDController dvdCtrl = new DVDController();

    String inputBarcode = Helper.readInput("Enter the DVD's barcode");
    DVD d = dvdCtrl.getDVD(inputBarcode);

    dvdCtrl.deleteDVD(d);

    System.out.println(d.getTitle() + " was deleted!");
  }

  private static void addDVDCopy() {
    DVDController dvdCtrl = new DVDController();

    String inputBarcode = Helper.readInput("Enter the DVD's barcode");
    String serialNo = Helper.readInput("Enter the DVD copy's serial no.");
    String purchaseDate = Helper.readInput("Enter the DVD copy's purchase date");
    String purchasePrice = Helper.readInput("Enter the DVD copy's purchase price");

    DVD d = dvdCtrl.getDVD(inputBarcode);
    DVDCopy dc = new DVDCopy(serialNo, purchaseDate, purchasePrice, d);

    if(d.addCopy(dc))
      System.out.println("DVD copy added!");
    else
      System.out.println("An error occurred ...");
  }

  private static void deleteDVDCopy() {
    DVDController dvdCtrl = new DVDController();

    String inputBarcode = Helper.readInput("Enter the DVD's barcode");
    String inputSerialNo = Helper.readInput("Enter the DVD copy's serial no.");

    DVD d = dvdCtrl.getDVD(inputBarcode);
    DVDCopy dc = d.getDVDCopy(inputSerialNo);

    if(dc != null) {
      if (d.removeCopy(dc))
        System.out.println("DVD copy with serial no. " + dc.getSerialNo() + " was deleted!");
    } else
      System.out.println("DVD copy was not found ...");
  }
}
