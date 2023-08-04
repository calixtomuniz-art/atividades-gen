package ArrayVetoresMatrizes;

import java.util.Scanner;

public class ArrayVetor01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int [] vetor = {2,5,1,3,4,9,7,8,10,6};
        int num;
        
        System.out.print("Digite o número que você deseja encontrar: ");
        num = read.nextInt();
        if(num > 0 && num <= 10){
            System.out.println("Digite o número que você deseja encontrar: ");
            for(int i = 0; i < vetor.length; i++){
                if (num == vetor[i]){
                    System.out.printf("O número %d está localizado na posição: %d", num, i);
                }
            }
        }else{
            System.out.printf("O número %d não foi encontrado", num);
        }
    }
}
