package ProjetoJava.ecommerce.model;

public class ProdutoServico extends Produto{

	private String descricao;

	public ProdutoServico(int numIdentificador, int tipo, String nome, float preco, String descricao) {
		super(numIdentificador, tipo, nome, preco);
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Descrição do Serviço: " + this.descricao);
	}

}