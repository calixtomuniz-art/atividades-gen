package JavaTech;

import java.util.Scanner;

public class Operadores01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		float salario, abono, novo_salario;
		
		System.out.print("Digite o salário: ");
		salario = read.nextFloat();
		
		System.out.print("\nDigite o abono: ");
		abono = read.nextFloat();
		
		novo_salario = salario + abono;
		System.out.printf("\nNovo Salário: R$%.2f", novo_salario);
	}

}
