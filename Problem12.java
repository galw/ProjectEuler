/**
 * Created by galw on 02/11/2015.
 */
public class Problem12 {
    public static void main(String[] args) {

        int n = 1;
        long triangularNumber = triangularNumber(n);
        int divisors = howManyDivisors(triangularNumber);

        while (divisors < 500) {
            triangularNumber = triangularNumber(n);
            divisors = howManyDivisors(triangularNumber);
            n++;
        }

        System.out.println(triangularNumber);
    }

    public static long triangularNumber(long n) {
        return ((1 + n) * n) / 2;
    }

    public static int howManyDivisors(long n) {
        int counter = 1;

        int sqrt = (int) Math.sqrt((double)n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                counter +=2 ;
            }
        }

        if (sqrt * sqrt == n) {
            counter--;
        }

        return counter;
    }
}