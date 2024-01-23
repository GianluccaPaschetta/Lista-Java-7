import java.util.Scanner;

public class Atv27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra1 = entrada.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra2 = entrada.nextLine();
        String novaPalavra = "";

        if (palavra1.length() != palavra2.length()) System.out.println("Erro! Entradas de tamanhos diferentes");
        else{
            for (int i = 0; i < palavra2.length(); i++) {
                char c1 = palavra1.charAt(i);
                char c2 = palavra2.charAt(i);

                novaPalavra += c1;
                novaPalavra += c2;
            }
            System.out.println(novaPalavra);
        }
    }
}
