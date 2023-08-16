package Collections;

// import java.util.Scanner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue01{


	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i=0;i<=10;i++) {
			fila.add(i);//adicionando elementos na fila 0 1 2 3
		}
		
		System.out.println("\nElementos da fila: "+fila);
		System.out.println("\nRemovendo elemento: "+fila.remove());//remove um elemento da fila
		System.out.println("\nElementos da fila depois de remover: "+fila);
		System.out.println("\nAdicionando o elemento 11: "+fila.add(11));
		System.out.println("\nelementos da fila depois de adicionar: "+fila);
		System.out.println("\nPegar um elemento da fila: "+fila.peek());//pegar um elemento da fila
		System.out.println("\nPegar o tamanho da fila: "+fila.size());//mostrar o tamanho da fila
		System.out.println("\nVerificar um elemento da fila: "+fila.contains(37));//verificar se contém um determinado elemento na fila
		System.out.println("\nExibir e retirar o primeiro elemento da fila: "+fila.poll());//exibe e retira o primeiro elemento da fila
		System.out.println("\nFila atual:"+fila);
		
		Iterator<Integer> iterator = fila.iterator();//criando um iterator para a fila
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLimpar a fila: ");
		fila.clear();//limpa os elementos da fila
		System.out.println(fila);
		
		System.out.println("\nVerificar se a fila está vazia: "+fila.isEmpty());//verifica se a fila está vazia

	}
}