package LacoCondicional;

//2) - Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. 
import java.util.Scanner;

public class CondicionalIf02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int numero; 
		System.out.print("Digite um número: ");
		numero = read.nextInt();
		
		if ((numero % 2) == 0){
			System.out.printf("O número %d é par ", numero);
		} else {
			System.out.printf("O número %d é ímpar ", numero);
		}
		if (numero >= 0) {
			System.out.printf("e positivo!");
		} else {
			System.out.printf("e negativo!");
		}
		
	}

}