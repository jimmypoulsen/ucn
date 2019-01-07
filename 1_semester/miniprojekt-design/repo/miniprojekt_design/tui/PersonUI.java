package tui;
import controller.*;
import model.*;

public final class PersonUI {
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
        case "add person":
          addPerson();
          break;
        case "find person":
          findPerson();
          break;
        case "update person":
          updatePerson();
          break;
        case "delete person":
          deletePerson();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("**********************************");
    System.out.println("*          Person Menu           *");
    System.out.println("*                                *");
    System.out.println("*       Available options:       *");
    System.out.println("*        Main menu: back         *");
    System.out.println("*     Add person: add person     *");
    System.out.println("*    Find person: find person    *");
    System.out.println("*  Update person: update person  *");
    System.out.println("*  Delete person: delete person  *");
    System.out.println("**********************************");
  }

  private static void addPerson() {
    PersonController pCtrl = new PersonController();

    String name = Helper.readInput("Enter name");
    String address = Helper.readInput("Enter address");
    String postalCode = Helper.readInput("Enter postal code");
    String city = Helper.readInput("Enter city");
    String phone = Helper.readInput("Enter phone number");

    if(Helper.checkEmptyInput(name)
      || Helper.checkEmptyInput(address)
      || Helper.checkEmptyInput(postalCode)
      || Helper.checkEmptyInput(city)
      || Helper.checkEmptyInput(phone)) {
        System.out.println("You missed some information ... Try again!");
    } else {
      Person p = pCtrl.createPerson(name, address, postalCode, city, phone);
      System.out.println("Person added!");
    }
  }

  private static void findPerson() {
    PersonController pCtrl = new PersonController();

    int id = Helper.readInt("Enter the person's id");
    Person p = pCtrl.getPerson(id);

    if(p != null) {
      System.out.println(p);
      if(pCtrl.getLoans(p).size() > 0) {
        System.out.println(p.getName() + " has " + pCtrl.getLoans(p).size() + " loans:");
        for(Loan l : pCtrl.getLoans(p).values()) {
          System.out.println(l);
        }
      } else
        System.out.println("Person has no loans!");
    } else
      System.out.println("Person not found!");
  }

  private static void updatePerson() {
    PersonController pCtrl = new PersonController();
    String res;
    int id = Helper.readInt("Enter the person's id");
    Person p = pCtrl.getPerson(id);

    if(p != null) {
      String name = Helper.readInput("Enter new name");
      String address = Helper.readInput("Enter new address");
      String postalCode = Helper.readInput("Enter new postal code");
      String city = Helper.readInput("Enter new city");
      String phone = Helper.readInput("Enter new phone number");

      if(!Helper.checkEmptyInput(name))
        p.setName(name);
      if(!Helper.checkEmptyInput(address))
        p.setAddress(address);
      if(!Helper.checkEmptyInput(postalCode))
        p.setPostalCode(postalCode);
      if(!Helper.checkEmptyInput(city))
        p.setCity(city);
      if(!Helper.checkEmptyInput(phone))
        p.setPhone(phone);
      res = "The person was updated!";
    } else
      res = "Person was not found!";

    System.out.println(res);
  }

  private static void deletePerson() {
    PersonController pCtrl = new PersonController();

    int id = Helper.readInt("Enter the person's id");
    Person p = pCtrl.getPerson(id);

    pCtrl.deletePerson(p);

    System.out.println(p.getName() + " was deleted!");
  }
}
