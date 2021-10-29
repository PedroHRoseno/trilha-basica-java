import exercicio1.Pessoa;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Pessoa pedro = new Pessoa();
        pedro.setNome("Pedro Roseno");
        pedro.setAltura(175);
        pedro.setData(LocalDate.of(2000, 7, 24));
        System.out.println(pedro.calculaIdade());
    }
}
