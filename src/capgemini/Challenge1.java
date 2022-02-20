package capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Challenge1 {
    public static void generateCaractereLines(int linesNumber){
        List<String> linesList = new ArrayList<>();

        for (int index = 0; index < linesNumber; index++) {
            String newLine = " ".repeat(linesNumber - index) + "*".repeat(index + 1);
            linesList.add(newLine);
        }
        
        for (String line : linesList ) {
            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite a quantidade de linhas: ");
        int linesNumber = input.nextInt();
        
        generateCaractereLines(linesNumber);        
    }
    
}
