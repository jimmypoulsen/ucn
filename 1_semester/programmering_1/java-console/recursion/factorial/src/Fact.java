public class Fact {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int fact = fact(x);
        System.out.println(x + "! = " + fact);
    }

    private static int fact(int x) {
        if(x == 0) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
