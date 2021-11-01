package exercicio3;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int lotacaoAtual;

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setLotacaoAtual(int lotacaoAtual) {
        this.lotacaoAtual = lotacaoAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getLotacaoAtual() {
        return lotacaoAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.lotacaoAtual = 0;
        this.andarAtual = 0;
    }

    public void entra(){
        if (this.lotacaoAtual < capacidade){
            this.lotacaoAtual++;
        }
        else{
            System.out.println("Capacidade máxima atingida!");
        }
    }
    public void sai(){
        if(this.lotacaoAtual > 0){
            this.lotacaoAtual--;
        }
        else {
            System.out.println("Não há passageiros neste elevador.");
        }
    }
    public void sobe(){
        if(this.andarAtual < this.totalAndares){
            this.andarAtual++;
        }
        else {
            System.out.println("Andar máximo atingido!");
        }
    }
    public void desce(){
        if(this.andarAtual > 0){
            this.andarAtual--;
        }
        else {
            System.out.println("Andar mínimo atingido!");
        }
    }
}
