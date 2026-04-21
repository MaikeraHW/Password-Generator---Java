import java.security.SecureRandom;

public class PassGenerator {

        private static final String Characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!?#%.,<>*";

        public static String generatePass(int comprimento) {

            SecureRandom numberGenerator = new SecureRandom();
            StringBuilder password = new StringBuilder(comprimento);

            for (int i = 0; i < comprimento; i++) {
                int index = numberGenerator.nextInt(Characters.length());
                password.append(Characters.charAt(index));

            }

            return password.toString();
        }

public static void main(String[] args) {
    
    int passowordLength = 12;
    String password = generatePass(passowordLength);
    System.out.println("Password generated: " + password);
}

    }