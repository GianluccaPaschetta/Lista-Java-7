import java.util.Scanner;
public class Atv12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toLowerCase();
        int cont = 0;

            for (int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') cont++;
            }


        System.out.printf("Tem %d vogais na frase", cont);
    }
}

