/* Student Name: Daniel Park, Lab Section: 17640  */
package assignment1;
// find the greates product using at most n digits
import java.util.Scanner;
public class Problem1 {
    public int max_product(int n, String s){
        int max_product = 0;

        for(int i = 0; i < s.length(); i++){

            int curr_product = 1;
            for(int j = i; j < i + n && j < s.length(); j++) {
                curr_product *= Character.getNumericValue(s.charAt(j));
            }
            if(curr_product > max_product){
                max_product = curr_product;
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
        // constraint s.length = 1000 and 2 <= n <= 20
        // s.length() == 1000 &&
        if (2 <= n && n <= 20) {
            int result = p1.max_product(n, s);
            System.out.println(result);
            scanner.close();
        }

    }
}