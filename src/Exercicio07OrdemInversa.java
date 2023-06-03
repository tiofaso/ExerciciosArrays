import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07OrdemInversa {
    public static void main(String[] args){
        System.out.println("Vamos inverter a ordem dos números?");
        System.out.println("Digite apenas números inteiros");
        System.out.println("Quando quiser parar, digite 0");
        System.out.println("------------------------------------------");
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numerosEmOrdem = new ArrayList<>();

        int numeroDigitado;
        int podeParar = 1;
        do{
            System.out.println("Digite um número");
            numeroDigitado = entrada.nextInt();
            if(numeroDigitado == 0){podeParar = 0;}
            numerosEmOrdem.add(numeroDigitado);

        }while(podeParar != 0);

        int tamanhoLista = numerosEmOrdem.size();
        String  numerosInvertidos = "";

        //Invertendo a lista

        for(int i = tamanhoLista - 1; i >= 0; i--){
            numerosInvertidos = numerosInvertidos + " " + String.valueOf(numerosEmOrdem.get(i));
        }

        System.out.println("Você digitou os seguintes números: " + numerosEmOrdem);
        System.out.println("A ordem inversa da sua digitação é: " + numerosInvertidos);


    }
}
