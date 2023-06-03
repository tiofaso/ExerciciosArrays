import java.util.ArrayList;
import java.util.List;

public class Exercicio12VetorPartido {
    public static void main(String[] args){
        List<Integer> vetorA = new ArrayList<>();

        //Povoando a vetor A com conteúdo aleatório
        for (int i = 0; i < 21; i++) {
            int randomNum = (int) (Math.random() * 100);
            vetorA.add(randomNum);
        }

        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        String valoresVetorB = "";
        String valoresVetorC = "";

        int contPar = 0;
        int contImpar = 0;

        //povoando o vetor A com números pares
        for(int i = 0; i < 21;i++){
            if(vetorA.get(i) % 2 == 0 && contPar < 10){
                vetorB[contPar] = vetorA.get(i);
                valoresVetorB = valoresVetorB + " " + String.valueOf(vetorB[contPar]);
                contPar++;
            }
        }

        //povoando o vetor C com números impares
        for(int i = 0; i < 21;i++){
            if(vetorA.get(i) % 2 != 0 && contImpar < 10){
                vetorC[contImpar] = vetorA.get(i);
                valoresVetorC = valoresVetorC + " " + String.valueOf(vetorC[contImpar]);
                contImpar++;
            }
        }
        System.out.println("Vetor original A: " + vetorA);
        System.out.println("Vetor B só com pares: " + valoresVetorB);
        System.out.println("Vetor C só com ímpares: " + valoresVetorC);


    }
}
