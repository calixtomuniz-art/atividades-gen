package ArrayVetoresMatrizes;

public class ArrayMatriz03 {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        String principal = "", secundaria = "";
        int soma_diagonal_principal = 0, soma_diagonal_secundaria = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2)){ // Diagonal Principal
                    principal += " "+matriz[i][j];
                    soma_diagonal_principal += matriz[i][j];
                }
                if((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)){ //Diagonal Secundária
                    secundaria += " "+matriz[i][j];
                    soma_diagonal_secundaria += matriz[i][j];
                }
            }
        }
        System.out.println("\nElementos da Diagonal Principal: "+principal);
        System.out.println("\nElementos da Diagonal Secundária: "+secundaria);
        System.out.println("\nSoma dos Elementos da Diagonal Principal: "+soma_diagonal_principal);
        System.out.println("\nSoma dos Elementos da Diagonal Secundária: "+soma_diagonal_secundaria);
    }
}