import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Programa para remove um elemento específico em uma lista
public class Exercicio01RemoveElemento {
    public static void main(String[] args){
        //Criando uma lista de números aleatórios para o usuário
        List<Integer> numLista = new ArrayList<>();

        //Povoando a lista com conteúdo aleatório
        for(int i=0; i<10;i++){
             int randomNum = (int)(Math.random()*100);
             numLista.add(randomNum);
        }

        System.out.println("Escolha número da lista (entre colchetes) a seguir para ser removido:\n");
        //Exibindo a lista de números para o usuário
        for(int j=0; j<10;j++){
             System.out.println("número[" + j + "] " + numLista.get(j));
        }

        //Usuário escolhendo qual elemento remover
        System.out.println("\nDigite o número do elemento que você quer remover:");
        Scanner entrada = new Scanner(System.in);
        int numEscolhido = entrada.nextInt();

        System.out.println("Você escolheu o número[" + numEscolhido + "] cujo o valor era " + numLista.get(numEscolhido) +" foi removido da lista\n");

        //removendo o elemento que o usuário solicitou
        numLista.remove(numEscolhido);

        //Exibindo a lista de números para o usuário
        for(int l=0; l<9;l++){
            System.out.println("número[" + l + "] " + numLista.get(l));
        }

    }
}
