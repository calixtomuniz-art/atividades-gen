package ProjetoJava.ecommerce.repository;

import ProjetoJava.ecommerce.model.Produto;

public interface ProdutoRepository {

	// CRUD dos Produtos
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);
	
	// Métodos de Venda
	public void listarPorTipo(int tipo);

}