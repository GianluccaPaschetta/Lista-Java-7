import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toLowerCase();

        int contCon = 0;
        int contVog = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contVog++;
            else contCon++;
        }
        System.out.printf("Tem %d vogais na frase", contCon);
    }
}

