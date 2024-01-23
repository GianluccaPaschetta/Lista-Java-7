import java.util.Scanner;

public class Atv08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toUpperCase();

        for (char i = 'A'; i <= 'Z'; i++) {
            int cont = 0;
            for (int j = 0; j < frase.length(); j++) {
                if(frase.charAt(j) == i) cont++;
            }
            if (cont > 0) System.out.printf("%c = %d%n", i, cont);
        }
    }
}
