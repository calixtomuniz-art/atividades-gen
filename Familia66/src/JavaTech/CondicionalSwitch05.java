//5) - Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

package JavaTech;

import java.util.Scanner;

public class CondicionalSwitch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int item, qtd;
		float total, preco;
		System.out.println("\tCatálogo de protudos !!!\n");
		System.out.println("1 - Cachorro Quente\tR$10,00");
		System.out.println("2 - X - Salada\t\tR$15,00");
		System.out.println("3 - X - Bacon\t\tR$18,00");
		System.out.println("4 - Bauru\t\tR$12,00");
		System.out.println("5 - Refrigerante\tR$8,00");
		System.out.println("6 - Suco de Laranja\tR$13,00");
		
		System.out.print("\nDigite o código do produto: ");
		item = read.nextInt();
		
		System.out.print("\nDigite a quantidade desejada: ");
		qtd = read.nextInt();
		
		switch (item) {
			case 1:
				System.out.printf("\nProduto: Cachorro Quente, Quantidade: %d", qtd);
				preco = (float) 10.00;
				total = preco * qtd;
				System.out.printf("\nValor total: %.2f", total);
				break;
			case 2:
				System.out.printf("\nProduto: X - Salada, Quantidade: %d", qtd);
				preco = (float) 15.00;
				total = preco * qtd;
				System.out.printf("\nValor total: %.2f", total);
				break;
			case 3:
				System.out.printf("\nProduto: X - Bacon, Quantidade: %d", qtd);
				preco = (float) 18.00;
				total = preco * qtd;
				System.out.printf("\nValor total: %.2f", total);
				break;
			case 4:
				System.out.printf("\nProduto: Bauru, Quantidade: %d", qtd);
				preco = (float) 12.00;
				total = preco * qtd;
				System.out.printf("\nValor total: %.2f", total);
				break;
			case 5:
				System.out.printf("\nProduto: Refrigerante, Quantidade: %d", qtd);
				preco = (float) 8.00;
				total = preco * qtd;
				System.out.printf("\nValor total: %.2f", total);
				break;
			case 6:
				System.out.printf("\nProduto: Suco de Laranja, Quantidade: %d", qtd);
				preco = (float) 13.00;
				total = preco * qtd;
				System.out.printf("\nValor total: %.2f", total);
				break;
			default:
				System.out.printf("\nProduto Inválido.");
		}
		
	}

}
