public class Exercicio08SomaDigitosPar {
    public static void main(String[] args){
        int[] intervalo50 = new int[151];

        //preenchendo o intervalo de 100-150
        for(int i = 100; i <= 150; i++) {
            intervalo50[i] = i;
        }

        int[] primeiroDigito = new int[151];
        int[] segundoDigito = new int[151];
        int[] terceiroDigito = new int[151];
        int[] somaDigitos = new int[151];

        //Armazenando o último dígito em separado
        for(int j = 100; j <= 150; j++){
            terceiroDigito[j] = intervalo50[j]%10;
        }

        //Armazenando o penúltimo dígito em separado
        for(int l = 100; l <= 150; l++){
            segundoDigito[l] = (intervalo50[l]/10)%10;
        }

        //Armazenando o primeiro dígito em separado
        for(int m = 100; m <= 150; m++){
            primeiroDigito[m] = 1;
        }

        //Armazenando a soma dos dígitos
        for(int n = 100; n <= 150; n++){
            somaDigitos[n] = primeiroDigito[n] + segundoDigito[n] + terceiroDigito[n];
        }
        //--
        //Imprimindo para ver se tá certo
        for(int j = 100; j <= 150; j++){
            System.out.println(intervalo50[j] + " " + primeiroDigito[j] + " " + segundoDigito[j] + " " + terceiroDigito[j] + " = " + somaDigitos[j]);
        }

        //Separando os números com soma de dígitos pares
        String numerosEscolhidos = "";
        for(int o = 100; o <= 150; o++){
            if(somaDigitos[o]%2 == 0){
                numerosEscolhidos = numerosEscolhidos + " " + String.valueOf(intervalo50[o]);
            }
        }

        System.out.println("\nOs números cuja a soma dos dígitos são pares são os seguintes:");
        System.out.println(numerosEscolhidos);

    }
}
