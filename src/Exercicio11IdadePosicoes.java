import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio11IdadePosicoes {
    public static void main(String[] args){
        System.out.println("Digite a idade de 10 pessoas\n");
        Scanner entrada = new Scanner(System.in);

        List<Integer> idadePessoas = new ArrayList<>();

        //Gravando as idades
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a idade da " + (i+1) + "ª pessoa");
            idadePessoas.add(entrada.nextInt());
        }

        //Separando vetor para achar a menor e maior idade
        int[] vetorIdade = new int[10];

        for(int j = 0; j < 10; j++){
            vetorIdade[j] = idadePessoas.get(j);
        }

        Arrays.sort(vetorIdade);

        int achouMenor = 0;
        int achouMaior = 0;

        //Procurando a posição da menor idade
        for(int l = 0; l < 10; l++) {
            if ((vetorIdade[0] == idadePessoas.get(l))) {
                achouMenor = l + 1;
            }
        }

        //Procurando a posição da maior idade
        for(int m = 0; m < 10; m++){
            if(vetorIdade[9] == idadePessoas.get(m)){
               achouMaior = m;
            }
        }

        System.out.println("As idades digitadas foram as seguintes: " + idadePessoas);
        System.out.println("A menor idade da lista é " + vetorIdade[0] + " e a mesma se encontra na " + achouMenor + "ª posição digitada");
        System.out.println("A maior idade da lista é " + vetorIdade[9] + " e a mesma se encontra na " + achouMaior + "ª posição digitada");


    }
}
