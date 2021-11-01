package exercicio4;

public class Televisao {
    int canal = 1;
    int volume = 10;
    boolean ligada = false;

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
