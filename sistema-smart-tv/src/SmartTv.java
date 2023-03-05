public class SmartTv {
    boolean ligada = false;
    int canal = 5;
    int volume = 12;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void avancarCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
