import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio09SomaMatriz {public static void main(String[] args) {
    //Criando uma lista de números aleatórios para o usuário
    List<Integer> numLinhaI = new ArrayList<>();
    List<Integer> numLinhaJ = new ArrayList<>();

    //Povoando a lista I com conteúdo aleatório
    for (int i = 0; i < 11; i++) {
        int randomNum = (int) (Math.random() * 100);
        numLinhaI.add(randomNum);
    }

    //Povoando a lista J com conteúdo aleatório
    for (int j = 0; j < 11; j++) {
        int randomNum = (int) (Math.random() * 100);
        numLinhaJ.add(randomNum);
    }

    //Criando a matriz
    int[][] matrixIJ = new int[2][11];

    //Povoando a matrix
    for (int k = 0; k <= 1; k++) {
        if (k == 0) {
            for (int l = 0; l < 11; l++) {
                matrixIJ[k][l] = numLinhaI.get(l);
            }
        } else {
            for (int m = 0; m < 11; m++) {
                matrixIJ[k][m] = numLinhaJ.get(m);
            }
        }

    }



    //Somando os conteúdo da matrix
    int somaMatriz = 0;
    for (int m = 0; m <= 1; m++) {
        if (m == 0) {
            for (int l = 0; l < 11; l++) {
               somaMatriz = somaMatriz + matrixIJ[m][l];
            }
        } else {
            for (int l = 0; l < 11; l++) {
                somaMatriz = somaMatriz + matrixIJ[m][l];
            }
        }

    }

    System.out.println("Linha I " + numLinhaI);
    System.out.println("Linha J " + numLinhaJ);
    System.out.println("---------------------");
    System.out.println("A soma dos valores da matris é: " + somaMatriz);

    }
}
