import java.security.SecureRandom;
import java.util.Scanner;

public class PassGenerator {

        private static final String passCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!?#%.,<>*";

        public static String generatePass(int comprimento) {

            SecureRandom numberGenerator = new SecureRandom();
            StringBuilder password = new StringBuilder(comprimento);

            for (int i = 0; i < comprimento; i++) {
                int index = numberGenerator.nextInt(passCharacters.length());
                password.append(passCharacters.charAt(index));

            }

            return password.toString();
        }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How long do you wish your password?");
    int passowordLength = scanner.nextInt();

    String password = generatePass(passowordLength);
    System.out.println("Password generated: " + password);

    scanner.close();
}

    }