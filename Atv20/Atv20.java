import java.util.Scanner;

public class Atv20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        int cont = 1;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' ') cont++;
        }
        System.out.println(cont);
    }
}
