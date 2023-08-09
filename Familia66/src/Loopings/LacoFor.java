package Loopings;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		float n1, n2, n3, media;

		n1 = 5;
		n2 = 7;
		n3 = 10;

		media = (n1 + n2 + n3) / 3;

		System.out.println(media);
		read.close();
	}
}
