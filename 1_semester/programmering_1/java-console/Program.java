import java.util.ArrayList;
import java.util.Iterator;

class Program {
  public static void main(String args[]) {
    ArrayList<String> arrayList = new ArrayList<String>();

    for (int i = 1; i <= 10; i++) {
      arrayList.add("Test " + i);
    }

    Iterator<String> it = arrayList.iterator();

    int index = 0;
    while (it.hasNext()) {
      System.out.println("Index " + index + ":");
      System.out.println(it.next());
      index += 1;
    }
  }
}