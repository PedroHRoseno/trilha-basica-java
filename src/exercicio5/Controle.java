package exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controle {

    public static String leString(){
        Scanner input = new Scanner(System.in);
        return input.next().toLowerCase().replaceAll(" ", "");

    }
    public static int leInteiro(){
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        } catch (InputMismatchException ex){
            throw new InputMismatchException("Você deve digitar um inteiro");
        }

    }

}
