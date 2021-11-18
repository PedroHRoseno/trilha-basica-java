package exercicio5;

import java.util.List;

public class Caminhao {
    private String tipo;
    private int quantidade;
    private List<Pluviometro> listaPluviometro;
    private int mililitrosTransportados = 0;

    public Caminhao(){

    }

    public Caminhao(String tipo, int quantidade, List<Pluviometro> listaPluviometro){
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.listaPluviometro = listaPluviometro;
        calcularMililitrosTransportados();
    }
    
    public void calcularMililitrosTransportados(){
        this.listaPluviometro.forEach(pluviometro -> this.mililitrosTransportados += pluviometro.getMililitros());
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setListaPluviometro(List<Pluviometro> listaPluviometro) {
        this.listaPluviometro = listaPluviometro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMililitrosTransportados() {
        return mililitrosTransportados;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public List<Pluviometro> getListaPluviometro() {
        return listaPluviometro;
    }

    public String retornaInformacoes(){
        return "Tipo: " + this.tipo + "\n" + "Volume transportado: " + this.getMililitrosTransportados();
    }
}
