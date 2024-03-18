public class Problema1 {
    //TODO:
    /*
    1) Observe o trecho de código abaixo:
    int INDICE = 13, SOMA = 0, K = 0;
    enquanto K < INDICE faça{
    K = K + 1;
    SOMA = SOMA + K;
    }
    imprimir(SOMA);
    Ao final do processamento, qual será o valor da variável SOMA?
    */

    public void soma(int indice, int k){
        System.out.println("------------  PROBLEMA 1  ------------");
        int somaT = 0;
        while (k < indice){
            k+=1;
            somaT+=k;
        }
        System.out.println("Resultado = "+somaT);;
    }
}

