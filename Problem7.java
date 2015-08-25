/**
 * Created by galw on 8/26/15.
 */
public class Problem7 {
    public static void main(String[] args) {
        int counter = 1;
        long prime = 0l;
        long maybePrime = 1;

        while (counter <= 10001) {
            if (isPrime(maybePrime)) {
                prime = maybePrime;
                counter++;
            }
            maybePrime++;
        }
        System.out.println(prime);
    }

    public static boolean isPrime(long n) {
        long lim = ((long) Math.sqrt(n)) + 1;

        for (long i = 2; i <= lim; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
