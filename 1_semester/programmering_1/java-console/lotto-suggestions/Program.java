import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Program {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    boolean run = true;
    String action;

    while (run) {
      System.out.print("What do you want to play?: ");
      action = scanner.nextLine();

      switch (action) {
      case ":q":
        System.out.println("Good bye!");
        run = false;
        break;
      case "euro jackpot":
        System.out.println("Euro Jackpot numbers:");
        for (int i = 1; i <= 5; i++) {
          System.out.print(rand.nextInt(50) + 1 + ", ");
        }
        System.out.println("Star numbers: " + rand.nextInt(10) + 1 + ", " + rand.nextInt(10) + 1);
        break;
      }
    }
  }
}