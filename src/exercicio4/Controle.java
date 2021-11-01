package exercicio4;

public class Controle {
    Televisao televisao;

    public Controle(Televisao televisao){
        this.televisao = televisao;
    }

    public void ligarTelevisao(){
        televisao.ligada = true;
    }
    public void trocaCanal(int numero){
        if(numero > 0) {
            televisao.setCanal(numero);
        }
        else {
            System.out.println("Canal negativo");
        }
    }
    public String mostraInformações(){
        return "Canal: " + televisao.getCanal() + "\n" + "Volume: " + televisao.getVolume();
    }

    public void aumentaCanal(){
            televisao.canal++;
    }
    public void diminuiCanal(){
        if (televisao.canal != 1){
            televisao.canal++;
        }
    }
    public void aumentaVolume(){
        if(televisao.volume < 30){
            televisao.volume++;
        }
        else{
            System.out.println("Volume máximo atingido");
        }
    }
    public void diminuiVolume(){
        if(televisao.volume > 0){
            televisao.volume--;
        }
        else{
            System.out.println("Volume mínimo atingido");
        }
    }
    public void mutarTelevisao(){
        televisao.setVolume(0);
    }

}
