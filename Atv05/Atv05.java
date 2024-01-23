import java.util.Scanner;
public class Atv05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String frase = entrada.nextLine().toUpperCase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A') {
                cont++;
            }
        }
        
        System.out.println(cont);
    }
}

