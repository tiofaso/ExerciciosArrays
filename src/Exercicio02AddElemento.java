import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02AddElemento {
    public static void main(String[] args){
        //Criando uma lista de números aleatórios para o usuário
        List<Integer> numLista = new ArrayList<>();

        //Povoando a lista com conteúdo aleatório
        for(int i=0; i<10;i++){
            int randomNum = (int)(Math.random()*100);
            numLista.add(randomNum);
        }

        System.out.println("Escolha um número (entre colchetes) da lista a seguir para adicionar um novo elemento:\n");
        //Exibindo a lista de números para o usuário
        for(int j=0; j < 10;j++){
            System.out.println("número[" + j + "] " + numLista.get(j));
        }

        //Usuário escolhendo qual elemento remover
        System.out.println("\nDigite a posição do elemento que você quer adicionar:");
        Scanner entrada = new Scanner(System.in);
        int numEscolhido = entrada.nextInt();

        System.out.println("\nDigite o valor do elemento nº" + numEscolhido);
        int numEscolhidoValor = entrada.nextInt();

        //Adicionando o elemento que o usuário solicitou
        numLista.add(numEscolhidoValor);

        System.out.println("O número[" + numEscolhido + "] = " + numEscolhidoValor +" foi adicionado à lista\n");

        //Remontando a lista para adicionar o valor no local escolhido
        for(int l = 10; l > numEscolhido; l--){
            numLista.set(l, numLista.get(l-1));
        }

        numLista.set(numEscolhido,numEscolhidoValor);

        //Exibindo a lista de números para o usuário
        for(int l=0; l <= 10;l++){
            System.out.println("número[" + l + "] " + numLista.get(l));
        }

    }

}
