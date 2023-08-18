package ProjetoJava.ecommerce;

import ProjetoJava.ecommerce.controller.ProdutoController;
import ProjetoJava.ecommerce.model.ProdutoInstrumental;
import ProjetoJava.ecommerce.model.ProdutoServico;

import ProjetoJava.ecommerce.util.Cores;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();
		
		Scanner leia = new Scanner(System.in);

		int opcao, opc, numero, tipo;
		String nome, url, descricao, email;
		float preco;

		ProdutoInstrumental produto1 = new ProdutoInstrumental(produtos.gerarNumero(), 1, "[FREE] Instrumental 115 bpm (prod. yungbarao)", 100.00f, "https://www.youtube.com/watch?v=WTqlyS6WyXI");
		produtos.cadastrar(produto1);
		ProdutoInstrumental produto2 = new ProdutoInstrumental(produtos.gerarNumero(), 1, "[FREE] Instrumental 140 BPM A minor (prod. yungbarao)", 100.00f, "youtube.com/watch?v=mtzYqlMJ_0o");
		produtos.cadastrar(produto2);
		
		ProdutoServico produto3 = new ProdutoServico(produtos.gerarNumero(), 2, "Beat (Instrumental) por Encomenda", 50.00f, "Encomende um instrumental conforme deseja, indicando referências para a construção.");
		produtos.cadastrar(produto3);
		ProdutoServico produto4 = new ProdutoServico(produtos.gerarNumero(), 2, "Mixagem", 50.00f, "Mixagem de beats (instrumentais), vocal e de produção geral para deixar seu som mais dinâmico.");
		produtos.cadastrar(produto4);
		ProdutoServico produto5 = new ProdutoServico(produtos.gerarNumero(), 2, "Masterização", 75.00f, "Masterização final do seu som, para dar mais vida.");
		produtos.cadastrar(produto5);

		produtos.listarTodos();
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "***************************************************************");
			System.out.println("                                                     ");
			System.out.println("             ECOMMERCE DE PRODUÇÃO MÚSICAL           ");
			System.out.println("                                                     ");
			System.out.println("***************************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto Digital (Beats/Serviço)");
			System.out.println("            2 - Listar todas os Produtos              ");
			System.out.println("            3 - Buscar Produto por Número Identificador");
			System.out.println("            4 - Atualizar Dados do Produto             ");
			System.out.println("            5 - Apagar Produto                         ");
			System.out.println("            6 - Realizar Venda                         ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     "); 
			System.out.println("***************************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nEcommerce de Produção Musical - O ceú não é o limite!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "\n Criar Produto\n");

					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					
					do{
						System.out.print("\n(1) - Instrumental (Beat) \n(2) - Serviços\nDigite o número do Tipo do Produto: ");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o Preço do Produto (R$): ");
					preco = leia.nextFloat();

					switch(tipo) {
						case 1 -> {
							System.out.println("Digite o Link do Instrumental: ");
							leia.skip("\\R?");
							url = leia.nextLine();

							produtos.cadastrar(new ProdutoInstrumental(produtos.gerarNumero(), tipo, nome, preco, url));
						}
						case 2 -> {
							System.out.println("Digite a Descrição do Serviço: ");
							leia.skip("\\R?");
							descricao = leia.nextLine();
							produtos.cadastrar(new ProdutoServico(produtos.gerarNumero(), tipo, nome, preco, descricao));
						}

					}
					
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "\n Listar todos os Produtos\n");
					
					produtos.listarTodos();

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "\n Consultar dados do Produto - por número identificador\n");

					System.out.println("Digite o número identificador do Produto: ");
					numero = leia.nextInt();
					
					produtos.procurarPorNumero(numero);

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "\n Atualizar dados do Produto\n");

					System.out.println("Digite o número identificador do Produto: ");
					numero = leia.nextInt();

					if (produtos.buscarNaCollection(numero) != null) {
						System.out.println("Digite o Nome do Produto: ");
						leia.skip("\\R?");
						nome = leia.nextLine();

						do{
							System.out.println("\n(1) - Instrumental (Beat) \n (2) - Serviços\n Digite o número do Tipo do Produto: ");
							tipo = leia.nextInt();
						}while(tipo < 1 && tipo > 2);

						System.out.println("Digite o Preço do Produto (R$): ");
						preco = leia.nextFloat();

						switch(tipo) {
							case 1 -> {
								System.out.println("Digite o Link do Instrumental: ");
								leia.skip("\\R?");
								url = leia.nextLine();

								produtos.atualizar(new ProdutoInstrumental(numero, tipo, nome, preco, url));
							}
							case 2 -> {
								System.out.println("Digite a Descrição do Serviço: ");
								leia.skip("\\R?");
								descricao = leia.nextLine();
								produtos.atualizar(new ProdutoServico(numero, tipo, nome, preco, descricao));
							}
						}
					} else
						System.out.println("Produto não encontrado !");
					
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "\n Apagar Produto\n");
					
					System.out.println("Digite o número identificador do Produto: ");
					numero = leia.nextInt();
					
					produtos.deletar(numero);

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "\n Venda de Produto Digital !\n");

					
					System.out.println("(1) - Instrumentais/Beats ");
					System.out.println("(2) - Serviços (ex: Mixagem/Masterização)");
					System.out.print("Digite o tipo de produto que busca: ");
					tipo = leia.nextInt();
					
					produtos.listarPorTipo(tipo);
					
					System.out.print("\nDigite o Número Identificador do Produto desejado: ");
					numero = leia.nextInt();
					var produtoEncontrado = produtos.buscarNaCollection(numero);
					
					if (produtoEncontrado!= null){

						do{
							System.out.printf("\nO Produto: %s\nCusta (R$): %f\n\nDeseja vender e enviar mais informações via e-mail?\nDigite (1) para Confirmar e (2) para Cancelar: ", produtoEncontrado.getNome(),produtoEncontrado.getPreco());
							opc = leia.nextInt();
						}while(opc < 0 && opc > 1);
						
						if (opc == 1){
							email = "";
							while(!email.contains("@")){
								System.out.print("\nPara continuar digite um e-mail válido: ");
								leia.skip("\\R?");
								email = leia.nextLine();
							}
							// Implementar futuramente cadastro de cliente, carrinho e formas de pagamento !
							System.out.printf("\nObrigado, você o endereço de e-mail %s receberá em instantes mais informações sobre a compra e seu produto! \n\n", email);
						}
					}else
						System.out.printf("Produto não encontrado !");
					
					break;
				default:
					System.out.println(Cores.TEXT_WHITE + "\nOpção Inválida\n");
					break;
			}
        }
	}
}