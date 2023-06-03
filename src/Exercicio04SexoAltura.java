import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio04SexoAltura {
    public static void main(String[] args) {
        System.out.println("Vamos registrar 10 pessoas, escolhendo seu sexo e altura ");
        System.out.println("Basta digitar 0 para HOMEM ou 1 para MULHER e depois sua altura (ex: 1,70):\n");

        //Capturando os dados
        Scanner entrada = new Scanner(System.in);

        int[] sexoPessoa = new int[10];
        double[] alturaPessoa = new double[10];

        int cont = 0;
        do {
            System.out.println("Sexo da pessoa nº" + (cont + 1) + " (0 para Homem / 1 para Mulher):");
            sexoPessoa[cont] = entrada.nextInt();

            System.out.println("Altura da pessoa nº" + (cont + 1) + " (ex: 1,70):");
            alturaPessoa[cont] = entrada.nextDouble();

            cont++;

            System.out.println("\n");
        } while (cont < 10);

        String sexoLetra = "";

        //Mostrando a tabela de dados inseridos
        for (int i = 0; i < 10; i++) {
            if (sexoPessoa[i] == 0) {
                sexoLetra = "H";
            } else {
                sexoLetra = "M";
            }
            System.out.println(i + " " + sexoLetra + " | " + alturaPessoa[i]);
        }

        //contando a quantidade de mulheres
        int numMulheres = 0;
        for (int j = 0; j < 10; j++) {
            if (sexoPessoa[j] == 1) {
                numMulheres = numMulheres + 1;
            }
        }

        //calculando média de altura dos homens
        double mediaAltura = 0;
        int contHomem = 0;
        for (int l = 0; l < 10; l++){
            if (sexoPessoa[l] == 0) {
                mediaAltura = mediaAltura + alturaPessoa[l];
                contHomem = contHomem + 1;
            }
        }

        //Configurando a array para ficar em ordem
        Arrays.sort(alturaPessoa);

        //Formatando saída da média de altura
        DecimalFormat fomatador = new DecimalFormat("0.00");
        mediaAltura = mediaAltura/contHomem;

        //Resultado
        System.out.println("\nA menor altura é de " + alturaPessoa[0] + "m e a maior altura é de " + alturaPessoa[9] + "m");
        System.out.println("Existem " + numMulheres + " mulheres nesse grupo.");
        System.out.println("A média da altura dos homens é de " +  fomatador.format(mediaAltura) + " nesse grupo.");
    }
}
