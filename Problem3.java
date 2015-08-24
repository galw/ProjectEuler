/**
 * Created by galw on 6/26/15.
 */
public class Problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long limit = number / 2;

        for (long i = 2; i < limit; i++) {
            if (number % i == 0) {
                if (isPrimeNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isPrimeNumber(long n) {
        for (long i = 2; i < (Math.sqrt(n) + 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
