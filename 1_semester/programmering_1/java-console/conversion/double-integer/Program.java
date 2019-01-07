// import java.math.*;

class Program {
  public static void main(String args[]) {
    Double d = 23.3;
    Double dbl = 23.8;
    int i;

    i = d.intValue();
    System.out.println(i);

    i = (int) Math.round(dbl);
    System.out.println(i);
  }
}