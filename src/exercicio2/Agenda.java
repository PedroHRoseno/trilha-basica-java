package exercicio2;
import exercicio1.Pessoa;

public class Agenda {
    private Pessoa agendaPessoas[] = new Pessoa[10];

    public Pessoa[] getAgendaPessoas() {
        return agendaPessoas;
    }

    public void armazenaPessoa(Pessoa pessoa) {
        int contador = 0;
        boolean flagAdicionado = false;
        while (contador < 10 && flagAdicionado == false) {
            if (this.agendaPessoas[contador] == null){
                agendaPessoas[contador] = pessoa;
                flagAdicionado = true;
            }
            contador++;
        }
    }

    public void removePessoa(String nome){
        int contador = 0;
        while (contador < 10 ) {
            if (this.agendaPessoas[contador] != null){
                if (agendaPessoas[contador].getNome() == nome){
                    agendaPessoas[contador] = null;
                }
            }
            contador++;
        }
    }

    public int buscaPessoa(String nome){
        int contador = 0;
        while (contador < 10 ) {
            if (this.agendaPessoas[contador] != null){
                if (agendaPessoas[contador].getNome() == nome){
                    return contador;
                }
            }
            contador++;
        }
        return 9999;
    }

    public String imprimeAgenda(){
        String text = "";
        int contador = 0;
        while (contador < 10 ) {
            if (this.agendaPessoas[contador] != null){
                text += "Número: " + contador + "\n" + "Nome: " + this.agendaPessoas[contador].getNome() + "\n" + "Altura: " + this.agendaPessoas[contador].getAltura() + "\n" + "Data de nascimento: " + this.agendaPessoas[contador].getData() + "\n" + "\n";
            }
            contador++;
        }
        return text;
    }

    public String imprimePessoa(int index){
        int contador = 0;
        while (contador < 10 ) {
            if (contador == index){
                return "Número: " + contador + "\n" + "Nome: " + this.agendaPessoas[contador].getNome() + "\n" + "Altura: " + this.agendaPessoas[contador].getAltura() + "\n" + "Data de nascimento: " + this.agendaPessoas[contador].getData() + "\n" + "\n";
            }
            contador++;
        }
        return "Pessoa não está na lista";
    }
}
