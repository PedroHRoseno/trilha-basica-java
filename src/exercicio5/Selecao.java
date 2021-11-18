package exercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Selecao extends Controle{
    List<Caminhao> listaCaminhoes = new ArrayList<>();

    public void insereCaminhao(){
        String escolhaTipo = "flag";
        while(!escolhaTipo.equals("fim")){
            System.out.println("Escolha o tipo de caminhão (alfa, beta ou fim para sair): ");
            escolhaTipo = leString();
            if (!escolhaTipo.equals("fim")) {
                System.out.println("Digite a quantidade de pluviometros a ser transportada: ");
                int escolhaQuantidade = leInteiro();
                List<Pluviometro> listaPluviometro = leListaPluviometro(escolhaQuantidade);
                this.listaCaminhoes.add(new Caminhao(escolhaTipo, escolhaQuantidade, listaPluviometro));
            }
        }
    }

    public Caminhao selecionaCaminhao(){
        insereCaminhao();
        this.listaCaminhoes.sort(Comparator.comparingInt(Caminhao::getMililitrosTransportados));
        return this.listaCaminhoes.get(this.listaCaminhoes.size() - 1);
    }

    public List<Pluviometro> leListaPluviometro(int escolhaQuantidade) {
        List<Pluviometro> listaPluviometro = new ArrayList<>();
        for(int i=0; i < escolhaQuantidade; i++){
            System.out.println("Digite o tipo de pluviometro(A, B ou C): ");
            listaPluviometro.add(new Pluviometro(leString().toUpperCase().replaceAll(" ", "")));
        }
        return listaPluviometro;
    }
}

