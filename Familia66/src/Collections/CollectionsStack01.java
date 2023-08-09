package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class CollectionsStack01 {
	public static void main(String[] args) {

        HashSet<Integer> options = new HashSet<>();
        options.add(1);
        options.add(2);
        options.add(3);
        options.add(0);

		Stack<String> pilha = new Stack<String>();
        Scanner leia = new Scanner(System.in);
        String option, livro;
        int op = -1;

        do{
            System.out.println("\n\t\tMenu de opções");
            System.out.print("\n----------------------------------------------------");
            System.out.print("\n1 - Adicionar Livro na pilha");
            System.out.print("\n2 - Listar todos os Livros");
            System.out.print("\n3 - Retirar Livro da pilha");
            System.out.print("\n0 - Sair");
            System.out.print("\n----------------------------------------------------");
            System.out.print("\nDigite a sua opção: ");
            option = leia.nextLine();

            try{
                op = Integer.parseInt(option);
                if (options.contains(op)){                
                    switch(op){
                        case 1:
                            System.out.print("\nDigite o nome do Livro que deseja adicionar: ");
                            livro = leia.nextLine();
                            pilha.push(livro);
                            System.out.println("\nLivro adicionado !");
                        break;
                        
                        case 2:
                            Iterator<String> iterator =  pilha.iterator();
                            while(iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                        break;
                        
                        case 3:
                            pilha.pop();
                            System.out.println("\nUm livro foi retirado da pilha !");
                            System.out.println(pilha);
                        break;
                        
                        case 0:
                            System.out.println("\nPrograma finalizado !");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\nPor gentileza, digite uma opção válida !!!");
            }

        }while(op != 0);
        leia.close();
	}
}
