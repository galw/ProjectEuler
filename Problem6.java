/**
 * Created by galw on 8/26/15.
 */
public class Problem6 {
    public static void main(String[] args) {
        long sqrOfTheSum = 25502500;
        long sumOfTheSqr = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfTheSqr += i * i;
        }

        System.out.println(sqrOfTheSum - sumOfTheSqr);
    }
}
