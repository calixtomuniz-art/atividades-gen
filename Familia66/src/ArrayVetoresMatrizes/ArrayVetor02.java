package ArrayVetoresMatrizes;

import java.util.Scanner;

public class ArrayVetor02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] vetor = new int[10];
        float soma = 0, media = 0;
        String elementosPares = "";
        String elementosImpares = "";

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o número do índice %d: ", i);
            vetor[i] = read.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if((i%2) != 0){
                elementosPares += " "+vetor[i];
            }
            
            if((vetor[i]%2) == 0){
                elementosImpares += " "+vetor[i];
            }

            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.print("\nElementos nos índices ímpares:"+elementosPares);
        System.out.print("\nElementos pares:"+elementosImpares);
        System.out.print("\nSoma: "+soma);
        System.out.printf("\nMédia: %.2f", media);

        read.close();
    }
}
