public class Problema5 {
    public void inverteString(String s){
        char[] caracteres = s.toCharArray();
        int inicio = 0;
        int fim = caracteres.length -1;

        while(inicio < fim){
            char atual = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim]=atual;

            inicio++;
            fim--;
        }
        System.out.println("Palavra invertida: "+new String(caracteres));
    }
}
