/* Student Name: Daniel Park, Lab Section: 17640  */
package assignment1;
// find the greates product using at most n digits
import java.util.Scanner;
public class Problem1 {
    public int max_product(int n, String s) {
        int max_product = -1;
        int curr_product = 1;

        for(int i = 0; i < n; i++){
            int digit = Character.getNumericValue(s.charAt(i));
            if(digit != 0) {
                curr_product *= digit;
            }
        }
        max_product = Math.max(max_product, curr_product);

        for (int i = n; i < s.length(); i++) {
            int digitToRemove = Character.getNumericValue(s.charAt(i - n));
            int digitToAdd = Character.getNumericValue(s.charAt(i));

            if (digitToRemove != 0) {
                curr_product /= digitToRemove;
            }

            if (digitToAdd != 0) {
                curr_product *= digitToAdd;
            }
            max_product = Math.max(max_product, curr_product);
            // check if digits in windows are zeroes
            if(curr_product == 0){
                return 0;
            }
        }
        return max_product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        Problem1 p1 = new Problem1();
        if (2 <= n && n <= 20) {
            int result = p1.max_product(n, s);
            System.out.println(result);
            scanner.close();
        }

    }
}