package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Selecao extends Controle{
    List<Caminhao> listaCaminhoes = new ArrayList<Caminhao>();

    public List<Caminhao> insereCaminhao(){
        String escolhaTipo = "flag";
        while(!escolhaTipo.equals("fim")){
            escolhaTipo = leString();
            if (!escolhaTipo.equals("fim")) {
                int escolhaQuantidade = leInteiro();
                List<Pluviometro> listaPluviometro = leListaPluviometro(escolhaQuantidade);
                this.listaCaminhoes.add(new Caminhao(escolhaTipo, escolhaQuantidade, listaPluviometro));
            }
        }
        return this.listaCaminhoes;
    }

    public Caminhao selecionaCaminhao(){
        insereCaminhao();
        int maiorValor = 0;
        Caminhao maiorCaminhao = new Caminhao();
        for(Caminhao caminhao: this.listaCaminhoes) {
            if(caminhao.getMililitrosTransportados() > maiorValor){
                maiorValor = caminhao.getMililitrosTransportados();
                maiorCaminhao = caminhao;
            }
        }
        return maiorCaminhao;
    }

    public List<Pluviometro> leListaPluviometro(int escolhaQuantidade) {
        List<Pluviometro> listaPluviometro = new ArrayList<Pluviometro>();
        for(int i=0; i < escolhaQuantidade; i++){
            listaPluviometro.add(new Pluviometro(leString().toUpperCase().replaceAll(" ", "")));
        }
        return listaPluviometro;
    }
}

