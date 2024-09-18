public class smartTv {
  boolean ligada = false;
  int canal = 1;
  int volume =20;

  public void ligar(){
    ligada = true;
  }

  public void desligar(){
    ligada = false;
  }

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Mudando o canal para: " + canal);
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando volume para: " + volume);
  }

  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para: " + volume);

  }
}
