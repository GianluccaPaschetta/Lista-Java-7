import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toUpperCase();

        for (char j = 'A'; j <= 'Z'; j++) {
            int cont = 0;
            for (int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == j) cont++;
            }
            System.out.printf("%c = %d%n", j, cont);
        }
    }
}
