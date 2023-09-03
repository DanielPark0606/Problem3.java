/* Student Name: Daniel Park, Lab Section: 17640  */
package assignment1;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        // part of speech tagging
        MaxentTagger tagger = new MaxentTagger("english-bidirectional-distsim.tagger");
        String taggedString = tagger.tagString(sentence);
        System.out.println(taggedString);
    }
}
