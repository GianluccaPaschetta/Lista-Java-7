public class Atv03 {
    public static void main(String[] args) {
        String texto = "";
        char c = 'a';
        
        for(int i = 1; i <= 26; i++){
            texto += c + " ";
            c++;
        }
        System.out.println(texto);
    }
}

