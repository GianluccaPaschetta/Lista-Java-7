import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Atv17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe uma frase: ");
        String frase1 = entrada.nextLine().toLowerCase();
        System.out.print("Informe outra frase: ");
        String frase2 = entrada.nextLine().toLowerCase();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        String aux;
        boolean iguais = true;

        if(frase1.length() < frase2.length()){
            aux = frase1;
            frase1 = frase2;
            frase2 = frase1;
        }

        if (frase2.length() < frase1.length()){
            iguais = false;
        }

        if(iguais){
            for (int i = 0; i < frase1.length(); i++) {
                if(frase1.charAt(i) != frase2.charAt(i)){
                    iguais = false;
                    break;
                }
            }
        }

        if (iguais) System.out.println("igual");
    }
}
