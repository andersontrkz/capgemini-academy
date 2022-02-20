package capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Challenge3 {
    public static void isAnagram(String word){
        if ("".equals(word)){
            return;
        }
        
        String loweredWord = word.toLowerCase();
        
        int pairs = -1;
        String pair = "";
        List<String> list = new ArrayList<>();
        for (int index = 0; index < word.length(); index++) {
            pair = "" + loweredWord.charAt(index);
            if (!list.contains(pair)) {
                list.add(pair);
            }
            for (int index2 = index + 1; index2 < word.length(); index2++) {
                pair = pair + loweredWord.charAt(index2);
                if (!list.contains(pair)) {
                    list.add(pair);
                }
            }
        }
        
        for (int index = 0; index < word.length(); index++) {
            String reversedWord = list.get(index);
            if (list.contains(reversedWord)) {
                pairs++;
            }
        }

        System.out.println(list);
        System.out.println(pairs);

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a palavra: ");
        String word = input.next();
        
        isAnagram(word);
    }
}
