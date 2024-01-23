import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        System.out.print("Digite uma letra: ");
        char letra = entrada.next().charAt(0);
        String novaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra){
                novaFrase += '*';
            } else {
                novaFrase += frase.charAt(i);
            }
        }
        System.out.println(novaFrase);
    }
}
