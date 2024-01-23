import java.util.Scanner;
public class Atv06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toLowerCase();
        System.out.print("Digite um caractere: ");
        char c = entrada.next().toLowerCase().charAt(0);
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(c == frase.charAt(i)) cont++;
        }
        System.out.println("Aparece: " + cont);
    }
}
