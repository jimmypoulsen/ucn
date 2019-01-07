import java.util.ArrayList;

class ForLoop {
  public static void main(String args[]) {
    ArrayList<String> aL = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      aL.add("This is string number " + i);
    }

    for (int i = 1; i <= aL.size(); i++) {
      System.out.println(aL.get(i - 1));
    }
  }
}