public class Atv02 {
    public static void main(String[] args) {
        String texto = "";
        char c = 'A';
        
        for(int i = 1; i <= 26; i++){
            texto += c + " ";
            c++;
        }
        System.out.println(texto);
    }
}

