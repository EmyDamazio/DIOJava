public class SmartTv {
    boolean ligada = false;
    int canal = 10;
    int volume = 23;

public void ligar () {
    ligada = true;
}
public void desligar () {
    ligada = false;
}


public void aumentarCanal () {
    canal++;
}
public void baixarCanal () {
    canal--;
}
public void mudarCanal (int novoCanal) {
canal = novoCanal;
}


public void aumentarVolume () {
    volume++;
}
public void baixarVolume () {
    volume--;
}
}