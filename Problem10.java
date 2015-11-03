/**
 * Created by galw on 02/11/2015.
 */

public class Problem10 {
    final static int LIM = 2000000;

    public static void main(String[] args) {
        long sum = 0;
        int counter = 0;

        for (int i = 2; i < LIM; i++) {
            if (Problem3.isPrimeNumber((int)i)) {
                //System.out.printf("%d, ", i);
                sum += i;
                counter++;
            }
        }
        System.out.println();
        System.out.println("There are: " + counter + " prime numbers up to " + LIM);
        System.out.println();
        System.out.println(sum);
    }
}





