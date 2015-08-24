import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by galw on 8/24/15.
 */
public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> palindroms = new ArrayList<Integer>();
        int count = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (isPalindrome(i * j)) {
                    count++;
                    palindroms.add(i * j);
                }
            }
        }
        Collections.sort(palindroms);
        System.out.println(palindroms);

    }
    private static boolean isPalindrome(int num) {
        int[] arr = new int[6];
        int counter = 0;

        for (int i = 5; num > 0; i--) {
            arr[i] = num % 10;
            num /= 10;
            counter++;
        }

        if (counter == 5) {
            if (arr[1] == arr[5]) {
                if (arr[2] == arr[4]) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (counter == 6) {
            if (arr[0] == arr[5]) {
                if (arr[1] == arr[4]) {
                    if (arr[2] == arr[3]) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
