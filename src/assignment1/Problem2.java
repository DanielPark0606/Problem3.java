/* Student Name: Daniel Park, Lab Section: 17640  */
package assignment1;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Problem2 {
    public void string_char(String s){
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()){
            int tokenvalue = 0;
            String token = tokenizer.nextToken();
            String lowercase_token = token.toLowerCase();
            for(int i = 0; i < token.length(); i++){
                int character = lowercase_token.charAt(i);
                if('a'<= character && character <= 'z'){
                    tokenvalue += character - 'a' + 1;
                }
            }
            if(tokenvalue == 100){
                System.out.println(token);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Problem2 p2 = new Problem2();
        String s2 = scanner.nextLine();
        p2.string_char(s2);

    }
}
