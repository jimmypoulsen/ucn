import java.util.Scanner;

class Program {
  public static void main(String args[]) {
    boolean run;
    String action;
    User user = new User();
    Scanner scanner = new Scanner(System.in);
    run = true;

    while (run) {
      System.out.print("Enter command: ");
      action = scanner.next();

      switch (action) {
      case "hello":
        if (user.getName().length() > 0)
          System.out.println(user);
        else
          System.out.println("Hello!!!");
        break;
      case ":start":
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        user.setName(name);
        user.setAge(age);
        break;
      case ":stop":
        System.out.println("Goodbye...");
        run = false;
        break;
      default:
        System.out.println("Command not recognized...");
        break;
      }
    }
  }
}