public class Usuario {
    public static void main(String[] args) throws Exception {
        
    SmartTv smartTv = new SmartTv();

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual? " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo status --> " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo status --> " + smartTv.ligada);

    smartTv.aumentarCanal();
    System.out.println("O canal atual agora é: " + smartTv.canal);
    
    smartTv.baixarCanal();
    smartTv.baixarCanal();
    smartTv.baixarCanal();
    System.out.println("O canal atualizado é: " + smartTv.canal);

    smartTv.mudarCanal(14);
    System.out.println("O canal atual é: " + smartTv.canal);

    smartTv.baixarVolume();
    System.out.println("O atual volume é: " + smartTv.volume);

    




    }
}
