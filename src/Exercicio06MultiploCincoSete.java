import java.util.Scanner;

public class Exercicio06MultiploCincoSete {
    public static void main(String[] args){
        System.out.println("Vamos descobrir se um número é múltiplo de 5 e 7?");
        System.out.println("Digite um número inteiro qualquer");

        Scanner entrada = new Scanner(System.in);

        int numeroDigitado = entrada.nextInt();;

        int multiploCinco = numeroDigitado % 5;
        int multiploSete = numeroDigitado % 7;

        if(multiploCinco == 0 && multiploSete == 0){
            System.out.println("O número " + numeroDigitado +" é múltiplo de 5 e 7");
        }else{System.out.println("O número " + numeroDigitado +" não é múltiplo de 5 e 7");}

    }
}
