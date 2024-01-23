import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma sequencia binaria: ");
        String frase = entrada.nextLine();

        boolean eh = false;
        if (frase.length() == 8){
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (c == '0' || c == '1'){
                    eh = true;
                }
            }
        }
        if (eh) System.out.println("É binário");
        else System.out.println("Não é binário");
    }
}
