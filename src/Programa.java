import exercicio1.Pessoa;
import exercicio2.Agenda;
import exercicio3.Elevador;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        //Exercício 1
        /*
        Pessoa pedro = new Pessoa();
        pedro.setNome("Pedro Roseno");
        pedro.setAltura(175);
        pedro.setData(LocalDate.of(2000, 7, 24));
        System.out.println(pedro.calculaIdade());
         */
        //Exercício2
        /*
        Pessoa pessoa1 = new Pessoa("Pedro Roseno", LocalDate.of(2000, 7, 24), 175);
        Pessoa pessoa2 = new Pessoa("José", LocalDate.of(1974, 7, 18), 180);
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa(pessoa1);
        agenda.armazenaPessoa(pessoa2);
        System.out.println(agenda.getAgendaPessoas()[0].getNome());
        System.out.println(agenda.getAgendaPessoas()[1].getNome());
        agenda.removePessoa("Pedro Roseno");
        System.out.println(agenda.getAgendaPessoas()[0]);
        System.out.println(agenda.buscaPessoa("José"));
        agenda.armazenaPessoa(pessoa1);
        System.out.println(agenda.imprimeAgenda());
        System.out.println(agenda.imprimePessoa(0));
         */
        //Exercício 3
        Elevador elevador1 = new Elevador(10, 5);
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();
        System.out.println(elevador1.getLotacaoAtual());
        elevador1.sobe();
        elevador1.sobe();
        System.out.println(elevador1.getAndarAtual());
        elevador1.sai();
        System.out.println(elevador1.getLotacaoAtual());
        elevador1.desce();
        elevador1.desce();
        System.out.println(elevador1.getAndarAtual());
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();
        elevador1.desce();



    }
}
