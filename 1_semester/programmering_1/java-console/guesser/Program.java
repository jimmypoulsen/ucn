import java.util.Scanner;
import java.util.Random;

class Program {
  public static void main(String args[]) {
    boolean run = true;
    Random rand = new Random();
    int number = rand.nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    int guess;
    int guessCount = 0;

    while (run) {
      System.out.print("Indtast gæt: ");
      guess = scanner.nextInt();

      if (guess == number) {
        System.out.println("Korrekt!");
        run = false;
      } else {
        guessCount += 1;
        System.out.println("Forkert...");
        if (guess > number)
          System.out.println("Dit gæt var for højt!");
        else
          System.out.println("Dit gæt var for lavt!");
      }

      if (guessCount == 10 && run == true) {
        System.out.println("Maks. antal gæt opnået... Taber!");
        run = false;
      } else {
        System.out.println("Du har " + (10 - guessCount) + " gæt tilbage");
      }
    }
  }
}