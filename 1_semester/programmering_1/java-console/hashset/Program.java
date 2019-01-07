import java.util.HashSet;
import java.util.Iterator;

class Program {
  public static void main(String args[]) {
    HashSet<Integer> mySet = new HashSet<Integer>();

    for (int i = 1; i <= 10; i++) {
      mySet.add(i);
    }

    Iterator<Integer> i = mySet.iterator();
    while (i.hasNext())
      System.out.println(i.next());
  }
}