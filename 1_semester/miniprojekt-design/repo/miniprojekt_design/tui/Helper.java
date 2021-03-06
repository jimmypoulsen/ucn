package tui;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public final class Helper {
  private Helper() {
    throw new UnsupportedOperationException();
  }
  
  public static String readInput(String question) {
    System.out.print(question + ": ");
    Scanner s = new Scanner(System.in);
    return s.nextLine();
  }

  public static int readInt(String question) {
    System.out.print(question + ": ");
    Scanner s = new Scanner(System.in);
    return s.nextInt();
  }

  public static boolean checkEmptyInput(String input) {
    boolean res = false;
    if(input.equals("") || input.equals(" "))
      res = true;
    return res;
  }

  public static LocalDateTime currentDateTime() {
    return LocalDateTime.now();
  }

  public static String formatDateTime(LocalDateTime dateTime) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM-yyyy HH:mm:ss");
    return dtf.format(dateTime);
  }

  public static LocalDateTime returnDateTime(LocalDateTime b, String p) {
    int period = Integer.parseInt(p);
    return LocalDateTime.from(b.plusDays(period));
  }
}
