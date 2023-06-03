import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Exercicio10MediaImpares {
    public static void main(String[] args){
        List<Integer> vetorA = new ArrayList<>();

        //Povoando a vetor A com conteúdo aleatório
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * 100);
            vetorA.add(randomNum);
        }

        //Procurando e somando os ímpares
        String numVetorA = "";
        int somaVetorA = 0;
        int achouImpar = 0;
        for (int j = 0; j < 10; j++) {
            if(vetorA.get(j) % 2 != 0){
                numVetorA = numVetorA + " " + String.valueOf(vetorA.get(j));
                somaVetorA = somaVetorA + vetorA.get(j);
                achouImpar++;
            }

        }

        System.out.println("Esses são os números do vetor A: " + vetorA);
        System.out.println("Esses são os números ímpares do vetor A: " + numVetorA);
        System.out.println("Essa é a média da soma dos números ímpares: " + (somaVetorA/achouImpar));
    }
}
