/**
 * Created by galw on 02/11/2015.
 */
public class Problem9 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int lim = 1000;

        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                for (int k = 0; k < lim; k++) {
                    if (isPythagoreanTriplet(i, j, k) && i + j + k == 1000) {
                        System.out.println(i * j * k);
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return a < b && b < c && a * a + b * b == c * c;
    }
}
