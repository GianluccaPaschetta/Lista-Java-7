import java.util.Scanner;

public class Atv30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        boolean verif = false;

        do {
            System.out.println("Escolha uma das opções: \n1 - Criptografar \n2 - Descriptografar \n3 - Sair");
            int opcoes = entrada2.nextInt();
            String frase;
            String novaFrase = "";

            if(opcoes == 1 || opcoes == 2) {
                System.out.print("Insira uma frase: ");
                frase = entrada.nextLine().toLowerCase();

                for (int i = 0; i < frase.length(); i++) {
                    char c = frase.charAt(i);

                    if (c <= 'm') c = (char) (c + 13);
                    else c = (char) (c - 13);
                    novaFrase += c;
                }
                System.out.println(novaFrase);
            } else if (opcoes == 3) {
                System.out.println("Fim do programa, obrigado");
                break;
            } else {
                System.out.println("Insira uma opção válida");
                verif = true;
                continue;
            }

            System.out.print("Deseja tentar novamente? (Sim/Não): ");
            char verifChar = entrada2.next().toLowerCase().charAt(0);
            if (verifChar == 's') verif = true;
            else System.out.println("Fim do programa");
        } while (verif);
    }
}
