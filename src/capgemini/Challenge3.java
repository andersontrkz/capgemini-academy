package capgemini;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Challenge3 {
    public static boolean isAnagram(String firstWord, String secondWord){
        if ("".equals(firstWord) || "".equals(secondWord)){
            return false;
        }
        
        String loweredFirstWord = firstWord.toLowerCase();
        String loweredSecondWord = secondWord.toLowerCase();

        
        if (loweredFirstWord.equals(loweredSecondWord)){
            return true;
        }
        
        String reversedWord = new StringBuilder(loweredSecondWord).reverse().toString();
        
        return loweredFirstWord.equals(reversedWord);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a primeira palavra: ");
        String firstWord = input.next();
        System.out.print("Digite a segunda palavra: ");
        String secondWord = input.next();
        
        System.out.println(isAnagram(firstWord, secondWord));
    }
}
