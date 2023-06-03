import java.util.Scanner;

//Usuário digita dois números e ele inverte a ordem
public class Exercicio03OrdemDecrecente {
    public static void main(String[] args){
        System.out.println("Digite dois números diferentes que eu irei colocá-los em ordem decrescente");
        System.out.println("--------------------------------------------------------------------------\n");

        System.out.println("Digite o primeiro número:");
        Scanner entrada = new Scanner(System.in);

        int numPrimeiro = entrada.nextInt();


        System.out.println("Digite o segundo número:");
        int numSegundo = entrada.nextInt();

        //Verificando se os números são iguais

        int ehIgual = 0;

        do{
            if(numPrimeiro != numSegundo){ehIgual = 1;}
            else{
                System.out.println("Os números não podem ser iguais!");
                System.out.println("Digite o segundo número:");
                numSegundo = entrada.nextInt();
            }
        }while(ehIgual == 0);

        System.out.println("Os números digitados foram: " + numPrimeiro + " e " + numSegundo);

        if(numPrimeiro > numSegundo){
            System.out.println("A ordem decrescente é " + numSegundo + " " + numPrimeiro);
        }else{
            System.out.println("A ordem decrescente é " + numPrimeiro + " " + numSegundo);
        }
    }
}
