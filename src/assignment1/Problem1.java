/* Student Name: Daniel Park, Lab Section: 17640  */
package assignment1;
// find the greates product using at most n digits
import java.util.Scanner;
public class Problem1 {
    public int max_product(int n, String s) {
        int max_product = 0;

        for (int i = 0; i <= s.length() - n; i++) {
            int curr_product = 1;
            int num_zeroes = 0;
            for (int j = i; j < i + n; j++) {
                int digit = Character.getNumericValue(s.charAt(j));
                if (digit != 0) {
                    curr_product *= digit;
                }
                else{
                    num_zeroes++;
                }
            }
            if(num_zeroes == n){
                curr_product = 0;
            }
            max_product = Math.max(max_product, curr_product);
        }

        return max_product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        Problem1 p1 = new Problem1();
        int result = p1.max_product(n, s);
        System.out.println(result);
        scanner.close();

    }
}