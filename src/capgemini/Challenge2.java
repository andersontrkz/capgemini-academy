package capgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anderson
 */
public class Challenge2 {
    public static boolean isValidPattern(String regex, String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void passwordValidator(String password) {
        boolean isSecurePassword = true;

        if (password == null || password.length() < 6) {
            System.out.println("A senha deve possuir no mínimo 6 caracteres.");
        }

        String oneDigitRegex = "(.*\\d.*)";
        String lowerCaseRegex = "(.*[a-z].*)";
        String upperCaseRegex = "(.*[A-Z].*)";
        String caractereRegex = "(.*\\W.*)";
        
        if (!isValidPattern(oneDigitRegex, password)) {
            System.out.println("A senha deve possuir no mínimo 1 digito.");
            isSecurePassword = false;
        }

        if (!isValidPattern(lowerCaseRegex, password)) {
            System.out.println("A senha deve possuir no mínimo 1 letra em minúsculo.");
            isSecurePassword = false;
        }
        
        if (!isValidPattern(upperCaseRegex, password)) {
            System.out.println("A senha deve possuir no mínimo 1 letra em maiúsculo.");
            isSecurePassword = false;
        }
                
        if (!isValidPattern(caractereRegex, password)) {
            System.out.println("A senha deve possuir no mínimo 1 caractere especial.");
            System.out.println("Os caracteres especiais válidos são: !@#$%^&*()-+.");
            isSecurePassword = false;
        }
        
        if (isSecurePassword) {
            System.out.println("Sua senha é segura! Parabéns :D");            
        } else {
            System.out.println("Sua senha é insegura. Faça os devidos ajustes e tente novamente!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String password = input.next();
        
        passwordValidator(password);  
    }
}
