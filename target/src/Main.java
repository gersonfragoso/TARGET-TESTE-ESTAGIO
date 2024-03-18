import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //iniciar o scanner para a questão 5;
        Scanner sc = new Scanner(System.in);

        //PROBLEMA 1: CASO QUERIA TESTAR OUTRO RESULTADO SO TROCAR OS VALORES;
        Problema1 problema1 = new Problema1();
        problema1.soma(13, 0);
        System.out.println();


        //PROBLEMA 2: CASO QUERIA TESTAR OUTRO RESULTADO SO TROCAR O VALOR;
        Problema2 problema2 = new Problema2();
        problema2.returnVerifica(12);
        System.out.println();


        //PROBLEMA 3: TEM A EXPLICAÇÃO DE COMO CHEGUEI NO RESULTA DENTRO DA CLASSE PROBLEMA3;
        Problema3 problema3 = new Problema3();
        problema3.resposta3();
        System.out.println();


        //PROBLEMA 4:
        Problema4 problema4 = new Problema4();
        problema4.problemaLampada();
        System.out.println();


        //PROBLEMA 5:
        System.out.println("------------  PROBLEMA 5  ------------");
        System.out.println();
        Problema5 problema5 = new Problema5();
        System.out.println("Informe a palavra: ");
        String s = sc.next();
        problema5.inverteString(s);



    }

}
