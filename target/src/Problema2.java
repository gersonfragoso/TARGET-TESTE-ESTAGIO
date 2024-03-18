import java.util.Scanner;

public class Problema2 {
    //TODO:
    /*
    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
    valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
    informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou
    não a sequência.
     */
    public void returnVerifica(int N) {
        System.out.println("------------  PROBLEMA 2  ------------");

        if (verificaFibonacci(N)) {
            System.out.println("O numero: "+ N+"," + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O numero: "+N+"," + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int N) {
        int a = 0;
        int b = 1;

        while (b <= N) {
            if (b == N) {
                return true;
            }
            int atual = b;
            b = a + b;
            a = atual;
        }
        return false;
    }
}

