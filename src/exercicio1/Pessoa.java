package exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private LocalDate data;
    private int altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public int getAltura() {
        return altura;
    }

    public int calculaIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(this.data, dataAtual).getYears();
    }
}
