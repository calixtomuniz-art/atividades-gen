package JavaTech;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */
public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Matheus Calixto Muniz", mediaFormatada;
		int idade = 25;
		float altura = (float) 1.75, nota1, nota2, nota3, media;
		
		System.out.println("Nome do Participantes: "+nome+"\nIdade: "+idade+"\nAltura: "+altura);
		Scanner read = new Scanner(System.in);
		
		System.out.print("\nDigite a primeira nota: ");
		nota1 = read.nextFloat();
		
		System.out.print("\nDigite a segunda nota: ");
		nota2 = read.nextFloat();
		
		System.out.print("\nDigite a terceira nota: ");
		nota3 = read.nextFloat();

		DecimalFormat formatter = new DecimalFormat("#.00");
		
		media = (nota1 + nota2 + nota3) / 3;
		//mediaFormatada = formatter.format(media);

		System.out.printf("\nO %s tem a média de: %.2f", nome, media);

	
		if(media >= 7 && media <= 10) {
			System.out.println("\nAlune aprovade !!!");
		}
		else if(media >= 5 && media < 7) {
			System.out.println("\nAlune de exame !!!");
		}
		else {
			System.out.println("\nAlune reprovade !!!");
		}
	}

}