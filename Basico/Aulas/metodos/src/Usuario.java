public class Usuario {
  public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv(); // chamando Objeto "SmartTv" criando variavel smartTv que terá seu objeto criado

    System.out.println("TV Ligada = " + smartTv.ligada);
    System.out.println("Canal atual = " + smartTv.canal);
    System.out.println("Voume = " + smartTv.volume);
    System.out.println("-------------------");

    smartTv.ligar ();
    System.out.println("TV Ligada = " + smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    smartTv.mudarCanal(5);
    
    System.out.println("Canal atual = " + smartTv.canal);

    smartTv.desligar ();
    System.out.println("TV Ligada = " + smartTv.ligada);

    smartTv.ligar ();
    System.out.println("TV Ligada = " + smartTv.ligada);
    System.out.println("Voume = " + smartTv.volume);
    System.out.println("Canal atual = " + smartTv.canal);

    smartTv.diminuirCanal();
    System.out.println("Canal atual = " + smartTv.canal);
  }
}
