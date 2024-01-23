import java.util.Scanner;
public class Atv21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        String palavra = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            palavra += c;

            if (c == ' ') {
                System.out.println(palavra);
                palavra = "";
            }
        }
        System.out.println(palavra);
    }
}
