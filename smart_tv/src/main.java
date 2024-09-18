public class main {
  public static void main(String[] args) {
    
    smartTv smartTv = new smartTv();

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.mudarCanal(5);
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();

    System.out.println("TV ligada?" + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar ();
    System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);


  }
}
