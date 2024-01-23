import  java.util.Scanner;
public class Atv23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        String sobrenome = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            sobrenome += c;
            if (c == ' ') {
                sobrenome = "";
            }
        }
        System.out.println(sobrenome);
    }
}
