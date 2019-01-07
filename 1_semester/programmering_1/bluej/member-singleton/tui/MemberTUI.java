package tui;

import java.util.*;
import controller.*;
import model.*;
import helpers.Text;

public class MemberTUI {
    public static void main(String... arg) {
        new MemberTUI().start();
    }
    
    private void start() {
        boolean goon = true;
        while(goon) {
            printMainOptions();
            String choice = input("What do you want to do??");
            switch(choice.toLowerCase()) {
                case "quit":
                case "q": 
                    goon = false;
                    break;
                case "member":
                    memberMenu();
                    break;
                default:
                    System.out.println("Don't understand " + choice + ", try again!");
            }
        }
        System.out.println("Thank you for using FFC management software(R)(C)");
    }
    
    private void printMainOptions() {
        System.out.println("Pick one of: quit/q, member");
    }
    
    private void memberMenu() {
        String choice = input("Pick one of create or view members");
        if(choice.equalsIgnoreCase("create")) {
            createMember();
        } else if(choice.equalsIgnoreCase("view")) {
            //System.out.println("TODO");
            viewMembers();
        } else {
            System.out.println("Unsupported operation " + choice);
        }
    }
    
    private void viewMembers() {
        MemberController mCtrl = new MemberController();
        //1.1
        ArrayList<Member> l = mCtrl.findAllMembers();
        System.out.println("All members in the club:");
        for(Member m : l) {
            displayMember(m);
        } 
    }
    
    private void createMember() {
        System.out.println("Creating new member");
        String name = input("Name");
        String phone = input("Phone");
        String email = input("Email");
        MemberController mCtrl = new MemberController();
        Member m = mCtrl.createMember(name, phone, email);
        displayMember(m);
    }
    
    private void displayMember(Member m) {
        if(m != null) {
            m.print();
        } else {
            System.out.println("NO MEMBER TO D_ISPLAY");
        }
    }
    
    private String input(String question) {
        System.out.print(question + ": ");
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        return res;
    }
}
