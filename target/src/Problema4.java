public class Problema4 {
    //TODO:
    /*
    4)Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as
     lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor
     controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor
     controla cada lâmpada?
     */
    public void problemaLampada(){
        System.out.println("------------  PROBLEMA 4  ------------");
        System.out.println("Eu ligo o primeiro dos interruptores e espero um tempo. Após passar algum tempo, desligo o primeiro interruptor \n" +
                "e ligo o segundo. Então, vou até uma das salas. Se a lâmpada estiver desligada e quente, corresponde ao primeiro interruptor. \n" +
                "Entretanto, se a luz estiver apagada e fria, corresponde ao terceiro. Se a luz estiver acesa, eu só preciso gastar a minha \n" +
                "segunda ida e ir em outra sala e seguir a mesma lógica. Assim, consigo descobrir a ordem certa utilizando apenas 2 idas.");

    }
}
