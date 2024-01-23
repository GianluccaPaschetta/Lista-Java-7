import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase");
        String frase = entrada.nextLine();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                if(frase.charAt(i) == j) cont++;
            }
        }
        System.out.println(cont);
    }
}
