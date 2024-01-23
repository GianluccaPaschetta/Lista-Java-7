import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        int contAlf = 0;
        int contNum = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) contNum++;
            else if (Character.isAlphabetic(frase.charAt(i))) contAlf++;
        }
        System.out.println(contNum);
        System.out.println(contAlf);
    }
}
