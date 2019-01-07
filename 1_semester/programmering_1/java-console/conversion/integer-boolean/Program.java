class Program {
  public static void main(String args[]) {
    Integer foo = 0;
    Integer bar = 1;
    Integer foobar = 2;
    boolean bool;

    bool = (foo != 0);
    System.out.println("0 converted to boolean: " + bool);
    bool = (bar != 0);
    System.out.println("1 converted to boolean: " + bool);
    bool = (foobar != 0);
    System.out.println("2 converted to boolean: " + bool);
  }
}