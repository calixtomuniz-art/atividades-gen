package JavaTech;

import java.util.Scanner;

//Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido.

public class Operadores03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		float salario_bruto, adicional_noturno, horas_extras, descontos, salario_liquido;
		
		System.out.print("Digite o salário bruto: R$");
		salario_bruto = read.nextFloat();
		System.out.print("Digite o adicional noturno: R$");
		adicional_noturno = read.nextFloat();
		System.out.print("Digite as quantidade de horas extras: ");
		horas_extras = read.nextFloat();
		System.out.print("Digite os descontos: R$");
		descontos = read.nextFloat();
		
		salario_liquido = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		System.out.printf("\nO salario líquido é R$ %.2f", salario_liquido);
		
	}

}