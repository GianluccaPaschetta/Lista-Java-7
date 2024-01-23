package Atv28;
import java.util.Scanner;

public class Atv28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String frase = scanner.nextLine();

        String metade1 = "";
        String metade2 = "";
        String novaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            metade1 = frase.substring(0, frase.length() / 2);
            metade2 = frase.substring(frase.length() / 2);
        }
        for (int j = 0; j < frase.length() / 2; j++) {
            char c1 = metade1.charAt(j);
            char c2 = metade2.charAt(j);
            novaFrase += c1;
            novaFrase += c2;
        }
        System.out.println(novaFrase);
        scanner.close();
    }
}
