import java.util.Scanner;

public class Atv22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = "mariana";
        System.out.print("Digite uma palavra: ");
        String palavra = "ana";

        String novaPalavra = "";
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (novaPalavra.length() < palavra.length()){
                novaPalavra += frase.charAt(i);
            }
        }

        for (int i = 0; i < frase.length(); i++) {
            if(novaPalavra.equals(palavra)){
                cont++;
            }
            if (novaPalavra.length() == frase.length() - i){
                break;
            }
            novaPalavra += frase.charAt(novaPalavra.length() + i);
            novaPalavra = novaPalavra.substring(1);
        }
        System.out.println(novaPalavra);
        System.out.println(cont);
    }
}
