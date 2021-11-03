package exercicio5;

public class Pluviometro {
    private String tipo;
    private int mililitros;

    public Pluviometro(String tipo){
        this.tipo = tipo;
        decideVolume();
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMililitros() {
        return mililitros;
    }

    public String getTipo() {
        return tipo;
    }

    public void decideVolume(){
        switch (this.tipo) {
            case "A" -> setMililitros(100);
            case "B" -> setMililitros(200);
            case "C" -> setMililitros(300);
            default -> setMililitros(50);
        }
    }
}
