public class CountDown {
    public static void main(String[] args) {
        countDown(10, 0);
    }

    public static void countDown(int max, int min) {
        System.out.println(max);
        if(max > min) {
            countDown(max - 1, min);
        }
    }
}
