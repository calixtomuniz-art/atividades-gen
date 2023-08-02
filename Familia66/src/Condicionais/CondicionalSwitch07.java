package Condicionais;

import java.util.Scanner;

//Crie uma calculadora simples
public class CondicionalSwitch07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float numero1, numero2, resultado;
		int operador;
		
		System.out.printf("Digite o valor do primeiro número: ");
		numero1 = read.nextFloat();
		
		System.out.print("\nDigite o valor do segundo número: ");
		numero2 = read.nextFloat();
		
		System.out.println("\n\tOperações !!! ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.print("\nDigite a operação desejada: ");
		operador = read.nextInt();
		
		switch(operador) {
			case 1:
				resultado = numero1 + numero2;
				System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, resultado);
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, resultado);
				break;
			default:
				System.out.println("Operação Inválida !");
		}
	}
}
