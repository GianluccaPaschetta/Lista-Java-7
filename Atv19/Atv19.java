import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toLowerCase();

        int comprimento = frase.length();

        String invertida = "";
        for (int i = 0; i < comprimento; i++) {
            char c = frase.charAt(comprimento - i - 1);
            invertida += c;

        }

         if(invertida.equals(frase)) System.out.println("É sim");
    }
}

