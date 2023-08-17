package ProjetoGuia.conta;

import java.io.IOException;

import java.util.Scanner;

import ProjetoGuia.conta.controller.ContaController;
import ProjetoGuia.conta.model.ContaCorrente;
import ProjetoGuia.conta.model.ContaPoupanca;
import ProjetoGuia.conta.util.Cores;

public class Menu {
	public static void main(String[] args) {

		ContaController contas = new ContaController();
		
		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);

		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);

		ContaCorrente cp1 = new ContaCorrente(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);

		ContaCorrente cp2 = new ContaCorrente(contas.gerarNumero(), 126, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);

		contas.listarTodas();
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     "); 
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "\n Criar Conta\n");

					System.out.println("Digite o Numero da Agência: ");
					agencia = leia.nextInt();

					System.out.println("Digite o Nome do titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					do{
						System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = leia.nextFloat();

					switch(tipo) {
						case 1 -> {
							System.out.println("Digite o Limite de Crédito (R$): ");
							limite = leia.nextFloat();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
						}
						case 2 -> {
							System.out.println("Digite o dia do Aniversário da Conta: ");
							aniversario = leia.nextInt();
							contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
						}

					}
					
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "\n Listar todas as Contas\n");
					
					contas.listarTodas();

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "\n Consultar dados da Conta - por número\n");

					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					
					contas.procurarPorNumero(numero);

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "\n Atualizar dados da Conta\n");

					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();

					if (contas.buscarNaCollection(numero) != null) {
						System.out.println("Digite o Numero da Agência: ");
						agencia = leia.nextInt();

						System.out.println("Digite o Nome do titular: ");
						leia.skip("\\R?");
						titular = leia.nextLine();

						System.out.println("Digite o aldo da Conta (R$): ");
						saldo = leia.nextFloat();

						tipo = contas.retornaTipo(numero);

						switch(tipo){
							case 1 -> {
								System.out.println("Digite o Limite de Crédito (R$): ");
								limite = leia.nextFloat();
								contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
							}
							case 2 -> {
								System.out.println("Digite o Aniversário da Conta: ");
								aniversario = leia.nextInt();
								contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
							}

							default -> {
								System.out.println("Tipo de conta inválido!");
							}
						}

					} else
						System.out.println("Conta não encontrada !");
					
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "\n Apagar Conta\n");
					
					System.out.println("Digite o número da conta: ");
					numero = leia.nextInt();
					
					contas.deletar(numero);

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "\n Saque\n");
					
					System.out.println("Digite o Numero da Conta: ");
					numero = leia.nextInt();

					do {
						System.out.println("Digite o Valor do Saque (R$): ");
						valor = leia.nextFloat();
					} while(valor <= 0);

					contas.sacar(numero, valor);
					
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "\n Depósito\n");

					System.out.println("Digite o Numero da Conta: ");
					numero = leia.nextInt();

					do{
						System.out.println("Digite o Valor do Depósito (R$): ");
						valor = leia.nextFloat();
						
					} while(valor <= 0);

					contas.depositar(numero, valor);
					
					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE + "\n Transfeência entre Contas\n");
					
					System.out.println("Digite o Numero da Conta de Origem: ");
					numero = leia.nextInt();

					System.out.println("Digite o Numero da Conta de Destino: ");
					numeroDestino = leia.nextInt();

					do {
						System.out.println("Digite o Valor da Transferência (R$): ");
						valor = leia.nextFloat();
					} while(valor <= 0);

					contas.transferir(numero, numeroDestino, valor);

					break;
				default:
					System.out.println(Cores.TEXT_WHITE + "\nOpção Inválida\n");
					break;
			}
        }
	}

}