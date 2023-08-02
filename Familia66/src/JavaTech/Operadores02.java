package JavaTech;

import java.util.Scanner;

public class Operadores02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		float n1, n2, n3, n4, media;
		
		System.out.print("Digite a primeira nota: ");
		n1= read.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		n2 = read.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		n3 = read.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		n4 = read.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("\nA média final é: %.2f", media);
	}

}
