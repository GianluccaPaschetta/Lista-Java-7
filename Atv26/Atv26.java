public class Atv26 {
    public static void main(String[] args) {
        String frase = "";
        String letrasFora = "";
        int maiorSeqRep = 0;
        int maiorSeqVog = 0;

        //Gerar letras aleatórias:
        for (int i = 1; i <= 100; i++) {
            int rng = (int) (Math.random() * 26);
            char c = (char) ('a' + rng);

            frase += c;
        }

        //Letras que não constam na frequência:
        for (char alf = 'a'; alf <= 'z'; alf++) {
            int contAlf = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == alf) contAlf++;
            }
            if (contAlf == 0) letrasFora += alf + " ";
        }

        //Maior sequencia de letras repetidas:
        for (char alf = 'a'; alf <= 'z'; alf++){
            int cont = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == alf){
                    cont++;
                    if (maiorSeqRep < cont){
                        maiorSeqRep = cont;
                    }
                } else {
                    cont = 0;
                }
            }
        }

        //Maior sequência de vogais:
        int contSeqVog = 0;
        for (int i = 0; i < frase.length() - 4; i++) {
            if (frase.charAt(i) == 'a' && frase.charAt(i+1) == 'e' && frase.charAt(i+2) == 'i' && frase.charAt(i+3) == 'o' && frase.charAt(i+4) == 'u') contSeqVog++;
        }

        //Maior sequência alfabética:
        int contSeqAlf = 0;
        int maiorSeqAlf = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(i != 0){
                char atual = frase.charAt(i);
                char anterior = frase.charAt(i - 1);
                if (atual == anterior + 1){
                    contSeqAlf++;
                    if (maiorSeqAlf < contSeqAlf){
                        maiorSeqAlf = contSeqAlf + 1;
                    }
                }else {
                    contSeqAlf = 0;
                }
            }
        }


        //Saída
        System.out.println(maiorSeqAlf);
        if (letrasFora.isEmpty()) letrasFora = "Nenhuma";
        System.out.printf("Frase aleatória: %s%nLetras fora da sequência: %s%nMaior sequência de letra repetidas: %d%nMaior sequência de vogais: %d%nMaior sequência de letras do alfabeto: %d%n", frase, letrasFora, maiorSeqRep, contSeqVog, maiorSeqAlf);
    }
}
