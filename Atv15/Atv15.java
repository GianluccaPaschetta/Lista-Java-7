import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        boolean temN = false;
        for (int i = 0; i < frase.length(); i++) {
            for (char j = '0'; j <= '9'; j++) {
                if(frase.charAt(i) == j) temN = true;
            }
        }
        if(temN) System.out.println("Tem número");
    }
}
