import java.util.Scanner;

public class Atv24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Forneça uma sequencia de 0 e 1: ");
        String frase = entrada.nextLine();
        int cont = 0;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < frase.length(); i++) {
            if (maior < cont){
                maior = cont;
            }
            if (frase.charAt(i) == '1') {
                cont++;
            }
            else {
                cont = 0;
            }
        }
        if (frase.charAt(frase.length() - 1) == '1') System.out.println(++maior);
        else System.out.println(maior);
    }
}
