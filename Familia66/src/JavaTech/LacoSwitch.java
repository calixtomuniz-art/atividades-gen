package JavaTech;

import java.util.Scanner;

public class LacoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resposta;
		boolean looping = true;
		
		Scanner read = new Scanner(System.in);
		
		while (looping) {
			
			System.out.println("\n\t\t\tMenu de elogios !");
			System.out.println("\n1 - Pessoal Incrível");
			System.out.println("2 - Pessoal Empolgado");
			System.out.println("3 - Pessoal Gentil");
			System.out.println("4 - Pessoal Top de Linha");
			System.out.print("\nDigite uma opção: ");
			
			resposta = read.nextInt();
			looping = false;
			
			switch (resposta) {
				case 1:
					System.out.println("\nPessoal Incrível !!!");
					break;
				case 2:
					System.out.println("\nPessoal Empolgado !!!");
					break;
				case 3:
					System.out.println("\nPessoal Gentíl !!!");
					break;
				case 4:
					System.out.println("\nPessoal Top de Linha !!!");
					break;
				default:
					System.out.println("\nDigite uma das opções abaixo !");
					looping = true;
					break;
			}
			
		}
	}

}
