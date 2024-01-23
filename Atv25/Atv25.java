import java.util.Scanner;

public class Atv25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite uma senha: ");
            String senha = entrada.nextLine();

            int contL = 0;
            int contN = 0;
            int contS = 0;

            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (Character.isAlphabetic(c)) contL++;
                if (Character.isDigit(c)) contN++;
                if (!Character.isLetterOrDigit(c)) contS++;
            }

            if (contL >= 3 && contN >= 3 && contS >= 2 && senha.length() >= 10) System.out.println("Senha aprovada!");
            else System.out.println("Senha reprovada!");
        } while (true);

    }
}
