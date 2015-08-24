/**
 * Created by galw on 6/26/15.
 */
public class Problem2 {
    public static void main(String[] args) {
        //System.out.println(evenFibonacci(5));
        int result = 0;
        long sum = 0;
        int i = 0;
        while (result < 4000000) {
            result = evenFibonacci(i++);
            if ((result % 2) == 0) {
                sum += result;
            }
        }

        System.out.println(sum);
    }

    public static int evenFibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {

            return (evenFibonacci(n - 1) + evenFibonacci(n - 2));
        }
    }
}
