import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

class Program {
  public static void main(String args[]) {
    HashMap<Integer, Order> orderBook = new HashMap<Integer, Order>();
    Scanner scanner = new Scanner(System.in);
    boolean run = true;
    String action;

    for (int i = 1; i <= 10; i++) {
      Order order = new Order(i, i * 100, "Product " + i);
      orderBook.put(i, order);
    }

    System.out.println("Commands:");
    System.out.println("\t:q\t\tQuit");
    System.out.println("\t:add\t\tAdd a new product");
    System.out.println("\t|integer|\tGet product where id = {integer}");

    while (run) {
      System.out.print("Enter command: ");
      action = scanner.nextLine();

      switch (action) {
      case ":q":
        run = false;
        break;
      case ":add":
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        orderBook.put(id, new Order(id, price, name));
        System.out.println("Order added!");
        action = Integer.toString(id);
      default:
        if (isStringInt(action))
          System.out.println(orderBook.get(Integer.parseInt(action)));
        else
          System.out.println("Command not recognized... Try again!");
      }
    }
  }

  public static boolean isStringInt(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }
}