package ArrayVetoresMatrizes;

public class ArrayMatriz04 {
    public static void main(String[] args) {
        float[][] matriz = new float[10][4];

        int colunas = 4;
        int linhas = 10;

        float[] valores = {
            4.0f, 5.0f, 7.0f, 3.0f,
            2.5f, 6.5f, 4.7f, 8.0f,
            10.0f, 8.5f, 9.5f, 8.0f,
            9.0f, 6.5f, 7.6f, 8.2f,
            5.0f, 5.0f, 5.0f, 6.3f,
            7.0f, 8.0f, 9.0f, 8.5f,
            5.5f, 3.5f, 2.5f, 1.0f,
            8.0f, 9.0f, 10.0f, 9.5f,
            5.6f, 5.8f, 6.5f, 7.0f,
            7.5f, 8.5f, 9.5f, 10.0f
        };

        int indice = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valores[indice];
                indice++;
            }
        }

        float soma, media;
        for (int i = 0; i < linhas; i++) {
            soma = 0;
            for (int j = 0; j < colunas; j++) {  
                soma += matriz[i][j];
            }
            media = (soma / colunas);
            System.out.printf(" %.2f",media);
        }
    }
}