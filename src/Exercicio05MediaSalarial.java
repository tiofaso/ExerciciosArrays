import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05MediaSalarial {
    public static void main(String[] args){
        System.out.println("Vamos calcular a média salaria da empresa?");
        System.out.println("Digite apenas os valores dos salários.");
        System.out.println("Quando quiser parar, digite 0");
        System.out.println("------------------------------------------");
        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> salarioPessoa = new ArrayList<>();

        double salarioDigitado = -1;
        int contPessoas = 1;
        do{
            System.out.println("Digite o salário da " + contPessoas + "ª pessoa");
            salarioDigitado = entrada.nextDouble();
            salarioPessoa.add(salarioDigitado);
            contPessoas++;
        }while(salarioDigitado != 0);

        //Removendo acréscimo do contador
        contPessoas = contPessoas - 2;

        //Calculando a média dos salários
        double mediaSalario = 0;

        for(int i = 0; i < contPessoas; i++){
            mediaSalario = mediaSalario + salarioPessoa.get(i);
        }
      System.out.println("A média salarial dos " + contPessoas + " funcionários é de R$" + (mediaSalario/contPessoas));
    }
}
