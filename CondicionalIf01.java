package JavaTech;

import java.util.Scanner;

public class CondicionalIf01 {

	public static void main(String[] args) {
	    int a,b,c,r;
	    

		Scanner leia = new Scanner(System.in);
	    
	    System.out.println("Digite o número A:");
	    a = leia.nextInt();
	    System.out.println("Digite o número B:");
	    b = leia.nextInt();
	    System.out.println("Digite o número C:");
	    c = leia.nextInt();
	    
	    r = a + b;
	    
	    if (r > c) {
	    	System.out.println(b+"+"+a+"="+r+">"+c);
	    	System.out.println("A Soma de A + B é Maior do que C");
	    }
	    else if (r < c) {
	    	System.out.println(b+"+"+a+"="+r+"<"+c);
	    	System.out.println("A Soma de A + B é Menor do que C");
	    }else {
	    	System.out.println(b+"+"+a+"="+r+"="+c);
	    	System.out.println("A Soma de A + B é Igual a C");
	    }
	}
}


