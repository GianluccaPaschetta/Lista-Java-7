import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        boolean maiu = true;

        for (int i = 0; i < frase.length(); i++) {
            if(!Character.isUpperCase(frase.charAt(i))){
                maiu = false;
                break;
            }
        }
        if (maiu) System.out.println("Todas letras são maiúsculas");
    }
}
